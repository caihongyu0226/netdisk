package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 文件分类（比如：文档、图片、视频、音乐、其他）
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:19
 */
@Data
public class TypeBean implements Serializable {
    private String id;
    private String code;
    private String name;
}
