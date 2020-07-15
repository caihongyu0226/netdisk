package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 9:59
 */
@Data
public class UserCapacityBean implements Serializable {
    private String id;
    private String userid;

    private Long totalcapacity;
    private String totalcapacityname;

    private Long usedcapacity;
    private String usedcapacityname;
}

