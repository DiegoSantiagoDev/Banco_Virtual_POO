package com.escola.domain;

public class User {

    private String userName;

    public User(String userName) {
        setUserName(userName);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
