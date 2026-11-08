package com.escola;

import com.escola.domain.User;

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

        System.out.print("Digite seu nome: ");
        String userName = scanner.nextLine();
        User user = new User(userName);

        System.out.println("===============================");
    }
}
