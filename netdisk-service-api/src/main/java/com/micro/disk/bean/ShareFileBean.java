package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:18
 */
@Data
public class ShareFileBean implements Serializable {
    private String id;
    private String filename;
    private String fileicon;
    private String filesize;
    private Integer filetype;//0文件夹，1文件
    private String createtime;
}

