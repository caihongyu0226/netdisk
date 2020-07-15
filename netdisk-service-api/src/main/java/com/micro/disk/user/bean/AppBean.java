package com.micro.disk.user.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:04
 */
@Data
public class AppBean implements Serializable {
    private String id;
    private String appname;
    private String appdesc;
    private String createuserid;
    private String createusername;
    private String createtime;
    private Integer delstatus;//删除状态
}
