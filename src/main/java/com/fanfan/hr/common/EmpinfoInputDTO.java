package com.fanfan.hr.common;

public class EmpinfoInputDTO {

    private Integer page;

    private Integer pageSize;

    private String workid;

    private Integer beginPage;

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getBeginPage() {
        return beginPage;
    }

    public void setBeginPage(Integer beginPage) {
        this.beginPage = beginPage;
    }
}
