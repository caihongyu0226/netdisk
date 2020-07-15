package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 日志
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:11
 */
@Data
public class LogBean implements Serializable {
    private String id;
    private String requestid;//请求id
    private String requestip;//请求地址
    private String username;

    private String projectname;//工程名
    private String targetmethod;//目标方法
    private String targetparams;//目标参数
    private String starttime;//开始时间
    private String endtime;//结束时间
    private Long comsumetime;//耗时
    private String returnresult;//返回结果
    private String executeresult;//执行结果
    ////////////////////
    private String olddata;
    private String type;//0-controller,1-service
}

