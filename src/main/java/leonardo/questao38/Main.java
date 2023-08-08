package main.java.leonardo.questao38;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número: ");
        int num = scanner.nextInt();
        int divisores = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            System.out.println("O número é primo!");
        }
        else {
            System.out.println("O número não é primo.");
        }
    }
}
