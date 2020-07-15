package com.micro.disk.user.service;

import com.micro.disk.user.bean.PageInfo;
import com.micro.disk.user.bean.RubbishBean;

import java.util.List;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:35
 */
public interface RubbishService {
    public PageInfo<RubbishBean> findPageList(Integer page, Integer limit, String userid);
    public void delete(List<String> ids, String userid);
    public void recover(String folderid,List<String> ids,String userid,String username);
}

