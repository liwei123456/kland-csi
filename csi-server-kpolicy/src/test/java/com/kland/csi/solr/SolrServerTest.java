package com.kland.csi.solr;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * Created by xiangli.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class SolrServerTest {

    @Autowired
    private SolrClient solrServer;

    @Test
    public void testDocument() throws IOException,SolrServerException{
        SolrInputDocument doc1 = new SolrInputDocument();
        doc1.addField("id","1");
        doc1.addField("name","liwei");
        solrServer.add(doc1);
        solrServer.commit();
    }

    @Test
    public void testQuery() throws IOException, SolrServerException {
        SolrQuery solrQuery = new SolrQuery("*:*");
        solrQuery.setStart(0);
        solrQuery.setRows(2);
        QueryResponse resp = solrServer.query(solrQuery);
        SolrDocumentList docs = resp.getResults();
        System.out.println("搜索结果："+docs.getNumFound());
        for (SolrDocument sd : docs){
            System.out.println("内容"+sd.getFieldValueMap());
        }
        Assert.assertTrue(resp.getResults().getNumFound() > 0);
    }
}
