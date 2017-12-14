package com.kland.csi.api.identity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by xiangli.
 */
@XmlRootElement
public class AuthenticateResponse {

    private UserValidation validate;
    private AuthenticationType authenticationType;
    private String token;

    public UserValidation getValidate() {
        return validate;
    }

    public void setValidate(UserValidation validate) {
        this.validate = validate;
    }

    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public enum UserValidation { OK, Failed, Forbidden, UserNotExists, IncorrectPassword }
    public enum  AuthenticationType { ByIP, ByPassword }
}
