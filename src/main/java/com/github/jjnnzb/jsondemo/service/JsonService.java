package com.github.jjnnzb.jsondemo.service;

import com.github.jjnnzb.jsondemo.entity.TimeBeanList;

/**
 * @author Jjn
 * @date 2020-12-28 9:53
 */
public interface JsonService {
    /**
     * Get size of time bean list.
     *
     * @param timeBeanList time bean list
     * @return int
     */
    int analyseSize(TimeBeanList timeBeanList);

    /**
     * Generate time bean list.
     *
     * @return time bean list
     */
    TimeBeanList generateTimeBeanList();

    /**
     * Process timeBeanList.
     *
     * @param timeBeanList timeBeanList
     * @return the processed timeBeanList
     */
    TimeBeanList processTimeBeanList(TimeBeanList timeBeanList);
}
