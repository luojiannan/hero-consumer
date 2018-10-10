package com.hero.common;

import java.util.List;

/**
 * @author ljn
 * @date 2018/10/10.
 */
public class BaseResponse<T> extends  AbstractServiceResponse{

    private T result;
    private List<T> data;
    private int pageIndex;
    private int pageSize;
    private long totalCount;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }
}
