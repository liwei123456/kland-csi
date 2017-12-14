package com.kland.csi.db.dao;

import com.kland.csi.db.domain.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ZhangMing on 2015/10/15.
 */
@Repository
@Transactional
public interface UserDao {
    public int count(User user);
    public String authenticate(User user);
    public int forgetPassword(User user);
}
