package com.kland.csi.api.identity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by xiangli.
 */
@XmlRootElement
public class AuthenticateRequest {
    private String userId;
    private String password;
    private String isNewPassword;
    private String ipAddress;
    private String refererUrl;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getRefererUrl() {
        return refererUrl;
    }

    public void setRefererUrl(String refererUrl) {
        this.refererUrl = refererUrl;
    }

    public String getIsNewPassword() {
        return isNewPassword;
    }

    public void setIsNewPassword(String isNewPassword) {
        this.isNewPassword = isNewPassword;
    }
}
