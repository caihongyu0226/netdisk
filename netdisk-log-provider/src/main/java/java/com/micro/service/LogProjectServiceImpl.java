package java.com.micro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.com.micro.dao.LogProjectDao;
import java.com.micro.model.LogProject;
import java.util.List;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:50
 */
@Component
public class LogProjectServiceImpl implements LogProjectService{
    @Autowired
    private LogProjectDao logProjectDao;

    @Override
    public List<LogProject> findList() {
        return logProjectDao.findAll();
    }

}

