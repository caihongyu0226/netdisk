package com.micro.disk.user.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 文件
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:07
 */
@Data
public class FileBean implements Serializable {
    private String id;
    private String pid;
    private String pname;

    private String filename;
    private String filesize;
    private String filesuffix;
    private String fileicon;//base64
    private String typecode;//document/picture/video/music/other
    private String filemd5;
    private Integer filetype;//0文件夹，1文件
    private String createuserid;
    private String createusername;
    private String createtime;

    //////////////////////////////////图片的扩展属性///////////////////////////////////////////
    private String thumbnailurl;//图片属性：缩略图
    private String imgsize;//图片属性：尺寸
}

