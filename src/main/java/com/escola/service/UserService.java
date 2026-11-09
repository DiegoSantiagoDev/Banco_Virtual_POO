package com.escola.service;

import com.escola.domain.User;
import com.escola.exception.NameAlreadyExistsException;
import com.escola.repository.UserRepository;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String userName) {
        if (userRepository.existsByName(userName)) {
            throw new NameAlreadyExistsException(
                    userName + "esse nome ja existe!"
            );
        }

        User user = new User(userName);
        userRepository.save(user);

        return user;
    }
}
