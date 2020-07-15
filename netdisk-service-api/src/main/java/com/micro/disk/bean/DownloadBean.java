package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:07
 */
@Data
public class DownloadBean implements Serializable {
    private Integer filenum;
    private Integer foldernum;
    private Long totalsize;
    private String totalsizename;
    private Integer isbig;
}
