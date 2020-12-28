package com.github.jjnnzb.jsondemo.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author Jjn
 * @date 2020-12-28 9:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeBean {

    @JsonFormat(pattern = "yyyy-MM-dd")
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @JsonFormat(pattern = "HH:mm:ss")
//    @DateTimeFormat(pattern = "HH:mm:ss")
    private LocalTime localTime;
}
