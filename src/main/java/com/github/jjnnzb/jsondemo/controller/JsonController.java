package com.github.jjnnzb.jsondemo.controller;

import com.github.jjnnzb.jsondemo.entity.ResponseBean;
import com.github.jjnnzb.jsondemo.entity.TimeBeanList;
import com.github.jjnnzb.jsondemo.service.JsonService;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation(value = "Analyse json")
    @PostMapping(value = "/api/v1/json/analyse")
    public ResponseBean<Integer> analyseJson(@RequestBody TimeBeanList timeBeanList) {
        return ResponseBean.success(jsonService.analyseSize(timeBeanList));
    }

    @ApiOperation(value = "Generate json")
    @GetMapping(value = "/api/v1/json/generate")
    public ResponseBean<TimeBeanList> generateJson() {
        return ResponseBean.success(jsonService.generateTimeBeanList());
    }

    @ApiOperation(value = "Process json")
    @PostMapping(value = "/api/v1/json/process")
    public ResponseBean<TimeBeanList> processJson(@RequestBody TimeBeanList timeBeanList) {
        return ResponseBean.success(jsonService.processTimeBeanList(timeBeanList));
    }
}
