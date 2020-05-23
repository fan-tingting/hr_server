package com.fanfan.hr.pojo;

import java.util.Date;

public class Salary extends SalaryKey {

    private Integer id;

    private Integer basic;

    private Integer award;

    private Integer lunch;

    private Integer traffic;

    private Integer yanglaobase;

    private Integer yiliaobase;

    private Integer gongjijinbase;

    private Integer lostjobbase;

    private Integer hurtbase;

    private Integer babybase;

    private String name;

    private Date createdate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Salary(Integer id, Date createdate, Integer basic, Integer award, Integer lunch, Integer traffic, Integer yanglaobase, Integer yiliaobase,Integer gongjijinbase, Integer lostjobbase, Integer hurtbase, Integer babybase, String name) {
        this.id = id;
        this.createdate = createdate;
        this.basic = basic;
        this.award = award;
        this.lunch = lunch;
        this.traffic = traffic;
        this.yanglaobase = yanglaobase;
        this.yiliaobase = yiliaobase;
        this.gongjijinbase = gongjijinbase;
        this.lostjobbase = lostjobbase;
        this.hurtbase = hurtbase;
        this.babybase = babybase;
        this.name = name;
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

    public Integer getYanglaobase() {
        return yanglaobase;
    }

    public void setYanglaobase(Integer yanglaobase) {
        this.yanglaobase = yanglaobase;
    }

    public Integer getYiliaobase() {
        return yiliaobase;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Date getCreatedate() {
        return createdate;
    }

    @Override
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public void setYiliaobase(Integer yiliaobase) {
        this.yiliaobase = yiliaobase;
    }

    public Integer getGongjijinbase() {
        return gongjijinbase;
    }

    public void setGongjijinbase(Integer gongjijinbase) {
        this.gongjijinbase = gongjijinbase;
    }

    public Integer getLostjobbase() {
        return lostjobbase;
    }

    public void setLostjobbase(Integer lostjobbase) {
        this.lostjobbase = lostjobbase;
    }

    public Integer getHurtbase() {
        return hurtbase;
    }

    public void setHurtbase(Integer hurtbase) {
        this.hurtbase = hurtbase;
    }

    public Integer getBabybase() {
        return babybase;
    }

    public void setBabybase(Integer babybase) {
        this.babybase = babybase;
    }

    public Integer resetSallary() {
        return (this.basic + this.award + lunch + traffic) -
                (this.yanglaobase + this.yiliaobase + this.gongjijinbase + this.lostjobbase + this.hurtbase + this.babybase);
    }

}
