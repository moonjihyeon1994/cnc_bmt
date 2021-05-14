package com.cnc.rating.service;

import com.cnc.rating.repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.cnc.rating.config.SpringProfile.*;

@Slf4j
@Profile({DEV, TEST, PROD})
@RequiredArgsConstructor
@Service
public class QueryService {

    private final RatingRepository ratingRepository;

    /**
     * CDR 조회
     *
     * @param service_mgmt_no 서비스 관리 번호
     * @param startDateTime   시작
     * @param endDateTime     끝
     * @return
     */
    public List<HashMap<String, Object>> selectCDR(long service_mgmt_no, String startDateTime, String endDateTime) throws ParseException {
        int shardNumber = getShardNumber(service_mgmt_no);
        String startDate = startDateTime.substring(0, 8);
        String endDate = endDateTime.substring(0, 8);
        String startMonth = startDateTime.substring(0, 6);
        String endMonth = endDateTime.substring(0, 6);

        DateFormat dateFormat = new SimpleDateFormat("yyyyMM");
        Calendar calendar = Calendar.getInstance();
        Date date = dateFormat.parse(startMonth);
        calendar.setTime(date);

        List<String> list = new ArrayList<>();
        while (!endMonth.equals(dateFormat.format(calendar.getTime()))) {
            list.add("evdo_rated_cdr_" + dateFormat.format(calendar.getTime()));
            calendar.add(Calendar.MONTH, 1);
        }
        list.add("evdo_rated_cdr_" + dateFormat.format(calendar.getTime()));

        HashMap<String, Object> params = new HashMap<>();
        params.put("service_mgmt_no", service_mgmt_no);
        params.put("tables", list.toArray(String[]::new));
        params.put("startDate", startDate);
        params.put("endDate", endDate);
        params.put("startDateTime", startDateTime);
        params.put("endDateTime", endDateTime);
        return ratingRepository.selectSub(shardNumber, params);
    }

    /**
     * @param service_mgmt_no 서비스 관리번호
     * @param currentDate     대상날짜
     * @param rangeMonth      범위
     * @return
     * @throws ParseException
     */
    public List<HashMap<String, Object>> selectCDRByMonth(long service_mgmt_no, String currentDate, int rangeMonth) throws ParseException {
        int shardNumber = getShardNumber(service_mgmt_no);

        DateFormat dateFormat = new SimpleDateFormat("yyyyMM");
        Calendar calendar = Calendar.getInstance();
        Date date = dateFormat.parse("202005");
        calendar.setTime(date);

        List<String> list = new ArrayList<>();
        list.add("online_evdo_rated_cdr_" + "05" + currentDate);
        for (int i = 0; i < rangeMonth; i++) {
            list.add("evdo_rated_cdr_" + dateFormat.format(calendar.getTime()));
            calendar.add(Calendar.MONTH, 1);
        }
        list.add("evdo_rated_cdr_" + dateFormat.format(calendar.getTime()));

        long currentTimeMillis = System.currentTimeMillis();

        HashMap<String, Object> params = new HashMap<>();
        params.put("service_mgmt_no", service_mgmt_no);
//        params.put("service_mgmt_no", "7000246698");
        params.put("tables", list.toArray(String[]::new));
        params.put("startDate", "202005");
        params.put("endDate", dateFormat.format(calendar.getTime()));
        params.put("startDateTime", "202005" + currentDate + "0000000");
        params.put("endDateTime", dateFormat.format(calendar.getTime()) + "999999999");
        List<HashMap<String, Object>> result = ratingRepository.selectSub(shardNumber, params);

        log.info("service_mgmt_no : {}, shard_no : {}, duration : {}, size : {} ", service_mgmt_no, shardNumber, System.currentTimeMillis() - currentTimeMillis, result.size());
        return result;
    }

    /**
     * 서비스 관리번호 -> 샤드 번호
     *
     * @param key 서비스 관리번호
     * @return
     */
    private int getShardNumber(long key) {
        return (int) ((key % 20) + 1);
    }

}
