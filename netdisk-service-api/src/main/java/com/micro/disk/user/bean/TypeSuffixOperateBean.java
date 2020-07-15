package com.micro.disk.user.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:20
 */
@Data
public class TypeSuffixOperateBean implements Serializable {
    private String componentcode;//组件名称
    private String componentname;
}
