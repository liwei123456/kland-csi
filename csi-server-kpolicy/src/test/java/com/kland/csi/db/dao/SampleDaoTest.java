package com.kland.csi.db.dao;

import com.kland.csi.db.domain.Sample;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xiangli.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:database-definition.xml"})
public class SampleDaoTest {
    @Autowired
    private SampleDao sampleDao;

    @Test
    public void testAll() {
        Sample obj = new Sample();
        obj.setId(1);
        obj.setName("abc");
        Assert.assertTrue(sampleDao.insert(obj) > 0);

        obj.setName("def");
        Assert.assertTrue(sampleDao.update(obj) > 0);

        Sample sample = sampleDao.get(1);
        Assert.assertNotNull(sample);
        Assert.assertEquals("def", sample.getName());

        Assert.assertTrue(sampleDao.deleteById(1) > 0);
    }

}
