package com.escola;

import com.escola.controller.UserController;
import com.escola.repository.UserRepository;
import com.escola.service.UserService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        UserRepository userRepository = new UserRepository();

        UserService userService = new UserService(userRepository);

        UserController userController = new UserController(
                userService,
                scanner
        );

        userController.createUser();

        scanner.close();
    }
}