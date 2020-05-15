package com.fanfan.hr.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Employee {
    private Integer id;

    private String name;

    private String sex;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date birthday;

    private String idcard;

    private String wedding;

    private String nation;

    private String place;

    private String politic;

    private String email;

    private String phone;

    private String address;

    private Integer department;

    private String departmentZh;

    private Integer position;

    private String positionZh;

    private String engageform;

    private String education;

    private String major;

    private String school;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date begindate;

    private String workstate;

    private String workid;

    private Double paperlimit;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date conversiondate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date leavedate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date beginpaperdate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endpaperdate;

    private Integer workage;

    public Employee() {}

    public Employee(Integer id, String name, String sex, Date birthday, String idcard, String wedding, String nation, String place, String politic, String email, String phone, String address, Integer department, Integer position, String engageform, String education, String major, String school, Date begindate, String workstate, String workid, Double paperlimit, Date conversiondate, Date leavedate, Date beginpaperdate, Date endpaperdate, Integer workage) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.idcard = idcard;
        this.wedding = wedding;
        this.nation = nation;
        this.place = place;
        this.politic = politic;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.department = department;
        this.position = position;
        this.engageform = engageform;
        this.education = education;
        this.major = major;
        this.school = school;
        this.begindate = begindate;
        this.workstate = workstate;
        this.workid = workid;
        this.paperlimit = paperlimit;
        this.conversiondate = conversiondate;
        this.leavedate = leavedate;
        this.beginpaperdate = beginpaperdate;
        this.endpaperdate = endpaperdate;
        this.workage = workage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getWedding() {
        return wedding;
    }

    public void setWedding(String wedding) {
        this.wedding = wedding;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPolitic() {
        return politic;
    }

    public void setPolitic(String politic) {
        this.politic = politic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public String getDepartmentZh() {
        return departmentZh;
    }

    public void setDepartmentZh(String departmentZh) {
        this.departmentZh = departmentZh;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getPositionZh() {
        return positionZh;
    }

    public void setPositionZh(String positionZh) {
        this.positionZh = positionZh;
    }

    public String getEngageform() {
        return engageform;
    }

    public void setEngageform(String engageform) {
        this.engageform = engageform;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public String getWorkstate() {
        return workstate;
    }

    public void setWorkstate(String workstate) {
        this.workstate = workstate;
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid;
    }

    public Double getPaperlimit() {
        return paperlimit;
    }

    public void setPaperlimit(Double paperlimit) {
        this.paperlimit = paperlimit;
    }

    public Date getConversiondate() {
        return conversiondate;
    }

    public void setConversiondate(Date conversiondate) {
        this.conversiondate = conversiondate;
    }

    public Date getLeavedate() {
        return leavedate;
    }

    public void setLeavedate(Date leavedate) {
        this.leavedate = leavedate;
    }

    public Date getBeginpaperdate() {
        return beginpaperdate;
    }

    public void setBeginpaperdate(Date beginpaperdate) {
        this.beginpaperdate = beginpaperdate;
    }

    public Date getEndpaperdate() {
        return endpaperdate;
    }

    public void setEndpaperdate(Date endpaperdate) {
        this.endpaperdate = endpaperdate;
    }

    public Integer getWorkage() {
        return workage;
    }

    public void setWorkage(Integer workage) {
        this.workage = workage;
    }
}


