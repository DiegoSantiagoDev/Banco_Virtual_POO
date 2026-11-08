package com.escola;

import com.escola.domain.User;
import com.escola.exception.InvalidNameSizeException;
import com.escola.exception.NonExistentNameException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                
                |=============================|
                |                             |
                |        BANCO VIRTUAL        |
                |                             |
                |=============================|
                
                """);
        try {
            System.out.print("Digite seu nome: ");
            String userName = scanner.nextLine();
            User user = new User(userName);

            System.out.println("===============================");

        }catch (InvalidNameSizeException | NonExistentNameException e) {
            System.out.println("Erro na inicializacao do nome: " + e.getMessage());
        }
    }
}
