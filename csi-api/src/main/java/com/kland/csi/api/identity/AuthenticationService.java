package com.kland.csi.api.identity;

/**
 * Created by xiangli.
 */
public interface AuthenticationService {

    /**
     * 用户验证
     * @param request
     * @return
     */
    AuthenticateResponse authenticate(AuthenticateRequest request);

    AuthenticateResponse logout();

    AuthenticateResponse forgetPassword(AuthenticateRequest request);
}
