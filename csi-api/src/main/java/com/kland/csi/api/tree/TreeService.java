package com.kland.csi.api.tree;

import java.util.List;

/**
 * Created by Liwei on 2015/10/9.
 */
public interface TreeService {

    /**
     * 获取浏览树
     * @return
     */
    List<TreeEntity> GetBrowseTree();

    /**
     * 获取所有可用浏览树
     * @return
     */
    List<TreeEntity> GetAvailableBrowseTrees();

    /**
     * 根据父节点获取浏览树
     * @return
     */
    List<TreeEntity> GetBrowseTreeByParentNodeId(TreeRequest request);

    /**
     * 获取浏览树根节点
     * @return
     */
    List<TreeEntity> GetBrowseTreeRoot(String rootId);

    /**
     * 获取过滤子树
     * @return
     */
    List<FilterTreeEntity> GetFilterTreeChildren(FilterTreeRequest request);
}
