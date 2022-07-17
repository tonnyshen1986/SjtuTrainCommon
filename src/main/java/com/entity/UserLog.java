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
@Table(name = "SJ_USER_LOG", catalog = "sjtu_train")
public class UserLog implements java.io.Serializable {

	private Integer id;
	private Integer errorType;
	private String userInfo;
	private String servletPath;
	private String errorMsg;
	private String errorDesc;
	private String detailMsg;
	private Date createTime;

	public UserLog() {
	}

	public UserLog(Integer id, Integer errorType, String userInfo,
			String servletPath, String errorMsg, String errorDesc,
			String detailMsg, Date createTime) {
		this.id = id;
		this.errorType = errorType;
		this.userInfo = userInfo;
		this.servletPath = servletPath;
		this.errorMsg = errorMsg;
		this.errorDesc = errorDesc;
		this.detailMsg = detailMsg;
		this.createTime = createTime;
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
	
	@Column(name = "errorType")
	public Integer getErrorType() {
		return errorType;
	}

	public void setErrorType(Integer errorType) {
		this.errorType = errorType;
	}
	
	@Column(name = "userInfo")
	public String getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	
	@Column(name = "servletPath")
	public String getServletPath() {
		return servletPath;
	}

	public void setServletPath(String servletPath) {
		this.servletPath = servletPath;
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
	
	@Column(name = "detailMsg")
	public String getDetailMsg() {
		return detailMsg;
	}

	public void setDetailMsg(String detailMsg) {
		this.detailMsg = detailMsg;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createTime", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
