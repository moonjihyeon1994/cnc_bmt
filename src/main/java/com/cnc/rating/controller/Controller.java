package com.cnc.rating.controller;

import com.cnc.rating.service.QueryService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static com.cnc.rating.config.SpringProfile.*;

@Slf4j
@Profile({DEV, TEST, PROD})
@RequiredArgsConstructor
@RestController
public class Controller {

    private final QueryService queryService;

    /**
     * 서비스 관리번호가 파라미터로 들어올 때
     * @param service_mgmt_no 서비스 관리번호
     * @return
     */
    @GetMapping("/selectCDR/{service_mgmt_no}")
    public List<HashMap<String, Object>> selectCDR(
            @PathVariable String service_mgmt_no,
            @RequestParam(value = "startDateTime") String startDateTime,
            @RequestParam(value = "endDateTime") String endDateTime
    ) throws ParseException {
        if (startDateTime.length() != 14 || endDateTime.length() != 14)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        return queryService.selectCDR(service_mgmt_no, startDateTime, endDateTime);
    }

    /**
     * 당일 조회 + 기간 조회
     * @param currentDate     현재날짜
     * @param rangeMonth      숫자 0부터 시작 0이면 현재 달만 포함, 1이면 다음달
     * @return
     * @throws ParseException
     */
    @GetMapping("/selectCDR")
    public List<HashMap<String, Object>> selectCDRByMonth(
            @RequestParam(value = "currentDate") String currentDate,
            @RequestParam(value = "rangeMonth") int rangeMonth
    ) throws ParseException {
        long random_number_10_digit = (long) ((Math.random() * 9000000000L) + 1000000000L);
        String service_mgmt_no = String.valueOf(random_number_10_digit);

        return queryService.selectCDRByMonth(service_mgmt_no, currentDate, rangeMonth);
    }

//    @GetMapping("/selectCDR")
//    public List<HashMap<String, Object>> selectCDRFromJson() throws IOException {
//        ClassPathResource resource = new ClassPathResource("service-mgmt-no.json");
//        HashMap<String, Object> object = (new ObjectMapper()).readValue(resource.getInputStream(), HashMap.class);
//        return null;
//    }
    /**
     * long random_number_10_digit = (long) ((Math.random() * 9000000000L) + 1000000000L);
     *         long random_number_6_digit_1 = (long) ((Math.random() * 900000L) + 100000L);
     *         long random_number_6_digit_2 = (long) ((Math.random() * 900000L) + 100000L);
     * //        202005_000000<=   < 202106_000000
     * //        System.out.println((long) (Math.random() * (end_date - start_date + 1)) + start_date);
     *
     *         int idx = ThreadLocalRandom.current().nextInt(0, targetMonth.length);
     *         int next_idx = ThreadLocalRandom.current().nextInt(idx+1, targetMonth.length);
     *         String service_mgmt_no = String.valueOf(random_number_10_digit);
     *         String startDateTime = targetMonth[idx] + String.valueOf(random_number_6_digit_1);
     *         String endDateTime = targetMonth[next_idx] + String.valueOf(random_number_6_digit_2);
     */
}
