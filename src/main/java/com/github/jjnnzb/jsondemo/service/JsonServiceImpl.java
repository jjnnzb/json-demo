package com.github.jjnnzb.jsondemo.service;

import com.github.jjnnzb.jsondemo.entity.TimeBean;
import com.github.jjnnzb.jsondemo.entity.TimeBeanList;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * @author Jjn
 * @date 2020-12-28 9:55
 */
@Service
public class JsonServiceImpl implements JsonService {
    @Override
    public int analyseSize(TimeBeanList timeBeanList) {
        List<TimeBean> dataList = timeBeanList.getDataList();
        int size = 0;
        if (dataList != null) {
            size = dataList.size();
        }
        return size;
    }

    @Override
    public TimeBeanList generateTimeBeanList() {
        TimeBean timeBean = new TimeBean();
        timeBean.setDate(LocalDate.now());
        timeBean.setTime(LocalTime.now());
        TimeBean anotherBean = new TimeBean();
        anotherBean.setTime(LocalTime.now());
        anotherBean.setDate(LocalDate.now().minusDays(1));
        TimeBeanList timeBeanList = new TimeBeanList();
        timeBeanList.setDataList(Lists.newArrayList(timeBean, anotherBean));
        return timeBeanList;
    }

    @Override
    public TimeBeanList processTimeBeanList(TimeBeanList timeBeanList) {
        if (timeBeanList == null) {
            return new TimeBeanList();
        }
        List<TimeBean> dataList = timeBeanList.getDataList();
        if (dataList != null) {
            dataList.forEach(timeBean -> timeBean.setDate(LocalDate.now()));
        }
        return timeBeanList;
    }
}
