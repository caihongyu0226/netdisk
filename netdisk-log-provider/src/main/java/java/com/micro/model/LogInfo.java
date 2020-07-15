package java.com.micro.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:18
 */
@Table(
        name="log_info",
        indexes = {
                @Index(columnList = "traceid"),
                @Index(columnList = "userid")
        }
)
@Entity
@Data
public class LogInfo implements Serializable {
    @Id
    @GenericGenerator(name = "uuid",strategy = "uuid")
    @GeneratedValue(generator = "uuid")
    @Column(name="id",columnDefinition="VARCHAR(50)")
    private String id;

    @Column(name="traceid",columnDefinition="VARCHAR(50)")
    private String traceid;

    @Column(name="requestip",columnDefinition="VARCHAR(50)")
    private String requestip;

    @Column(name="userid",columnDefinition="VARCHAR(50)")
    private String userid;

    @Column(name="username",columnDefinition="VARCHAR(50)")
    private String username;

    @Column(name="projectname",columnDefinition="VARCHAR(50)")
    private String projectname;

    @Column(name="projectdesc",columnDefinition="VARCHAR(50)")
    private String projectdesc;

    @Column(name="targetmethod",columnDefinition="VARCHAR(200)")
    private String targetmethod;

    @Column(name="targetparams",columnDefinition="LONGTEXT")
    private String targetparams;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")//接受
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")//返回
    private Date starttime;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")//返回
    private Date endtime;
    private Long comsumetime;//耗时

    @Column(name="returnresult",columnDefinition="LONGTEXT")
    private String returnresult;//返回结果

    @Column(name="executeresult",columnDefinition="LONGTEXT")
    private String executeresult;//执行结果

    @Column(name="remark",columnDefinition="LONGTEXT")
    private String remark;
}

