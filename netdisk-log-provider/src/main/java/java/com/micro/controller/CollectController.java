package java.com.micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.com.micro.model.LogInfo;
import java.com.micro.service.LogService;

/**
 * 日志采集
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:51
 */
@RestController
@RequestMapping("/log/collect")
public class CollectController {
    @Autowired
    private LogService logService;

    @RequestMapping("/collectLog")
    public void collectLog(LogInfo bean){
        logService.save(bean);
    }
}

