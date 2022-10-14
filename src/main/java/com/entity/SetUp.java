package com.entity;

// Generated 2020-7-28 10:36:13 by Hibernate Tools 3.4.0.CR1

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
 * SjSetUp generated by hbm2java
 */
@Entity
@Table(name = "SJ_SET_UP", catalog = "sast_train")
public class SetUp implements java.io.Serializable {

	private Integer id;
	private Double hourOneDay;
	private Double hourHalfDay;
	private Double minuteOneHour;
	private Date createTime;
	private Date updateTime;

	public SetUp() {
	}

	public SetUp(Double hourOneDay, Double hourHalfDay,
			Double minuteOneHour, Date createTime, Date updateTime) {
		this.hourOneDay = hourOneDay;
		this.hourHalfDay = hourHalfDay;
		this.minuteOneHour = minuteOneHour;
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

	@Column(name = "HOUR_ONE_DAY", precision = 22, scale = 0)
	public Double getHourOneDay() {
		return this.hourOneDay;
	}

	public void setHourOneDay(Double hourOneDay) {
		this.hourOneDay = hourOneDay;
	}

	@Column(name = "HOUR_HALF_DAY", precision = 22, scale = 0)
	public Double getHourHalfDay() {
		return this.hourHalfDay;
	}

	public void setHourHalfDay(Double hourHalfDay) {
		this.hourHalfDay = hourHalfDay;
	}

	@Column(name = "MINUTE_ONE_HOUR", precision = 22, scale = 0)
	public Double getMinuteOneHour() {
		return this.minuteOneHour;
	}

	public void setMinuteOneHour(Double minuteOneHour) {
		this.minuteOneHour = minuteOneHour;
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
