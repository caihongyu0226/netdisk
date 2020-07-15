package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:05
 */
@Data
public class AppFileBean implements Serializable {
    private String id;
    private String appname;
    private String appid;
    private String businessid;
    private String businesstype;
    private String fileicon;//文件图标
    private String filename;
    private long filesize;//文件大小
    private String filesuffix;//文件后缀
    private String typecode;
    private String filemd5;
    private String createuserid;
    private String createusername;
    private String createtime;
    private Integer isbreak;//0正常,1为损坏
}
