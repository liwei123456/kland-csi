package com.kland.csi.db.domain;

import javax.xml.crypto.Data;

/**
 * Created by LiWei on 2015/10/15.
 */
public class User {
    private int userId;
    private String email;
    private String username;
    private String password;
    private String userType;
    private byte deleted;
    private Data createdDate;
    private Data modifiedDate;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public byte getDeleted() {
        return deleted;
    }

    public void setDeleted(byte deleted) {
        this.deleted = deleted;
    }

    public Data getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Data createdDate) {
        this.createdDate = createdDate;
    }

    public Data getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Data modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
