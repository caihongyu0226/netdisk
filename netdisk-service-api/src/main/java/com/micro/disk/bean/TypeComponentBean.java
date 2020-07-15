package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:19
 */
@Data
public class TypeComponentBean implements Serializable {
    private String id;
    private String code;
    private String name;
    private String remark;
    private String createuserid;
    private String createusername;
    private String createtime;
}
