package com.entity;

// Generated 2020-7-22 10:29:49 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ActHiVarinst generated by hbm2java
 */
@Entity
@Table(name = "ACT_HI_VARINST", catalog = "sjtu_train")
public class ActHiVarinst implements java.io.Serializable {

	private String id;
	private String procInstId;
	private String executionId;
	private String taskId;
	private String name;
	private String varType;
	private Integer rev;
	private String bytearrayId;
	private Double double_;
	private Long long_;
	private String text;
	private String text2;
	private Date createTime;
	private Date lastUpdatedTime;

	public ActHiVarinst() {
	}

	public ActHiVarinst(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public ActHiVarinst(String id, String procInstId, String executionId,
			String taskId, String name, String varType, Integer rev,
			String bytearrayId, Double double_, Long long_, String text,
			String text2, Date createTime, Date lastUpdatedTime) {
		this.id = id;
		this.procInstId = procInstId;
		this.executionId = executionId;
		this.taskId = taskId;
		this.name = name;
		this.varType = varType;
		this.rev = rev;
		this.bytearrayId = bytearrayId;
		this.double_ = double_;
		this.long_ = long_;
		this.text = text;
		this.text2 = text2;
		this.createTime = createTime;
		this.lastUpdatedTime = lastUpdatedTime;
	}

	@Id
	@Column(name = "ID_", unique = true, nullable = false, length = 64)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "PROC_INST_ID_", length = 64)
	public String getProcInstId() {
		return this.procInstId;
	}

	public void setProcInstId(String procInstId) {
		this.procInstId = procInstId;
	}

	@Column(name = "EXECUTION_ID_", length = 64)
	public String getExecutionId() {
		return this.executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	@Column(name = "TASK_ID_", length = 64)
	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	@Column(name = "NAME_", nullable = false)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "VAR_TYPE_", length = 100)
	public String getVarType() {
		return this.varType;
	}

	public void setVarType(String varType) {
		this.varType = varType;
	}

	@Column(name = "REV_")
	public Integer getRev() {
		return this.rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}

	@Column(name = "BYTEARRAY_ID_", length = 64)
	public String getBytearrayId() {
		return this.bytearrayId;
	}

	public void setBytearrayId(String bytearrayId) {
		this.bytearrayId = bytearrayId;
	}

	@Column(name = "DOUBLE_", precision = 22, scale = 0)
	public Double getDouble_() {
		return this.double_;
	}

	public void setDouble_(Double double_) {
		this.double_ = double_;
	}

	@Column(name = "LONG_")
	public Long getLong_() {
		return this.long_;
	}

	public void setLong_(Long long_) {
		this.long_ = long_;
	}

	@Column(name = "TEXT_", length = 4000)
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Column(name = "TEXT2_", length = 4000)
	public String getText2() {
		return this.text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME_", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LAST_UPDATED_TIME_", length = 19)
	public Date getLastUpdatedTime() {
		return this.lastUpdatedTime;
	}

	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

}
