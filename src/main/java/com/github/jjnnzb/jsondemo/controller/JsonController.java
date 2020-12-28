package com.github.jjnnzb.jsondemo.controller;

import com.github.jjnnzb.jsondemo.entity.ResponseBean;
import com.github.jjnnzb.jsondemo.entity.TimeBeanList;
import com.github.jjnnzb.jsondemo.service.JsonService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Jjn
 * @date 2020-12-28 9:29
 */
@RestController
@CrossOrigin
public class JsonController {

    @Resource
    private JsonService jsonService;

    @PostMapping(value = "/api/v1/json/analyse")
    public ResponseBean<Integer> analyseJson(@RequestBody TimeBeanList timeBeanList) {
        return ResponseBean.success(jsonService.analyseSize(timeBeanList));
    }

    @GetMapping(value = "/api/v1/json/generate")
    public ResponseBean<TimeBeanList> generateJson() {
        return ResponseBean.success(jsonService.generateTimeBeanList());
    }

    @PostMapping(value = "/api/v1/json/process")
    public ResponseBean<TimeBeanList> processJson(@RequestBody TimeBeanList timeBeanList) {
        return ResponseBean.success(jsonService.processTimeBeanList(timeBeanList));
    }
}
