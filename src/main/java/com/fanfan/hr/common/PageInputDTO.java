package com.fanfan.hr.common;

public class PageInputDTO {

    private Integer page;

    private Integer pageSize;

    private Integer beginPage;

    public void resetBeginPage() {
        this.beginPage = (this.page - 1) * this.pageSize;
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
