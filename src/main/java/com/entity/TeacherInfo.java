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
 * SjTeacherInfo generated by hbm2java
 */
@Entity
@Table(name = "SJ_TEACHER_INFO", catalog = "sjtu_train")
public class TeacherInfo implements java.io.Serializable {

	private Integer id;
	private String name;
	private String number;
	private String account;
	private String organiCode;
	private String organiName;
	private String subOrganiCode;
	private String subOrganiName;
	private String cardNo;
	private String sex;
	private String birthDay;
	private String hignestEdu;
	private String hignestDegree;
	private String career;
	private String govLevel;
	private String employeeTime;
	private String employeeWay;
	private String teacherType;
	private String compilerType;
	private String positionName;
	private Date createTime;
	private Date updateTime;
	private String cellPhone;
	private String emailAddress;
	private Integer myContact;
	private Date myTime;
	private String zzqkm;
	private String zzqkmc;
	private String zzmmm;
	private String zzmmmc;
	private String gjm;
	private String gjmc;
	private String prgw;
	private String zwzj;
	private Integer deleteFlag;

	public TeacherInfo() {
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

	@Column(name = "NUMBER")
	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Column(name = "ACCOUNT")
	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Column(name = "ORGANI_CODE")
	public String getSubOrganiCode() {
		return subOrganiCode;
	}

	public void setSubOrganiCode(String subOrganiCode) {
		this.subOrganiCode = subOrganiCode;
	}

	@Column(name = "ORGANI_NAME")
	public String getSubOrganiName() {
		return subOrganiName;
	}

	public void setSubOrganiName(String subOrganiName) {
		this.subOrganiName = subOrganiName;
	}

	@Column(name = "PARENTORGANI_CODE")
	public String getOrganiCode() {
		return this.organiCode;
	}

	public void setOrganiCode(String organiCode) {
		this.organiCode = organiCode;
	}

	@Column(name = "PARENTORGANI_NAME")
	public String getOrganiName() {
		return this.organiName;
	}

	public void setOrganiName(String organiName) {
		this.organiName = organiName;
	}

	@Column(name = "CARD_NO")
	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	@Column(name = "SEX")
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Column(name = "BIRTH_DAY")
	public String getBirthDay() {
		return this.birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	@Column(name = "HIGNEST_EDU")
	public String getHignestEdu() {
		return this.hignestEdu;
	}

	public void setHignestEdu(String hignestEdu) {
		this.hignestEdu = hignestEdu;
	}

	@Column(name = "HIGNEST_DEGREE")
	public String getHignestDegree() {
		return this.hignestDegree;
	}

	public void setHignestDegree(String hignestDegree) {
		this.hignestDegree = hignestDegree;
	}

	@Column(name = "CAREER")
	public String getCareer() {
		return this.career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	@Column(name = "GOV_LEVEL")
	public String getGovLevel() {
		return this.govLevel;
	}

	public void setGovLevel(String govLevel) {
		this.govLevel = govLevel;
	}

	@Column(name = "EMPLOYEE_TIME")
	public String getEmployeeTime() {
		return this.employeeTime;
	}

	public void setEmployeeTime(String employeeTime) {
		this.employeeTime = employeeTime;
	}

	@Column(name = "EMPLOYEE_WAY")
	public String getEmployeeWay() {
		return this.employeeWay;
	}

	public void setEmployeeWay(String employeeWay) {
		this.employeeWay = employeeWay;
	}

	@Column(name = "TEACHER_TYPE")
	public String getTeacherType() {
		return this.teacherType;
	}

	public void setTeacherType(String teacherType) {
		this.teacherType = teacherType;
	}

	@Column(name = "COMPILER_TYPE")
	public String getCompilerType() {
		return this.compilerType;
	}

	public void setCompilerType(String compilerType) {
		this.compilerType = compilerType;
	}

	@Column(name = "POSITION_NAME")
	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
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

	@Column(name = "CELL_PHONE")
	public String getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	@Column(name = "EMAIL_ADDRESS")
	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Column(name = "MY_CONTACT")
	public Integer getMyContact() {
		return myContact;
	}

	public void setMyContact(Integer myContact) {
		this.myContact = myContact;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MY_TIME", length = 19)
	public Date getMyTime() {
		return myTime;
	}

	public void setMyTime(Date myTime) {
		this.myTime = myTime;
	}

	@Column(name = "zzqkm")
	public String getZzqkm() {
		return zzqkm;
	}

	public void setZzqkm(String zzqkm) {
		this.zzqkm = zzqkm;
	}
	
	@Column(name = "zzqkmc")
	public String getZzqkmc() {
		return zzqkmc;
	}

	public void setZzqkmc(String zzqkmc) {
		this.zzqkmc = zzqkmc;
	}
	
	@Column(name = "zzmmm")
	public String getZzmmm() {
		return zzmmm;
	}

	public void setZzmmm(String zzmmm) {
		this.zzmmm = zzmmm;
	}
	
	@Column(name = "zzmmmc")
	public String getZzmmmc() {
		return zzmmmc;
	}

	public void setZzmmmc(String zzmmmc) {
		this.zzmmmc = zzmmmc;
	}
	
	@Column(name = "gjm")
	public String getGjm() {
		return gjm;
	}

	public void setGjm(String gjm) {
		this.gjm = gjm;
	}
	
	@Column(name = "gjmc")
	public String getGjmc() {
		return gjmc;
	}

	public void setGjmc(String gjmc) {
		this.gjmc = gjmc;
	}
	
	@Column(name = "prgw")
	public String getPrgw() {
		return prgw;
	}

	public void setPrgw(String prgw) {
		this.prgw = prgw;
	}
	
	@Column(name = "zwzj")
	public String getZwzj() {
		return zwzj;
	}

	public void setZwzj(String zwzj) {
		this.zwzj = zwzj;
	}
	
	@Column(name = "deleteFlag")
	public Integer getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

}
