package com.micro.disk.user.service;

import com.micro.disk.user.bean.NoticeBean;
import com.micro.disk.user.bean.PageInfo;

import java.util.List;

/**
 * 通知服务
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:35
 */
public interface NoticeService {

    public PageInfo<NoticeBean> findList(Integer page, Integer limit, String userid);
    public void updateReadStatus(String userid);
    public void delete(String userid);

    public List<NoticeBean> findNotices(String userid);
    public int findNoticesCount(String userid);
}

