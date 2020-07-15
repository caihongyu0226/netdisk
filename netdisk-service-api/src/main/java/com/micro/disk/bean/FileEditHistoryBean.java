package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:08
 */
@Data
public class FileEditHistoryBean implements Serializable {
    private String id;
    private String fileid;
    private String editusername;//
    private String edittime;
    private String filemd5;
    private String prevfilemd5;
}
