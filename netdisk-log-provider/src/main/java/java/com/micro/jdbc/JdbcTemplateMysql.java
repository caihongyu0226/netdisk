package java.com.micro.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.com.micro.model.PageInfo;
import java.util.List;
import java.util.Map;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:38
 */
@Component
public class JdbcTemplateMysql implements IJdbcTemplate{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void update(String sql, Object[] args) {
        jdbcTemplate.update(sql, args);
    }

    @Override
    public Integer findCount(String sql, Object[] args) {
        return jdbcTemplate.queryForObject(sql, args, Integer.class);
    }

    @Override
    public Map<String, Object> findOne(String sql, Object[] args) {
        //sql=sql(sql);
        return jdbcTemplate.queryForMap(sql, args);
    }

    @Override
    public List<Map<String, Object>> findList(String sql, Object[] args) {
        //sql=sql(sql);
        return jdbcTemplate.queryForList(sql, args);
    }

    @Override
    public PageInfo<Map<String, Object>> findPageList(String sql, Object[] args, Integer page, Integer limit) {
        page=page==null?1:page;       //为空默认为1  不为空根据传进来的值
        limit=limit==null?10:limit;   //为空默认为10  不为空根据传进来的值

        //sql=sql(sql);
        int first=(page-1)*limit;
        String sqlList="SELECT t.*  FROM ("+sql+") as t limit "+first+","+limit+" ";//集合
        String sqlCount="select count(1) from ("+sql+") as t";//数量

        List<Map<String,Object>> lists=jdbcTemplate.queryForList(sqlList, args);
        Integer count=jdbcTemplate.queryForObject(sqlCount, Integer.class, args);

        int pageCount=(count%limit==0)?(count/limit):(count/limit+1);
        PageInfo<Map<String,Object>> pageInfo=new PageInfo<Map<String,Object>>();

        //自定义分页
        pageInfo.setRows(lists);
        pageInfo.setTotalElements(count);
        pageInfo.setTotalPage(pageCount);

        return pageInfo;
    }
    private static String sql(String sql){
        sql=sql.replaceAll("dateformat\\(","date_format\\(");
        String regex="date_format(([^).]*))";
        sql=sql.replaceAll(regex,"date_format$1,'%Y-%m-%d %H:%i:%S'");
        return sql;
    }
}

