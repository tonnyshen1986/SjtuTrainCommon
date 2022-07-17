package com.entity;

// Generated 2020-9-4 16:54:50 by Hibernate Tools 3.4.0.CR1

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
 * SjDicPositionPlus generated by hbm2java
 */
@Entity
@Table(name = "SJ_DIC_POSITION_PLUS", catalog = "sjtu_train")
public class DicPositionPlus implements java.io.Serializable {

	private Integer id;
	private String name;
	private String positionPlusDesc;
	private String positionIds;
	private String positionNames;
	private String organiCode;
	private String createBy;
	private Integer del;
	private Date createTime;
	private Date updateTime;

	public DicPositionPlus() {
	}

	public DicPositionPlus(String name, String positionPlusDesc,
			String positionIds,String positionNames,String createBy, String organiCode, 
			Integer del, Date createTime, Date updateTime) {
		this.name = name;
		this.positionPlusDesc = positionPlusDesc;
		this.positionIds = positionIds;
		this.positionNames = positionNames;
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

	@Column(name = "POSITION_PLUS_DESC")
	public String getPositionPlusDesc() {
		return this.positionPlusDesc;
	}

	public void setPositionPlusDesc(String positionPlusDesc) {
		this.positionPlusDesc = positionPlusDesc;
	}

	@Column(name = "POSITION_IDS")
	public String getPositionIds() {
		return this.positionIds;
	}

	public void setPositionIds(String positionIds) {
		this.positionIds = positionIds;
	}
	
	@Column(name = "POSITION_NAMES")
	public String getPositionNames() {
		return positionNames;
	}

	public void setPositionNames(String positionNames) {
		this.positionNames = positionNames;
	}
	
	@Column(name = "ORGANI_CODE")
	public String getOrganiCode() {
		return organiCode;
	}

	public void setOrganiCode(String organiCode) {
		this.organiCode = organiCode;
	}
	
	@Column(name = "CREATE_BY")
	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
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
