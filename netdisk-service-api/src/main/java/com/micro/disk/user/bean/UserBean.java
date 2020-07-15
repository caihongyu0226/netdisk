package com.micro.disk.user.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 9:58
 */
@Data
public class UserBean implements Serializable {
    private String id;
    private String nickname;
    private String username;
}

