package com.escola.controller;

import com.escola.domain.User;
import com.escola.exception.InvalidNameSizeException;
import com.escola.exception.NameAlreadyExistsException;
import com.escola.exception.NonExistentNameException;
import com.escola.service.UserService;

import java.util.Scanner;

public class UserController {

    private final UserService userService;
    private final Scanner scanner;

    public UserController(UserService userService, Scanner scanner) {
        this.userService = userService;
        this.scanner = scanner;
    }

    public void createUser() {
        try {
            System.out.print("Digite seu nome: ");
            String userName = scanner.nextLine();

            User user = userService.createUser(userName);

            System.out.println("Usuário cadastrado com sucesso!");
            System.out.println("Nome: " + user.getUserName());

        } catch (InvalidNameSizeException |
                 NonExistentNameException |
                 NameAlreadyExistsException e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
}