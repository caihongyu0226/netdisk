package java.com.micro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.com.micro.dao.LogInfoDao;
import java.com.micro.jdbc.LogInfoJdbc;
import java.com.micro.model.LogInfo;
import java.com.micro.model.PageInfo;
import java.util.List;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:48
 */
@Component
@Transactional
public class LogServiceImpl implements LogService{
    @Autowired
    private LogInfoJdbc logInfoJdbc;
    @Autowired
    private LogInfoDao logInfoDao;

    @Override
    public PageInfo<LogInfo> findList(Integer page, Integer limit, String projectname, String targetmethod,
                                      String username, String starttime, String endtime, String orderfield, String ordertype) {

        return logInfoJdbc.findList(page, limit, projectname, targetmethod, username, starttime, endtime, orderfield, ordertype);
    }

    @Override
    public List<LogInfo> findLogDetail(String traceid) {
        return logInfoDao.findListByTraceid(traceid);
    }

    @Override
    public void save(LogInfo bean) {
        logInfoDao.save(bean);
    }

}

