package com.micro.disk.user.service;

import com.micro.disk.user.bean.PageInfo;
import com.micro.disk.user.bean.SearchBean;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:36
 */
public interface SearchService {
    /**
     * 个人用户查询自己数据的
     * @param filename
     * @param userid
     * @param page
     * @param limit
     * @return
     */
    public PageInfo<SearchBean> search(String filename, String userid, Integer page, Integer limit);
}

