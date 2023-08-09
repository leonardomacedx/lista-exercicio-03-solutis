package main.java.victor.questao36;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiro = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundo = scanner.nextInt();

        for (int i = primeiro + 1; i < segundo; i++) {
            if (i % 2 !=0){
                System.out.println(i);
            }

        }


    }
}
