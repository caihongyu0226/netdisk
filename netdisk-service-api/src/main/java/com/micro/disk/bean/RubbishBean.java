package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:16
 */
@Data
public class RubbishBean implements Serializable {
    private String id;
    private String fileicon;
    private String filename;
    private String filesize;
    private String deletetime;
    private String remainday;
}

