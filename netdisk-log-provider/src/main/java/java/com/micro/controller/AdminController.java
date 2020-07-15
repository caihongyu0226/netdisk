package java.com.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.com.micro.model.LogInfo;
import java.com.micro.model.PageInfo;
import java.com.micro.model.Result;
import java.com.micro.model.ResultUtils;
import java.com.micro.service.LogProjectService;
import java.com.micro.service.LogService;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:50
 */
@RestController
@RequestMapping("/log/admin")
public class AdminController {
    @Autowired
    private LogService logService;
    @Autowired
    private LogProjectService logProjectService;

    /**
     * 日志列表
     * @param pi
     * @param projectname
     * @param targetmethod
     * @param username
     * @param starttime
     * @param endtime
     * @param orderfield
     * @param ordertype
     * @return
     */
    @RequestMapping("/findList")
    public PageInfo<LogInfo> findList(PageInfo<LogInfo> pi, String projectname, String targetmethod, String username, String starttime, String endtime, String orderfield, String ordertype){
        return logService.findList(pi.getPage(), pi.getLimit(), projectname, targetmethod, username, starttime, endtime, orderfield, ordertype);
    }

    /**
     * 获取项目列表
     * @return
     */
    @RequestMapping("/findProject")
    public Result findProject(){
        try{

            return ResultUtils.success("查询成功",logProjectService.findList());
        }catch(Exception e){
            return ResultUtils.error(e.getMessage());
        }
    }

    /**
     * 日志详情
     * @param traceid
     * @return
     */
    @RequestMapping("/findDetail")
    public Result findDetail(String traceid){
        try{
            return ResultUtils.success("查询成功", logService.findLogDetail(traceid));
        }catch(Exception e){
            return ResultUtils.error(e.getMessage());
        }
    }
}

