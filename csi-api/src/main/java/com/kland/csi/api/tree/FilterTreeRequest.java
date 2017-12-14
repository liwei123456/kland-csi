package com.kland.csi.api.tree;

/**
 * Created by ZhangMing on 2015/10/22.
 */
public class FilterTreeRequest {
    /*过滤树*/
    private String searchId;
    private pageInfo page;
    /*数量水平*/
    private Integer numLevels;

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public pageInfo getPage() {
        return page;
    }

    public void setPage(pageInfo page) {
        this.page = page;
    }

    public Integer getNumLevels() {
        return numLevels;
    }

    public void setNumLevels(Integer numLevels) {
        this.numLevels = numLevels;
    }
}
