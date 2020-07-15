package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 分析日志
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:04
 */
@Data
public class AnalyLogBean implements Serializable {
    private String name;
    private String analytime;
    private String analycondition;
    private Long requestcount;
    private Long successcount;
    private Long errorcount;
    private Double avgtime;
    private Long maxtime;
    private Long mintime;
}

