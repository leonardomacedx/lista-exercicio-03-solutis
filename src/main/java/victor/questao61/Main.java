package main.java.victor.questao61;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de linhas: ");
        int linhas = scanner.nextInt();

        for(int i = 1; i <= linhas; i++){
            for(int asterisco = 1; asterisco <= i; asterisco++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
