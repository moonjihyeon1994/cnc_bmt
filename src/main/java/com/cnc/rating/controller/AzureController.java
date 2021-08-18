package com.cnc.rating.controller;

import com.cnc.rating.service.AzureQueryService;
import com.cnc.rating.service.QueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static com.cnc.rating.config.SpringProfile.*;

@Slf4j
@Profile({AZURE, AZURE_DIRECT})
@RequiredArgsConstructor
@RestController
public class AzureController {

    private final AzureQueryService queryService;
    public static long shardNum = 0;

    /**
     * 서비스 관리번호가 파라미터로 들어올 때
     *
     * @param service_mgmt_no 서비스 관리번호
     * @return
     */
    @GetMapping("/selectCDR/{service_mgmt_no}")
    public List<HashMap<String, Object>> selectCDR(
            @PathVariable long service_mgmt_no,
            @RequestParam(value = "startDateTime") String startDateTime,
            @RequestParam(value = "endDateTime") String endDateTime
    ) throws ParseException {
        if (startDateTime.length() != 15 || endDateTime.length() != 15)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        return queryService.selectCDR(service_mgmt_no, startDateTime, endDateTime);
    }

    /**
     * 당일 조회 + 기간 조회
     *
     * @param currentDate 현재날짜
     * @param rangeMonth  숫자 0부터 시작 0이면 현재 달만 포함, 1이면 다음달
     * @return
     * @throws ParseException
     */
    @GetMapping("/selectCDR")
    public boolean selectCDRByMonth(
            @RequestParam(value = "currentDate") String currentDate,
            @RequestParam(value = "rangeMonth") int rangeMonth,
            @RequestParam(value = "startNumber") int startNumber
    ) throws ParseException {
        if (rangeMonth > 12) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        long base_num = 7000000000L + startNumber;
        long service_mgmt_no = base_num + shardNum++;

        long boundedRandomValue = ThreadLocalRandom.current().nextLong(7000000000L, 7000100000L);

        List<HashMap<String, Object>> result = queryService.selectCDRByMonth(boundedRandomValue, currentDate, rangeMonth);
        return true;
    }

    /**
     * 기간 조회
     *
     * @param rangeMonth  숫자 0부터 시작 0이면 현재 달만 포함, 1이면 다음달
     * @return
     * @throws ParseException
     */
    @GetMapping("/selectOnlyService")
    public boolean selectOnlyService(
            @RequestParam(value = "rangeMonth") int rangeMonth,
            @RequestParam(value = "startNumber") int startNumber
    ) throws ParseException {
        if (rangeMonth > 12) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
//        long base_num = 7000000000L + startNumber;
//        long service_mgmt_no = base_num + shardNum++;

        long boundedRandomValue = ThreadLocalRandom.current().nextLong(0, 7002799900L);

        List<HashMap<String, Object>> result = queryService.selectOnlyService(boundedRandomValue, rangeMonth);
        return true;
    }

    /**
     * 직접 접속
     *
     * @return
     * @throws ParseException
     */
    @GetMapping("/selectCDRDirect")
    public boolean selectCDRDirect(
            @RequestParam(value = "currentDate") String currentDate,
            @RequestParam(value = "rangeMonth") int rangeMonth,
            @RequestParam(value = "startNumber") int startNumber
    ) throws ParseException {
        if (rangeMonth > 12) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        long base_num = 7000000000L + startNumber;
        long service_mgmt_no = base_num + shardNum++;
        // 샤드 검색
        long boundedRandomValue = ThreadLocalRandom.current().nextLong(7000000000L, 7000100000L);
        List<HashMap<String, Object>> result = queryService.selectCDRDirect(boundedRandomValue, currentDate, rangeMonth);

        return true;
    }

    @GetMapping("/selectCdrNew")
    public boolean selectTest(@RequestParam(value = "rangeMonth") int rangeMonth) throws ParseException {
        if (rangeMonth > 12) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        long boundedRandomValue = ThreadLocalRandom.current().nextLong(0, 7002799900L);
        queryService.test(boundedRandomValue, rangeMonth);
        return true;
    }
}