package java.com.micro.service;

import java.com.micro.model.LogInfo;
import java.com.micro.model.PageInfo;
import java.util.List;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:48
 */
public interface LogService {
    /**
     * 日志追踪-分页列表
     * @param page
     * @param limit
     * @param projectname
     * @param targetmethod
     * @param username
     * @param starttime
     * @param endtime
     * @param orderfield
     * @param ordertype
     * @return
     */
    public PageInfo<LogInfo> findList(Integer page, Integer limit, String projectname, String targetmethod, String username, String starttime, String endtime, String orderfield, String ordertype);
    /**
     * 日志追踪-查看某个日志的链路
     * @param traceid
     * @return
     */
    public List<LogInfo> findLogDetail(String traceid);
    /**
     * 保存日志
     * @param bean
     */
    public void save(LogInfo bean);
}

