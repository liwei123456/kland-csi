package com.kland.csi.api.tree;

import java.util.List;
import java.util.Objects;

/**
 * Created by ZhangMing on 2015/10/22.
 */
public class FilterTreeEntity {
    private String nodeId;
    private List children;
    /*过滤树类型的对象*/
    private Objects filterTreeId;
    /*唯一标识的过滤器*/
    private String filterId;
    /*过滤树节点名称*/
    private String displayName;
    private String title;
    /*搜索这个节点的点击树*/
    private String nHits;
    /*(从零开始的)索引信息,用于通过一个结果集页面;*/
    private pageInfo page;
    /*如果为true，可能没有填充*/
    private Boolean hasChildren;
    /*表示为该节点的子节点总数*/
    private Integer nTotalChildren;

    /*可选的参数*/
    /*显示*/
    private String graphicURL;
    /*作为一个用户的搜索范围*/
    private String selectable;
    /*不止一个子节点可能被选中*/
    private Boolean multiplesAllowed;

    public FilterTreeEntity() {
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }

    public Objects getFilterTreeId() {
        return filterTreeId;
    }

    public void setFilterTreeId(Objects filterTreeId) {
        this.filterTreeId = filterTreeId;
    }

    public String getFilterId() {
        return filterId;
    }

    public void setFilterId(String filterId) {
        this.filterId = filterId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getnHits() {
        return nHits;
    }

    public void setnHits(String nHits) {
        this.nHits = nHits;
    }

    public pageInfo getPage() {
        return page;
    }

    public void setPage(pageInfo page) {
        this.page = page;
    }

    public Boolean getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(Boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public Integer getnTotalChildren() {
        return nTotalChildren;
    }

    public void setnTotalChildren(Integer nTotalChildren) {
        this.nTotalChildren = nTotalChildren;
    }

}
