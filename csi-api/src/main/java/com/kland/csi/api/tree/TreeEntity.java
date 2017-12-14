package com.kland.csi.api.tree;

import java.util.List;

/**
 * Created by LiWei on 2015/10/12.
 */
public class TreeEntity {
    private String nodeId;
    private String nodePid;
    private String title;
    private Type type;
    private List children;
    /*如果为true，没有孩子节点*/
    private Boolean isLeaf;
    /*用户选中为true，默认为false*/
    private Boolean selected = false;
    /*与之相关联的URL*/
    private String url;

    /*额外的特定信息的节点类型。增加信息，用以说明结点所属类型，是对type属性的增加说明。*/
    private additionalInfo additional;
    /*忽略：显示*/
    private String graphicURL;
    /*忽略：比如实践工具或外部web站点*/
    private Boolean launchable;
    /*所有的子节点都是节点*/
    private String numberOfLevelChildren;
    /*所有的子节点都是文件*/
    private String numberOfLeafChildren;
    /*作为一个用户的搜索范围*/
    private String selectable;
    /*标题的根节点被选中，当这个节点代表一个用户的喜欢的。*/
    private String rootNodeTitle;
    /*节点的描述信息*/
    private String hasNodeInfo;

    public TreeEntity() {
    }

    public TreeEntity(String nodeId, String nodePid, String title, Type type, List children, Boolean isLeaf, String url) {
        this.nodeId = nodeId;
        this.nodePid = nodePid;
        this.title = title;
        this.type = type;
        this.children = children;
        this.isLeaf = isLeaf;
        this.url = url;
    }

    public TreeEntity(String nodeId, String title, Type type, List children, Boolean isLeaf, Boolean selected, String url) {
        this.nodeId = nodeId;
        this.title = title;
        this.type = type;
        this.children = children;
        this.isLeaf = isLeaf;
        this.selected = selected;
        this.url = url;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodePid() {
        return nodePid;
    }

    public void setNodePid(String nodePid) {
        this.nodePid = nodePid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }

    public Boolean getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Boolean isLeaf) {
        this.isLeaf = isLeaf;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public enum Type{
        Csh, Toc, Doc, Unknown
    }
}
