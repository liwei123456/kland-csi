package com.kland.csi.api.Tree.impl;

import com.kland.csi.api.tree.*;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiWei on 2015/10/12.
 */
public class TreeServiceImpl implements TreeService {
    @Autowired
    private SolrClient solrServer;

    private static List<TreeEntity> trees1 = new ArrayList<TreeEntity>();
    private static List<TreeEntity> trees2 = new ArrayList<TreeEntity>();

    static{
        trees1.add(new TreeEntity("1","0","初始化根节点1",TreeEntity.Type.Csh,new ArrayList(),false,"www.baidu.com"));
        trees1.add(new TreeEntity("2","1","初始化子节点1",TreeEntity.Type.Doc,new ArrayList(),true,"www.weibo.com"));
        trees2.add(new TreeEntity("3","0","初始化根节点2",TreeEntity.Type.Csh,new ArrayList(),false,"www.baidu.com"));
        trees2.add(new TreeEntity("4","3","初始化子节点2",TreeEntity.Type.Doc,new ArrayList(),true,"www.weibo.com"));
    }

    @Override
    public List<TreeEntity> GetBrowseTree() {
        return trees1;
    }

    @Override
    public List<TreeEntity> GetAvailableBrowseTrees() {
        List<TreeEntity> trees = new ArrayList<TreeEntity>();
        trees.addAll(trees1);
        trees.addAll(trees2);
        return trees;
    }

    @Override
    public List<TreeEntity> GetBrowseTreeByParentNodeId(TreeRequest request) {
        List<TreeEntity> list = new ArrayList<TreeEntity>();
        list.add(new TreeEntity("5",request.getParentNodeId(),"父节点获取浏览树",TreeEntity.Type.Doc,new ArrayList(),true,"www.qq.com"));
        return list;
    }

    @Override
    public List<TreeEntity> GetBrowseTreeRoot(String rootId) {
        List<TreeEntity> list = new ArrayList<TreeEntity>();
        list.add(new TreeEntity("1",rootId,"初始化根节点1",TreeEntity.Type.Csh,new ArrayList(),false,"www.baidu.com"));
        list.add(new TreeEntity("3",rootId,"初始化根节点2",TreeEntity.Type.Csh,new ArrayList(),false,"www.baidu.com"));
        return list;
    }

    @Override
    public List<FilterTreeEntity> GetFilterTreeChildren(FilterTreeRequest request) {
        SolrQuery solrQuery = new SolrQuery(request.getSearchId());
        solrQuery.setStart(0);
        solrQuery.setRows(10);
        solrQuery.setFacet(true);
        solrQuery.addFacetField("joblabel");
        List<FilterTreeEntity> list = new ArrayList<FilterTreeEntity>();
        try {
            QueryResponse resp = solrServer.query(solrQuery);
            SolrDocumentList docs = resp.getResults();
            for (SolrDocument sd :docs){
                FilterTreeEntity filterTreeEntity = new FilterTreeEntity();
                filterTreeEntity.setnTotalChildren(new Long(docs.getNumFound()).intValue());
                filterTreeEntity.setNodeId(sd.getFieldValue("id").toString());
                filterTreeEntity.setTitle(sd.getFieldValue("title").toString());
                filterTreeEntity.setChildren(resp.getFacetFields());
                list.add(filterTreeEntity);
            }
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
