package java.com.micro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.com.micro.model.LogInfo;
import java.util.List;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:25
 */
public interface LogInfoDao extends JpaRepository<LogInfo,String>, JpaSpecificationExecutor<LogInfo> {
    @Query("select t from LogInfo t where traceid = ?1 order by starttime asc")  //占位符?1
    public List<LogInfo> findListByTraceid(String traceid);
}
