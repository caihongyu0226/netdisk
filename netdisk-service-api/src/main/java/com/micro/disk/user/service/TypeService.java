package com.micro.disk.user.service;

import com.micro.disk.user.bean.TypeBean;
import com.micro.disk.user.bean.TypeTree;

import java.util.List;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:38
 */
public interface TypeService {
    public void init();
    public List<TypeTree> findTrees();
    public List<TypeBean> findList();
}
