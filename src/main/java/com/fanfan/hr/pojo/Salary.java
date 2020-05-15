package com.fanfan.hr.pojo;

import java.util.Date;

public class Salary extends SalaryKey {
    private Integer basic;

    private Integer award;

    private Integer lunch;

    private Integer traffic;

    private Integer allsalary;

    private Integer yanglaobase;

    private Float yanglaoper;

    private Integer yiliaobase;

    private Float yiliaoper;

    private Integer gongjijinbase;

    private Float gongjijinper;

    private Integer lostjobbase;

    private Float lostjobper;

    private Integer hurtbase;

    private Float hurtper;

    private Integer babybase;

    private Float babyper;

    public Salary(Integer id, Date createdate, Integer basic, Integer award, Integer lunch, Integer traffic, Integer allsalary, Integer yanglaobase, Float yanglaoper, Integer yiliaobase, Float yiliaoper, Integer gongjijinbase, Float gongjijinper, Integer lostjobbase, Float lostjobper, Integer hurtbase, Float hurtper, Integer babybase, Float babyper) {
        super(id, createdate);
        this.basic = basic;
        this.award = award;
        this.lunch = lunch;
        this.traffic = traffic;
        this.allsalary = allsalary;
        this.yanglaobase = yanglaobase;
        this.yanglaoper = yanglaoper;
        this.yiliaobase = yiliaobase;
        this.yiliaoper = yiliaoper;
        this.gongjijinbase = gongjijinbase;
        this.gongjijinper = gongjijinper;
        this.lostjobbase = lostjobbase;
        this.lostjobper = lostjobper;
        this.hurtbase = hurtbase;
        this.hurtper = hurtper;
        this.babybase = babybase;
        this.babyper = babyper;
    }

    public Salary() {
        super();
    }

    public Integer getBasic() {
        return basic;
    }

    public void setBasic(Integer basic) {
        this.basic = basic;
    }

    public Integer getAward() {
        return award;
    }

    public void setAward(Integer award) {
        this.award = award;
    }

    public Integer getLunch() {
        return lunch;
    }

    public void setLunch(Integer lunch) {
        this.lunch = lunch;
    }

    public Integer getTraffic() {
        return traffic;
    }

    public void setTraffic(Integer traffic) {
        this.traffic = traffic;
    }

    public Integer getAllsalary() {
        return allsalary;
    }

    public void setAllsalary(Integer allsalary) {
        this.allsalary = allsalary;
    }

    public Integer getYanglaobase() {
        return yanglaobase;
    }

    public void setYanglaobase(Integer yanglaobase) {
        this.yanglaobase = yanglaobase;
    }

    public Float getYanglaoper() {
        return yanglaoper;
    }

    public void setYanglaoper(Float yanglaoper) {
        this.yanglaoper = yanglaoper;
    }

    public Integer getYiliaobase() {
        return yiliaobase;
    }

    public void setYiliaobase(Integer yiliaobase) {
        this.yiliaobase = yiliaobase;
    }

    public Float getYiliaoper() {
        return yiliaoper;
    }

    public void setYiliaoper(Float yiliaoper) {
        this.yiliaoper = yiliaoper;
    }

    public Integer getGongjijinbase() {
        return gongjijinbase;
    }

    public void setGongjijinbase(Integer gongjijinbase) {
        this.gongjijinbase = gongjijinbase;
    }

    public Float getGongjijinper() {
        return gongjijinper;
    }

    public void setGongjijinper(Float gongjijinper) {
        this.gongjijinper = gongjijinper;
    }

    public Integer getLostjobbase() {
        return lostjobbase;
    }

    public void setLostjobbase(Integer lostjobbase) {
        this.lostjobbase = lostjobbase;
    }

    public Float getLostjobper() {
        return lostjobper;
    }

    public void setLostjobper(Float lostjobper) {
        this.lostjobper = lostjobper;
    }

    public Integer getHurtbase() {
        return hurtbase;
    }

    public void setHurtbase(Integer hurtbase) {
        this.hurtbase = hurtbase;
    }

    public Float getHurtper() {
        return hurtper;
    }

    public void setHurtper(Float hurtper) {
        this.hurtper = hurtper;
    }

    public Integer getBabybase() {
        return babybase;
    }

    public void setBabybase(Integer babybase) {
        this.babybase = babybase;
    }

    public Float getBabyper() {
        return babyper;
    }

    public void setBabyper(Float babyper) {
        this.babyper = babyper;
    }
}
