package com.cnc.rating.controller;

import com.cnc.rating.service.QueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class Controller {

    private final QueryService queryService;

    @GetMapping("/selectCDR/{service_mgmt_no}")
    public List<HashMap<String, Object>> selectCDR(@PathVariable String service_mgmt_no) {
//        log.info("input param : {}", service_mgmt_no);
        return queryService.selectCDR(service_mgmt_no);
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
