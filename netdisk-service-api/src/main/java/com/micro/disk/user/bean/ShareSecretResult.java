package com.micro.disk.user.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 10:19
 */
@Data
public class ShareSecretResult implements Serializable {
    private String url;
    private String code;
}
