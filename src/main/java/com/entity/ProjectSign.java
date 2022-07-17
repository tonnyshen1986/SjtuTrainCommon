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
import javax.persistence.UniqueConstraint;

/**
 * SjProjectSign generated by hbm2java
 */
@Entity
@Table(name = "SJ_PROJECT_SIGN", catalog = "sjtu_train", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "CERTIFI_NO", "PROJECT_ID" }),
		@UniqueConstraint(columnNames = { "ACCOUNT", "PROJECT_ID" }) })
public class ProjectSign implements java.io.Serializable {

	private Integer id;
	private String account;
	private String certifiNo;
	private Integer personType;
	private Integer projectId;
	private Integer signType;
	private Integer testScore;
	private Integer testType;
	private Integer testStatus;
	private Integer evaStatus;
	private Integer reportStatus;
	private Integer passStatus;
	private String noPassReason;
	private String acrossInfo;
	private Date createTime;
	private Date updateTime;
	private String certPath;
	private String certNumber;
	private Date certExpireTime;

	public ProjectSign() {
	}

	public ProjectSign(String account, String certifiNo, Integer personType,
			Integer projectId, Integer signType, Integer testScore,
			Integer testType, Integer testStatus, Integer evaStatus,
			Integer reportStatus, Integer passStatus, String noPassReason,String acrossInfo,
			Date createTime, Date updateTime, String certPath, String certNumber,Date certExpireTime) {
		this.account = account;
		this.certifiNo = certifiNo;
		this.personType = personType;
		this.projectId = projectId;
		this.signType = signType;
		this.testScore = testScore;
		this.testType = testType;
		this.testStatus = testStatus;
		this.evaStatus = evaStatus;
		this.reportStatus = reportStatus;
		this.passStatus = passStatus;
		this.noPassReason = noPassReason;
		this.acrossInfo = acrossInfo;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.certPath = certPath;
		this.certNumber = certNumber;
		this.certExpireTime = certExpireTime;
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

	@Column(name = "ACCOUNT")
	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(name = "CERTIFI_NO")
	public String getCertifiNo() {
		return certifiNo;
	}

	public void setCertifiNo(String certifiNo) {
		this.certifiNo = certifiNo;
	}

	@Column(name = "PERSON_TYPE")
	public Integer getPersonType() {
		return this.personType;
	}

	public void setPersonType(Integer personType) {
		this.personType = personType;
	}

	@Column(name = "PROJECT_ID")
	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	@Column(name = "SIGN_TYPE")
	public Integer getSignType() {
		return this.signType;
	}

	public void setSignType(Integer signType) {
		this.signType = signType;
	}

	@Column(name = "TEST_SCORE")
	public Integer getTestScore() {
		return this.testScore;
	}

	public void setTestScore(Integer testScore) {
		this.testScore = testScore;
	}

	@Column(name = "TEST_TYPE")
	public Integer getTestType() {
		return this.testType;
	}

	public void setTestType(Integer testType) {
		this.testType = testType;
	}

	@Column(name = "TEST_STATUS")
	public Integer getTestStatus() {
		return this.testStatus;
	}

	public void setTestStatus(Integer testStatus) {
		this.testStatus = testStatus;
	}

	@Column(name = "EVA_STATUS")
	public Integer getEvaStatus() {
		return this.evaStatus;
	}

	public void setEvaStatus(Integer evaStatus) {
		this.evaStatus = evaStatus;
	}

	@Column(name = "REPORT_STATUS")
	public Integer getReportStatus() {
		return this.reportStatus;
	}

	public void setReportStatus(Integer reportStatus) {
		this.reportStatus = reportStatus;
	}

	@Column(name = "PASS_STATUS")
	public Integer getPassStatus() {
		return this.passStatus;
	}

	public void setPassStatus(Integer passStatus) {
		this.passStatus = passStatus;
	}

	@Column(name = "NO_PASS_REASON")
	public String getNoPassReason() {
		return this.noPassReason;
	}

	public void setNoPassReason(String noPassReason) {
		this.noPassReason = noPassReason;
	}
	
	@Column(name = "ACROSS_INFO")
	public String getAcrossInfo() {
		return acrossInfo;
	}

	public void setAcrossInfo(String acrossInfo) {
		this.acrossInfo = acrossInfo;
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

	@Column(name = "CERT_PATH")
	public String getCertPath() {
		return this.certPath;
	}

	public void setCertPath(String certPath) {
		this.certPath = certPath;
	}

	@Column(name = "CERT_NUMBER")
	public String getCertNumber() {
		return this.certNumber;
	}

	public void setCertNumber(String certNumber) {
		this.certNumber = certNumber;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CERT_EXPIRE_TIME", length = 19)
	public Date getCertExpireTime() {
		return certExpireTime;
	}

	public void setCertExpireTime(Date certExpireTime) {
		this.certExpireTime = certExpireTime;
	}

}
