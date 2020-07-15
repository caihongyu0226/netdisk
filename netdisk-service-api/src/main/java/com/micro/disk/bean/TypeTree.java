package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:20
 */
@Data
public class TypeTree implements Serializable {
    private String code;
    private String label;
    private List<TypeTree> children=new ArrayList<TypeTree>();
}
