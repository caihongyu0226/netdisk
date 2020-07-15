package com.micro.disk.user.service;

import com.micro.disk.user.bean.TypeComponentBean;

import java.util.List;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:38
 */
public interface TypeComponentService {
    public List<TypeComponentBean> findList();
    public TypeComponentBean findOne(String id);
    public void save(TypeComponentBean bean);
    public void update(TypeComponentBean bean);
    public void delete(String id);
}
