package com.cnc.rating.service;

import com.cnc.rating.repository.RatingRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class QueryService {

    private final RatingRepository ratingRepository;
    // 하나의 시간체크, 샤드넘버, 서비스관리번호

    /**
     * SQL 1번
     * CDR 조회
     *
     * @param service_mgmt_no 서비스 관리번호
     * @return
     */
    public List<HashMap<String, Object>> selectCDR(String service_mgmt_no) {
        int shardNumber = getShardNumber(service_mgmt_no);
        long startTime = System.currentTimeMillis();
        List<HashMap<String, Object>> result = ratingRepository.selectCDR(shardNumber);
        long endTime = System.currentTimeMillis();
        log.info("serviceNumber : {}, shardNumber : {}, duration : {}", service_mgmt_no, shardNumber, endTime - startTime);
        return result;
    }

    /**
     * SQL 2번
     * delete DVDO
     *
     * @param service_mgmt_no 서비스 관리번호
     * @return
     */
    public List<HashMap<String, Object>> deleteEVDO(String service_mgmt_no) {
        int shardNumber = getShardNumber(service_mgmt_no);
        long startTime = System.currentTimeMillis();
        List<HashMap<String, Object>> result = ratingRepository.deleteEVDO(shardNumber);
        long endTime = System.currentTimeMillis();
        log.info("serviceNumber : {}, shardNumber : {}, duration : {}", service_mgmt_no, shardNumber, endTime - startTime);
        return result;
    }

    /**
     * SQL 3번
     * update EVDO
     *
     * @param service_mgmt_no 서비스 관리번호
     * @return
     */
    public List<HashMap<String, Object>> updateEVDO(String service_mgmt_no) {
        int shardNumber = getShardNumber(service_mgmt_no);
        long startTime = System.currentTimeMillis();
        List<HashMap<String, Object>> result = ratingRepository.updateDVDO(shardNumber);
        long endTime = System.currentTimeMillis();
        log.info("serviceNumber : {}, shardNumber : {}, duration : {}", service_mgmt_no, shardNumber, endTime - startTime);
        return result;
    }

    /**
     * SQL 4번
     * insert EVDO
     *
     * @param service_mgmt_no 서비스 관리번호
     * @return
     */
    public List<HashMap<String, Object>> insertEVDO(String service_mgmt_no) {
        int shardNumber = getShardNumber(service_mgmt_no);
        long startTime = System.currentTimeMillis();
        List<HashMap<String, Object>> result = ratingRepository.insertEVDO(shardNumber);
        long endTime = System.currentTimeMillis();
        log.info("serviceNumber : {}, shardNumber : {}, duration : {}", service_mgmt_no, shardNumber, endTime - startTime);
        return result;
    }

    private int getShardNumber(String key) {
        return key.charAt(key.length() - 1) - '0';
    }
}
