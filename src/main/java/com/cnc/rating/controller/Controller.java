package com.cnc.rating.controller;

import com.cnc.rating.service.QueryService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;

@Slf4j
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
    public List<HashMap<String, Object>> selectCDR(@PathVariable String service_mgmt_no) {
        return queryService.selectCDR(service_mgmt_no);
    }

    @GetMapping("/selectCDR")
    public List<HashMap<String, Object>> selectCDRFromJson() throws IOException {
        ClassPathResource resource = new ClassPathResource("service-mgmt-no.json");
        System.out.println(resource.getPath());
        HashMap<String, Object> object = (new ObjectMapper()).readValue(resource.getInputStream(), HashMap.class);
        System.out.println(object);
        return null;
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

    @GetMapping("/test/{service_mgmt_no}")
    List<HashMap<String, Object>> selectTest(@PathVariable String service_mgmt_no) {
        log.info("service_mgmt_no = " + service_mgmt_no);
        return queryService.selectTest(service_mgmt_no);
    }
}
