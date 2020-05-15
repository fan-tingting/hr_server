package com.fanfan.hr.common;

import java.util.List;

public class PageResultDTO<T> {

    private Integer totalCount;

    private List<T> data;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
