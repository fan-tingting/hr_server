package com.fanfan.hr.pojo;

public class Role {
    private Integer id;

    private String name;

    private String cname;

    private Integer grade;

    public Role(Integer id, String name, String cname,Integer grade) {
        this.id = id;
        this.name = name;
        this.cname = cname;
        this.grade = grade;
    }

    public Role() {
        super();
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
        this.name = name == null ? null : name.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
