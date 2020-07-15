package java.com.micro.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author chy
 * @version 1.0
 * @date 2020/7/15 14:21
 */
@Table(name="log_project")
@Entity
@Data
public class LogProject {
    @Id
    @GenericGenerator(name = "uuid",strategy = "uuid")
    @GeneratedValue(generator = "uuid")
    @Column(name="id",columnDefinition="VARCHAR(50)")
    private String id;

    @Column(name="projectname",columnDefinition="VARCHAR(50)")
    private String projectname;

    @Column(name="projectdesc",columnDefinition="VARCHAR(50)")
    private String projectdesc;
}

