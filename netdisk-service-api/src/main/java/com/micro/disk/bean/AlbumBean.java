package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 相册bean
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:01
 */
@Data
public class AlbumBean implements Serializable {
    private String id;
    private String albumname;
    private String albumdesc;
    private String coverurl;
    private String createtime;
    private String count;
}