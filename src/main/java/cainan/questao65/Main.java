package main.java.cainan.questao65;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade;

        System.out.println("Digite o número de linhas desejado:");
        quantidade = input.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            for (int j = quantidade - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
