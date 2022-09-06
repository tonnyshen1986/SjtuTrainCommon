package com.entity;

// Generated 2020-7-31 13:57:38 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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
 * SjProject generated by hbm2java
 */
@Entity
@Table(name = "SJ_PROJECT", catalog = "sjtu_train")
public class Project implements java.io.Serializable {

    private Integer id;
    private String organiCode;
    private String createBy;
    private String name;
    private Integer projectType;
    private Integer projectLevel;
    private Integer trainType;
    private Date trainStartTime;
    private Date trainEndTime;
    private Integer unionOrNot;
    private String unionOrganis;
    private String header;
    private String leader;
    private String coManagers;
    private String imagePath;
    private Integer entryType;
    private Integer totalNumber;
    private Integer teacherOrNot;
    private Integer studentOrNot;
    private Integer outSchoolOrNot;
    private Integer acrossOrNot;
    private Integer acrossYear;
    private Date signStartTime;
    private Date signEndTime;
    private Integer del;
    private Integer personLevel;
    private Date createTime;
    private Date updateTime;
    private Integer testOrNot;
    private Integer testType;
    private String testLibs;
    private String testSubLibs;
    private Integer testRule;
    private Integer reportOrNot;
    private Integer evaluateOrNot;
    private Integer evaluateLib;
    private Integer projectStatus;
    private Integer isHistory;
    private Integer isOutSchool;
    private Date planFinishTime;
    private Integer gatherOrNot;
    private Integer certTempId;
    private Double trainPrice;
    private String trainHost;
    private String trainSchool;
    private String trainLocation;
    private String projectContent;
    private String projectOrganizerName;

    public Project() {
    }

    public Project(Integer id, String organiCode, String createBy, String name,
                   Integer projectType, Integer projectLevel, Integer trainType,
                   Date trainStartTime, Date trainEndTime, Integer unionOrNot,
                   String unionOrganis, String header, String leader, String coManagers,
                   String imagePath, Integer entryType, Integer totalNumber, Integer teacherOrNot,
                   Integer outSchoolOrNot, Integer studentOrNot, Integer acrossOrNot,
                   Integer acrossYear, Date signStartTime, Date signEndTime,
                   Integer del, Integer personLevel, Date createTime, Date updateTime,
                   Integer testOrNot, Integer testType, String testLibs,
                   String testSubLibs, Integer testRule, Integer reportOrNot,
                   Integer evaluateOrNot, Integer evaluateLib, Integer projectStatus, Integer isOutSchool,
                   Integer isHistory, Date planFinishTime, Integer gatherOrNot, Integer certTempId, Double trainPrice, String trainHost, String trainSchool, String trainLocation, String projectContent, String projectOrganizerName) {
        this.id = id;
        this.organiCode = organiCode;
        this.createBy = createBy;
        this.name = name;
        this.projectType = projectType;
        this.projectLevel = projectLevel;
        this.trainType = trainType;
        this.trainStartTime = trainStartTime;
        this.trainEndTime = trainEndTime;
        this.unionOrNot = unionOrNot;
        this.unionOrganis = unionOrganis;
        this.header = header;
        this.leader = leader;
        this.coManagers = coManagers;
        this.imagePath = imagePath;
        this.entryType = entryType;
        this.totalNumber = totalNumber;
        this.outSchoolOrNot = outSchoolOrNot;
        this.teacherOrNot = teacherOrNot;
        this.studentOrNot = studentOrNot;
        this.acrossOrNot = acrossOrNot;
        this.acrossYear = acrossYear;
        this.signStartTime = signStartTime;
        this.signEndTime = signEndTime;
        this.del = del;
        this.personLevel = personLevel;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.testOrNot = testOrNot;
        this.testType = testType;
        this.testLibs = testLibs;
        this.testSubLibs = testSubLibs;
        this.testRule = testRule;
        this.reportOrNot = reportOrNot;
        this.evaluateOrNot = evaluateOrNot;
        this.evaluateLib = evaluateLib;
        this.projectStatus = projectStatus;
        this.isHistory = isHistory;
        this.isOutSchool = isOutSchool;
        this.planFinishTime = planFinishTime;
        this.gatherOrNot = gatherOrNot;
        this.certTempId = certTempId;
        this.trainPrice = trainPrice;
        this.trainHost = trainHost;
        this.trainSchool = trainSchool;
        this.trainLocation = trainLocation;
        this.projectContent = projectContent;
        this.projectOrganizerName = projectOrganizerName;
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

    @Column(name = "ORGANI_CODE")
    public String getOrganiCode() {
        return this.organiCode;
    }

    public void setOrganiCode(String organiCode) {
        this.organiCode = organiCode;
    }

    @Column(name = "CREATE_BY")
    public String getCreateBy() {
        return this.createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Column(name = "NAME")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "PROJECT_TYPE")
    public Integer getProjectType() {
        return this.projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    @Column(name = "PROJECT_LEVEL")
    public Integer getProjectLevel() {
        return this.projectLevel;
    }

    public void setProjectLevel(Integer projectLevel) {
        this.projectLevel = projectLevel;
    }

    @Column(name = "TRAIN_TYPE")
    public Integer getTrainType() {
        return this.trainType;
    }

    public void setTrainType(Integer trainType) {
        this.trainType = trainType;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TRAIN_START_TIME", length = 19)
    public Date getTrainStartTime() {
        return this.trainStartTime;
    }

    public void setTrainStartTime(Date trainStartTime) {
        this.trainStartTime = trainStartTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TRAIN_END_TIME", length = 19)
    public Date getTrainEndTime() {
        return this.trainEndTime;
    }

    public void setTrainEndTime(Date trainEndTime) {
        this.trainEndTime = trainEndTime;
    }

    @Column(name = "UNION_OR_NOT")
    public Integer getUnionOrNot() {
        return this.unionOrNot;
    }

    public void setUnionOrNot(Integer unionOrNot) {
        this.unionOrNot = unionOrNot;
    }

    @Column(name = "UNION_ORGANIS")
    public String getUnionOrganis() {
        return this.unionOrganis;
    }

    public void setUnionOrganis(String unionOrganis) {
        this.unionOrganis = unionOrganis;
    }

    @Column(name = "HEADER")
    public String getHeader() {
        return this.header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Column(name = "LEADER")
    public String getLeader() {
        return this.leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    @Column(name = "CO_MANAGERS", length = 2550)
    public String getCoManagers() {
        return this.coManagers;
    }

    public void setCoManagers(String coManagers) {
        this.coManagers = coManagers;
    }

    @Column(name = "IMAGE_PATH")
    public String getImagePath() {
        return this.imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Column(name = "ENTRY_TYPE")
    public Integer getEntryType() {
        return this.entryType;
    }

    public void setEntryType(Integer entryType) {
        this.entryType = entryType;
    }

    @Column(name = "TOTAL_NUMBER")
    public Integer getTotalNumber() {
        return this.totalNumber;
    }

    public void setTotalNumber(Integer totalNumber) {
        this.totalNumber = totalNumber;
    }

    @Column(name = "OUT_SCHOOL_OR_NOT")
    public Integer getOutSchoolOrNot() {
        return this.outSchoolOrNot;
    }

    public void setOutSchoolOrNot(Integer outSchoolOrNot) {
        this.outSchoolOrNot = outSchoolOrNot;
    }

    @Column(name = "TEACHER_OR_NOT")
    public Integer getTeacherOrNot() {
        return teacherOrNot;
    }

    public void setTeacherOrNot(Integer teacherOrNot) {
        this.teacherOrNot = teacherOrNot;
    }

    @Column(name = "STUDENT_OR_NOT")
    public Integer getStudentOrNot() {
        return this.studentOrNot;
    }

    public void setStudentOrNot(Integer studentOrNot) {
        this.studentOrNot = studentOrNot;
    }

    @Column(name = "ACROSS_OR_NOT")
    public Integer getAcrossOrNot() {
        return this.acrossOrNot;
    }

    public void setAcrossOrNot(Integer acrossOrNot) {
        this.acrossOrNot = acrossOrNot;
    }

    @Column(name = "ACROSS_YEAR")
    public Integer getAcrossYear() {
        return this.acrossYear;
    }

    public void setAcrossYear(Integer acrossYear) {
        this.acrossYear = acrossYear;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SIGN_START_TIME", length = 19)
    public Date getSignStartTime() {
        return this.signStartTime;
    }

    public void setSignStartTime(Date signStartTime) {
        this.signStartTime = signStartTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "SIGN_END_TIME", length = 19)
    public Date getSignEndTime() {
        return this.signEndTime;
    }

    public void setSignEndTime(Date signEndTime) {
        this.signEndTime = signEndTime;
    }

    @Column(name = "DEL")
    public Integer getDel() {
        return this.del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    @Column(name = "PERSON_LEVEL")
    public Integer getPersonLevel() {
        return this.personLevel;
    }

    public void setPersonLevel(Integer personLevel) {
        this.personLevel = personLevel;
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

    @Column(name = "TEST_OR_NOT")
    public Integer getTestOrNot() {
        return this.testOrNot;
    }

    public void setTestOrNot(Integer testOrNot) {
        this.testOrNot = testOrNot;
    }

    @Column(name = "TEST_TYPE")
    public Integer getTestType() {
        return this.testType;
    }

    public void setTestType(Integer testType) {
        this.testType = testType;
    }

    @Column(name = "TEST_LIBS")
    public String getTestLibs() {
        return this.testLibs;
    }

    public void setTestLibs(String testLibs) {
        this.testLibs = testLibs;
    }

    @Column(name = "TEST_SUB_LIBS")
    public String getTestSubLibs() {
        return this.testSubLibs;
    }

    public void setTestSubLibs(String testSubLibs) {
        this.testSubLibs = testSubLibs;
    }

    @Column(name = "TEST_RULE")
    public Integer getTestRule() {
        return this.testRule;
    }

    public void setTestRule(Integer testRule) {
        this.testRule = testRule;
    }

    @Column(name = "REPORT_OR_NOT")
    public Integer getReportOrNot() {
        return this.reportOrNot;
    }

    public void setReportOrNot(Integer reportOrNot) {
        this.reportOrNot = reportOrNot;
    }

    @Column(name = "EVALUATE_OR_NOT")
    public Integer getEvaluateOrNot() {
        return this.evaluateOrNot;
    }

    public void setEvaluateOrNot(Integer evaluateOrNot) {
        this.evaluateOrNot = evaluateOrNot;
    }

    @Column(name = "EVALUATE_LIB")
    public Integer getEvaluateLib() {
        return this.evaluateLib;
    }

    public void setEvaluateLib(Integer evaluateLib) {
        this.evaluateLib = evaluateLib;
    }

    @Column(name = "PROJECT_STATUS")
    public Integer getProjectStatus() {
        return this.projectStatus;
    }

    public void setProjectStatus(Integer projectStatus) {
        this.projectStatus = projectStatus;
    }

    @Column(name = "IS_HISTORY")
    public Integer getIsHistory() {
        return this.isHistory;
    }

    public void setIsHistory(Integer isHistory) {
        this.isHistory = isHistory;
    }

    @Column(name = "IS_OUT_SCHOOL")
    public Integer getIsOutSchool() {
        return isOutSchool;
    }

    public void setIsOutSchool(Integer isOutSchool) {
        this.isOutSchool = isOutSchool;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PLAN_FINISH_TIME", length = 19)
    public Date getPlanFinishTime() {
        return this.planFinishTime;
    }

    public void setPlanFinishTime(Date planFinishTime) {
        this.planFinishTime = planFinishTime;
    }

    @Column(name = "GATHER_OR_NOT")
    public Integer getGatherOrNot() {
        return gatherOrNot;
    }

    public void setGatherOrNot(Integer gatherOrNot) {
        this.gatherOrNot = gatherOrNot;
    }

    @Column(name = "CERT_TEMP_ID")
    public Integer getCertTempId() {
        return this.certTempId;
    }

    public void setCertTempId(Integer certTempId) {
        this.certTempId = certTempId;
    }

    @Column(name = "TRAIN_PRICE")
    public Double getTrainPrice() {
        return trainPrice;
    }

    public void setTrainPrice(Double trainPrice) {
        this.trainPrice = trainPrice;
    }

    @Column(name = "TRAIN_HOST")
    public String getTrainHost() {
        return trainHost;
    }

    public void setTrainHost(String trainHost) {
        this.trainHost = trainHost;
    }

    @Column(name = "TRAIN_SCHOOL")
    public String getTrainSchool() {
        return trainSchool;
    }

    public void setTrainSchool(String trainSchool) {
        this.trainSchool = trainSchool;
    }

    @Column(name = "TRAIN_LOCATION")
    public String getTrainLocation() {
        return trainLocation;
    }

    public void setTrainLocation(String trainLocation) {
        this.trainLocation = trainLocation;
    }

    @Column(name = "PROJECT_CONTENT")
    public String getProjectContent() {
        return projectContent;
    }

    public void setProjectContent(String projectContent) {
        this.projectContent = projectContent;
    }

    @Column(name = "PROJECT_ORGANIZERNAME")
    public String getProjectOrganizerName() {
        return projectOrganizerName;
    }

    public void setProjectOrganizerName(String projectOrganizerName) {
        this.projectOrganizerName = projectOrganizerName;
    }

}
