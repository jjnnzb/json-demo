package com.github.jjnnzb.jsondemo.entity;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Jjn
 * @date 2020-12-28 9:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "Time list bean.")
public class TimeBeanList {
    private List<TimeBean> dataList;
}
