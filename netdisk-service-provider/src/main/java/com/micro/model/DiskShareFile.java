package com.micro.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Table(name="disk_share_file",
	indexes = {
		@Index(columnList = "shareid"),
		@Index(columnList = "pid"),
		@Index(columnList = "typecode"),
		@Index(columnList = "filetype")
	}
)
@Entity
@Data
public class DiskShareFile {
	@Id 
	@GenericGenerator(name = "uuid",strategy = "uuid")
	@GeneratedValue(generator = "uuid") 
	@Column(name="id",columnDefinition="VARCHAR(50)")
	private String id;
	
	@Column(name="shareid",columnDefinition="VARCHAR(50)")
	private String shareid;
	
	@Column(name="pid",columnDefinition="VARCHAR(50)")
	private String pid;
	
	@Column(name="filename",columnDefinition="VARCHAR(255)")
	private String filename;
	
	private long filesize;
	
	@Column(name="filesuffix",columnDefinition="VARCHAR(20)")
	private String filesuffix;
	
	@Column(name="typecode",columnDefinition="VARCHAR(50)")
	private String typecode;//document/picture/video/music/other
	
	@Column(name="filemd5",columnDefinition="VARCHAR(200)")
	private String filemd5;
	
	private Integer filetype;//0文件夹，1文件
	
	@Column(name="createuserid",columnDefinition="VARCHAR(50)")
	private String createuserid;
	
	@Column(name="createusername",columnDefinition="VARCHAR(50)")
	private String createusername;
	
	private Date createtime;
	
	//////////////////////////////////图片的扩展属性///////////////////////////////////////////
	@Column(name="thumbnailurl",columnDefinition="VARCHAR(200)")
	private String thumbnailurl;//图片属性：缩略图
	
	@Column(name="imgsize",columnDefinition="VARCHAR(50)")
	private String imgsize;//图片属性：尺寸
}
