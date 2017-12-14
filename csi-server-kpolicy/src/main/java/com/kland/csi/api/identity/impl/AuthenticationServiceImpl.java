package com.kland.csi.api.identity.impl;

import com.kland.csi.api.identity.*;
import com.kland.csi.db.dao.UserDao;
import com.kland.csi.db.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xiangli.
 */
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private UserDao userDao;

    @Override
    public AuthenticateResponse authenticate(AuthenticateRequest request) {
        AuthenticateResponse response = new AuthenticateResponse();
        User user = new User();
        user.setUsername(request.getUserId());
        user.setPassword(request.getPassword());
        if (userDao.count(user)==1) {
            if (userDao.authenticate(user)!=null) {
                response.setValidate(AuthenticateResponse.UserValidation.OK);
                response.setAuthenticationType(AuthenticateResponse.AuthenticationType.ByPassword);
                response.setToken("abcdefg");
            } else {
                response.setValidate(AuthenticateResponse.UserValidation.IncorrectPassword);
            }
        } else {
            response.setValidate(AuthenticateResponse.UserValidation.UserNotExists);
        }
        return response;
    }

    @Override
    public AuthenticateResponse logout() {
        AuthenticateResponse response = new AuthenticateResponse();
        response.setValidate(AuthenticateResponse.UserValidation.OK);
        response.setToken("注销");
        return response;
    }

    @Override
    public AuthenticateResponse forgetPassword(AuthenticateRequest request) {
        AuthenticateResponse response = new AuthenticateResponse();
        User user = new User();
        user.setUsername(request.getUserId());
        user.setPassword(request.getIsNewPassword());
        if (userDao.count(user)==1){
            response.setValidate(AuthenticateResponse.UserValidation.OK);
            response.setToken("新密码："+request.getIsNewPassword());
            userDao.forgetPassword(user);
        } else {
            response.setValidate(AuthenticateResponse.UserValidation.UserNotExists);
        }
        return response;
    }
}
