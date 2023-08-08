package main.java.cainan.questao62;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade;

        System.out.println("Digite o número de linhas desejado:");
        quantidade = input.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            for (int j = 0; j < i; j++) {
                if(j + 1 == i)
                    System.out.printf("%02d", i);
                else
                    System.out.printf("%02d ", i);
            }
            System.out.println();
        }
    }
}
