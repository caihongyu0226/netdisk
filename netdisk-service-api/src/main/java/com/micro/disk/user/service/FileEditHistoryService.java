package com.micro.disk.user.service;

import com.micro.disk.user.bean.FileEditHistoryBean;
import com.micro.disk.user.bean.PageInfo;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:32
 */
public interface FileEditHistoryService {

    public PageInfo<FileEditHistoryBean> findList(Integer page, Integer limit, String fileid);
}
