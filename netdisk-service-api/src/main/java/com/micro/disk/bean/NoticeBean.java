package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 通知
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:14
 */
@Data
public class NoticeBean implements Serializable {
    private String id;
    private String type;//通知类型
    private String typename;
    private String content;//通知内容
    private String userid;
    private String username;
    private String createtime;
    private String status;//0未阅读，1已阅读
    private String readtime;//阅读时间
}

