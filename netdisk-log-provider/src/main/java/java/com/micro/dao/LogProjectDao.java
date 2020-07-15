package java.com.micro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.com.micro.model.LogProject;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:36
 */
public interface LogProjectDao extends JpaRepository<LogProject, String>, JpaSpecificationExecutor<LogProject> {

}

