package main.java.leonardo.questao43;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float soma = 0;
        int quantidade = 500;

        for (int i = 1; i <= quantidade; i++) {
            float num = scanner.nextFloat();
            soma += num;
        }

        float media = soma / quantidade;
        System.out.println("Média: " + String.format("%.2f", media));
    }
}
