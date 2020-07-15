package java.com.micro.service;

import java.com.micro.model.LogProject;
import java.util.List;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:50
 */
public interface LogProjectService {
    public List<LogProject> findList();
}
