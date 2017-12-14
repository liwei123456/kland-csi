package com.kland.csi.db.dao;

import com.kland.csi.db.domain.User;
import org.eclipse.persistence.sessions.Session;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ZhangMing on 2015/10/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:database-definition.xml"})
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void authenticate(){
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123");
        Assert.assertTrue(userDao.authenticate(user)!=null);
    }

    @Test
    public void forgetPassword(){
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        Assert.assertTrue(userDao.forgetPassword(user)>0);
    }
}
