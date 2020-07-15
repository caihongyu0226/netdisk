package java.com.micro.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:58
 */
@Data
public class User implements Serializable {
    private String id;
    private String nickname;
    private String username;
    private String telephone;
    private String roleid;
    private String rolename;
    private String positionname;
    private String createtimes;

    private String totalcapacity;
    private String usedcapacity;
}
