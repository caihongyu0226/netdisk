package com.micro.disk.user.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹树
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:10
 */
@Data
public class FolderTree implements Serializable {
    private String id;
    private String label;
    private boolean isLeaf;
    private List<FolderTree> children=new ArrayList<FolderTree>();
}
