package com.micro.disk.user.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 9:58
 */
@Data
public class UserAppBean implements Serializable {
    private String id;

    private String appid;
    private String appname;

    private String userid;
}
