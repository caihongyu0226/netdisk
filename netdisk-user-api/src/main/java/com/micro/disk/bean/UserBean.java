package com.micro.disk.bean;

import java.io.Serializable;

import lombok.Data;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 9:10
 */

@Data
public class UserBean implements Serializable {
    private String id;
    private String nickname;
    private String username;
    private String telephone;
}
