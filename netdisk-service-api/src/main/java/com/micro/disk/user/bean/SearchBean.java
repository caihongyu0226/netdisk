package com.micro.disk.user.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 搜索
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:17
 */
@Data
public class SearchBean implements Serializable {
    private String id;
    private String filename;//查询关键字
    private String pid;
    private String pname;

    private String filemd5;
    private String fileicon;
    private String typecode;
    private String filesuffix;
    private String filesize;
    private String filetype;//0文件夹，1文件

    private String createuserid;
    private String createusername;
    private String createtime;
}

