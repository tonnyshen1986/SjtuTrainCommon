package com.entity;

// Generated 2020-7-29 15:28:20 by Hibernate Tools 3.4.0.CR1

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
 * SjResultQuestion generated by hbm2java
 */
@Entity
@Table(name = "SJ_RESULT_QUESTION", catalog = "sjtu_train")
public class ResultQuestion implements java.io.Serializable {

	private Integer id;
	private String account;
	private String certifiNo;
	private Integer personType;
	private Integer projectId;
	private Integer courseId;
	private Integer questionId;
	private String answer;
	private String optionIds;
	private String rightAnswer;
	private Integer questionScore;
	private Date createTime;
	private Date updateTime;

	public ResultQuestion() {
	}

	public ResultQuestion(String account, String certifiNo, Integer personType,
			Integer projectId, Integer courseId, Integer questionId,
			String answer, String optionIds, String rightAnswer,Integer questionScore,
			Date createTime, Date updateTime) {
		this.account = account;
		this.certifiNo = certifiNo;
		this.personType = personType;
		this.projectId = projectId;
		this.courseId = courseId;
		this.questionId = questionId;
		this.answer = answer;
		this.optionIds = optionIds;
		this.rightAnswer = rightAnswer;
		this.questionScore = questionScore;
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

	@Column(name = "ACCOUNT")
	public String getAccount() {
		return account;
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
		return personType;
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

	@Column(name = "COURSE_ID")
	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	@Column(name = "QUESTION_ID")
	public Integer getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	@Column(name = "ANSWER")
	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Column(name = "OPTION_IDS")
	public String getOptionIds() {
		return this.optionIds;
	}

	public void setOptionIds(String optionIds) {
		this.optionIds = optionIds;
	}

	@Column(name = "RIGHT_ANSWER")
	public String getRightAnswer() {
		return this.rightAnswer;
	}

	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	
	@Column(name = "QUESTION_SCORE")
	public Integer getQuestionScore() {
		return questionScore;
	}

	public void setQuestionScore(Integer questionScore) {
		this.questionScore = questionScore;
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
