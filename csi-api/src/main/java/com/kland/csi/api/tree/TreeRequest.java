package com.kland.csi.api.tree;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by LiWei on 2015/10/9.
 * 包含用户和客户信息
 */
@XmlRootElement
public class TreeRequest {
    private String startNodeId;
    private String parentNodeId;
    /*数量水平*/
    private Integer numLevels;
    /*如果这是真的,不包括空节点*/
    private Boolean pruneEmptyBranches;

    public String getStartNodeId() {
        return startNodeId;
    }

    public void setStartNodeId(String startNodeId) {
        this.startNodeId = startNodeId;
    }

    public String getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(String parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public Integer getNumLevels() {
        return numLevels;
    }

    public void setNumLevels(Integer numLevels) {
        this.numLevels = numLevels;
    }

    public Boolean getPruneEmptyBranches() {
        return pruneEmptyBranches;
    }

    public void setPruneEmptyBranches(Boolean pruneEmptyBranches) {
        this.pruneEmptyBranches = pruneEmptyBranches;
    }
}
