package com.micro.disk.service;

import com.micro.disk.bean.Md5Bean;
import com.micro.disk.bean.PageInfo;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:34
 */
public interface Md5Service {
    public PageInfo<Md5Bean> findList(Integer page, Integer limit, String filename, String md5);
}
