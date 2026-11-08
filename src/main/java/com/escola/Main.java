package com.escola;

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
        String Username = scanner.nextLine();

        System.out.println("===============================");
    }
}
