package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 文件夹
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:10
 */
@Data
public class FolderProp implements Serializable {
    private Integer filenum;
    private Integer foldernum;
    private Long totalsize;
    private String totalsizename;
}

