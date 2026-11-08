package com.escola.domain;

import com.escola.exception.InvalidNameSizeException;
import com.escola.exception.NonExistentNameException;

public class User {

    private String userName;

    public User(String userName) {
        setUserName(userName);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName == null || userName.isEmpty()) {
            throw new NonExistentNameException(
                    "o seu nome nao pode esta vazio!"
            );
        }

        if (userName.length() < 3 || userName.length() > 100) {
            throw new InvalidNameSizeException(
                    "tamanho invalido!"
            );
        }

        this.userName = userName;
    }
}
