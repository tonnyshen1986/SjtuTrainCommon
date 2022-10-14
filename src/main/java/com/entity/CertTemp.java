package com.entity;

// Generated 2020-7-22 10:29:49 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SjCertTemp generated by hbm2java
 */
@Entity
@Table(name = "SJ_CERT_TEMP", catalog = "sast_train")
public class CertTemp implements java.io.Serializable {

	private Integer id;
	private String name;
	private String tempDesc;
	private String imagePath;
	private String organiCode;
	private String createBy;
	private Integer del;
	private Date createTime;
	private Date updateTime;

	public CertTemp() {
	}

	public CertTemp(String name, String tempDesc, String imagePath,
			String createBy, String organiCode, Integer del, Date createTime,
			Date updateTime) {
		this.name = name;
		this.tempDesc = tempDesc;
		this.imagePath = imagePath;
		this.createBy = createBy;
		this.organiCode = organiCode;
		this.del = del;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "NAME")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "TEMP_DESC")
	public String getTempDesc() {
		return this.tempDesc;
	}

	public void setTempDesc(String tempDesc) {
		this.tempDesc = tempDesc;
	}

	@Column(name = "IMAGE_PATH")
	public String getImagePath() {
		return this.imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Column(name = "CREATE_BY")
	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	@Column(name = "ORGANI_CODE")
	public String getOrganiCode() {
		return this.organiCode;
	}

	public void setOrganiCode(String organiCode) {
		this.organiCode = organiCode;
	}

	@Column(name = "DEL")
	public Integer getDel() {
		return this.del;
	}

	public void setDel(Integer del) {
		this.del = del;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME", length = 19)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
