package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 文件分类（比如：文档、图片、视频、音乐、其他）---每种分类对应的具体格式
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:20
 */
@Data
public class TypeSuffixBean implements Serializable {
    private String id;
    private String typeid;
    private String typecode;
    private String name;
    private String icon;//转换base64
    private String iconbig;//转换base64
    private String suffix;
    private String componentname;
}

