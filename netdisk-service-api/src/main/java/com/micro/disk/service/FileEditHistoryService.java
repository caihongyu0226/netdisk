package com.micro.disk.service;

import com.micro.disk.bean.FileEditHistoryBean;
import com.micro.disk.bean.PageInfo;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:32
 */
public interface FileEditHistoryService {

    public PageInfo<FileEditHistoryBean> findList(Integer page, Integer limit, String fileid);
}
