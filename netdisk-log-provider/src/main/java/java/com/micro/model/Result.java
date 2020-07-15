package java.com.micro.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 响应实体类
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:23
 */
@Data
public class Result implements Serializable {
    private Integer code;//响应编码（0成功,1失败）
    private String msg;//响应信息（如：添加成功）
    private Object data;//
}

