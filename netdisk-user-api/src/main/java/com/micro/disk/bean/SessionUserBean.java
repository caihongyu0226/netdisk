package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 9:10
 */
@Data
public class SessionUserBean implements Serializable {
    private String id;
    private String nickname;
    private String username;
    private String telephone;
    private String token;
}
