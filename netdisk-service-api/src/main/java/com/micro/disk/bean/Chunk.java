package com.micro.disk.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:06
 */
@Data
public class Chunk implements Serializable {
    private String uuid; //uuid

    //WebUloader.js自动携带的参数
    private String id; //前端生成的文件ID
    private String name; //文件名称
    private Long size; //文件大小
    private Integer chunk; //切块序号
    private Integer chunks; //切块数量

    private byte[] bytes;
    private String userid;
    private String username;
}
