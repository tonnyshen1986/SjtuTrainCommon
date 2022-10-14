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
 * SjUser generated by hbm2java
 */
@Entity
@Table(name = "SJ_DIC_ERROR_CODE", catalog = "sast_train")
public class DicErrorCode implements java.io.Serializable {

	private Integer id;
	private String errorCode;
	private String errorMsg;
	private String errorDesc;
	private Date createTime;
	private Date updateTime;

	public DicErrorCode() {
	}

	public DicErrorCode(Integer id, String errorCode,String errorMsg, String errorDesc,
			Date createTime,Date updateTime) {
		this.id = id;
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.errorDesc = errorDesc;
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
	
	@Column(name = "errorCode")
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	@Column(name = "errorMsg")
	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	@Column(name = "errorDesc")
	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createTime", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updateTime", length = 19)
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}
