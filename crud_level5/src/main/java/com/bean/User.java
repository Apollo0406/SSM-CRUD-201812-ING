package com.bean;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userRole;

    private String userInfocol;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
    }

    public String getUserInfocol() {
        return userInfocol;
    }

    public void setUserInfocol(String userInfocol) {
        this.userInfocol = userInfocol == null ? null : userInfocol.trim();
    }
}