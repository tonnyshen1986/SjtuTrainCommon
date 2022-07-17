package com.entity;

// Generated 2019-7-15 10:49:22 by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SjCase generated by hbm2java
 */
@Entity
@Table(name = "View_XGH", catalog = "sjtu_train_2")
public class ViewXgh implements java.io.Serializable {

	private String id;
	private String gh;
	private String xh;

	public ViewXgh() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Id", unique = true, nullable = false)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "GH")
	public String getGh() {
		return gh;
	}

	public void setGh(String gh) {
		this.gh = gh;
	}

	@Column(name = "XH")
	public String getXh() {
		return xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

}

