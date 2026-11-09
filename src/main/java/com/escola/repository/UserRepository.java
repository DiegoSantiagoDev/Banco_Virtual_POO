package com.escola.repository;

import com.escola.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private final List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
    }

    public boolean existsByName(String userName) {
        return users.stream().anyMatch(user -> user.getUserName().equalsIgnoreCase(userName));
    }

    public List<User> findAll() {
        return List.copyOf(users);
    }
}