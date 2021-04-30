package com.cnc.rating.controller;

import com.cnc.rating.repository.PostRepo;
import com.cnc.rating.service.QueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class Controller {

    private final PostRepo postRepo;
    private final QueryService queryService;

    @GetMapping("/1")
    public List<HashMap<String, Object>> getPost1() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        int shardNumber = 1;
        String serviceNumber = "asdf11";
        Thread.sleep(500);
        long endTime = System.currentTimeMillis();
        log.info("serviceNumber : {}, shardNumber : {}, duration : {}", serviceNumber, shardNumber, endTime - startTime);
        return postRepo.getAllPost_Client1();
    }

    @GetMapping("/2")
    public List<HashMap<String, Object>> getPost2() {
        return postRepo.getAllPost_Client2();
    }

    @GetMapping("/selectCDR")
    public List<HashMap<String, Object>> selectCDR() {
        return queryService.selectCDR("123124124");
    }

    @GetMapping("/deleteEVDO")
    public List<HashMap<String, Object>> deleteEVDO() {
        return queryService.deleteEVDO("123124124");
    }

    @GetMapping("/updateEVDO")
    public List<HashMap<String, Object>> updateEVDO() {
        return queryService.updateEVDO("123124124");
    }

    @GetMapping("/insertEVDO")
    public List<HashMap<String, Object>> insertEVDO() {
        return queryService.insertEVDO("123124124");
    }
}
