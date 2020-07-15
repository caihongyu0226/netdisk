package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:18
 */
@Data
public class ShareFriendsBean implements Serializable {
    private String userid;
    private String username;

    private String zcstatus;//转存状态
    private String zctime;//转存时间
}
