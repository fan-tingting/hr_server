package com.fanfan.hr.pojo;

public class Department {
    private Integer id;

    private String name;

    private Boolean enabled;

    public Department(Integer id, String name, Boolean enabled) {
        this.id = id;
        this.name = name;
        this.enabled = enabled;
    }

    public Department() {
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}