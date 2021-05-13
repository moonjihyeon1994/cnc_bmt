package com.cnc.rating.service;

import com.cnc.rating.repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static com.cnc.rating.config.SpringProfile.*;

@Slf4j
@Profile({DEV, TEST, PROD})
@RequiredArgsConstructor
@Service
public class QueryService {

    private final RatingRepository ratingRepository;

    /**
     * SQL 1번
     * CDR 조회
     *
     *
     * @param service_mgmt_no 서비스 관리 번호
     * @param startDate 시작
     * @param endDate 끝
     * @return
     */
    public List<HashMap<String, Object>> selectCDR(String service_mgmt_no, String startDate, String endDate) {
        int shardNumber = getShardNumber(service_mgmt_no);
        long startTime = System.currentTimeMillis();

//        log.info("shard number : {}", service_mgmt_no);
        List<HashMap<String, Object>> result = ratingRepository.selectCDR(service_mgmt_no, shardNumber, startDate, endDate);
        long endTime = System.currentTimeMillis();
//        log.info("serviceNumber : {}, shardNumber : {}, duration : {}", service_mgmt_no, shardNumber, endTime - startTime);
        return result;
    }

    public List<HashMap<String, Object>> selectSub(String service_mgmt_no, String startDate, String endDate) {
        int shardNumber = getShardNumber(service_mgmt_no);
        String startTime = startDate.substring(0,8);
        String endTime = endDate.substring(0,8);
        int startMonth = Integer.parseInt(startDate.substring(0,6));
        int endMonth = Integer.parseInt(endDate.substring(0,6));
        int idx = 0;

        System.out.println("startTime = " + startTime + "endTime = " + endTime +
                "startMonth = " + startMonth + "endMonth = " + endMonth);

        String[] tableList = new String[endMonth - startMonth + 1];
        for (int month = startMonth; month <= endMonth; month++) {
            tableList[idx++] = "evdo_rated_cdr_" + month;
        }

        HashMap<String, Object> params = new HashMap<>();
        params.put("service_mgmt_no", service_mgmt_no);
        params.put("tables", tableList);
        params.put("startDate", startDate);
        params.put("endDate", endDate);
        params.put("startTime", startTime);
        params.put("endTime", endTime);
        List<HashMap<String, Object>> result = ratingRepository.selectSub(shardNumber, params);
        return result;
    }

    public List<HashMap<String, Object>> selectTest(String service_mgmt_no) {
        return ratingRepository.selectTest(this.getShardNumber(service_mgmt_no));
    }

    private int getShardNumber(String key) {
        return key.charAt(key.length() - 1) - '0';
    }
}
