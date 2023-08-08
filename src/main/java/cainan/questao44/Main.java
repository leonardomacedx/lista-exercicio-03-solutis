package main.java.cainan.questao44;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float soma = 0, media;
        int quantidade;

        System.out.println("Digite a quantidade de valores a serem fornecidos");
        quantidade = input.nextInt();
        for (int i = 0; i < quantidade; i++) {
            soma += input.nextFloat();
        }

        media = soma/quantidade;
        System.out.printf("Média: %.2f", media);
    }
}
