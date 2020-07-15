package com.micro.disk.user.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 9:10
 */

@Data
public class Page<T> implements Serializable {
    //状态
    private Integer code;
    private String msg;

    //返回数据
    private List<T> rows;//记录列表
    private long totalPage;//总页数
    private long totalElements;//总记录数

    private Integer page;
    private Integer limit;
}
