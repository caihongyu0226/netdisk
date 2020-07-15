package com.micro.disk.user.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:00
 */
@Data
public class UserCapacityHistoryBean implements Serializable {
    private String capacity;
    private String leftcapacity;
    private String username;
    private String createtime;
    private String remark;
}
