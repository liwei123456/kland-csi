package com.kland.csi.api.tree;

/**
 * Created by ZhangMing on 2015/10/13.
 */
public class pageInfo {
    /*List中的索引返回的第一项*/
    private String startItemIndex;
    /*子节点数量在列表中返回的响应*/
    private Integer numberOfItems;

    public pageInfo() {
    }

    public pageInfo(String startItemIndex, Integer numberOfItems) {
        this.startItemIndex = startItemIndex;
        this.numberOfItems = numberOfItems;
    }

    public String getStartItemIndex() {
        return startItemIndex;
    }

    public void setStartItemIndex(String startItemIndex) {
        this.startItemIndex = startItemIndex;
    }

    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }
}
