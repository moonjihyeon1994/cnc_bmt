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
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import static com.cnc.rating.config.SpringProfile.*;

@Slf4j
@Profile({DEV, TEST, PROD})
@RequiredArgsConstructor
@RestController
public class Controller {

    private final QueryService queryService;

    /**
     * 서비스 관리번호가 파라미터로 들어올 때
     *
     * @param service_mgmt_no 서비스 관리번호
     * @return
     */
    @GetMapping("/selectCDR/{service_mgmt_no}")
    public List<HashMap<String, Object>> selectCDR(
            @PathVariable String service_mgmt_no,
            @RequestParam(value = "startDate") String startDate,
            @RequestParam(value = "endDate") String endDate
    ) {
        if(startDate.length() != 14 || endDate.length() != 14) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);

        System.out.println("service_mgmt_no = " + service_mgmt_no + ", startDate = " + startDate + ", endDate = " + endDate);
        return queryService.selectCDR(service_mgmt_no, startDate, endDate);
    }

    @GetMapping("/test/{service_mgmt_no}")
    public List<HashMap<String, Object>> test(
            @PathVariable String service_mgmt_no,
            @RequestParam(value = "startDate") String startDate,
            @RequestParam(value = "endDate") String endDate
    ) {
        if(startDate.length() != 14 || endDate.length() != 14) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);

        System.out.println("service_mgmt_no = " + service_mgmt_no + ", startDate = " + startDate + ", endDate = " + endDate);
        return queryService.selectSub(service_mgmt_no, startDate, endDate);
    }

    @GetMapping("/selectCDR")
    public List<HashMap<String, Object>> selectCDRFromJson() throws IOException {
        ClassPathResource resource = new ClassPathResource("service-mgmt-no.json");
        HashMap<String, Object> object = (new ObjectMapper()).readValue(resource.getInputStream(), HashMap.class);
        return null;
    }
}
