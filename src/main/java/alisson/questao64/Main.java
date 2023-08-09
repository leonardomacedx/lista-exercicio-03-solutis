package main.java.alisson.questao64;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdTriangulos = sc.nextInt();
        System.out.println("Digite a quantidade de triangulos que voce deseja:");
        int aux = 0;
        for(int x= 0; x<= qtdTriangulos; x++){
            for (int i = 0; i < x; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
