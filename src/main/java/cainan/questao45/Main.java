package main.java.cainan.questao45;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior = 0, novo;

        System.out.println("Digite 100 números separados por espaços ou quebra de linhas:");

        for (int i = 0; i < 3; i++) {
            novo = input.nextInt();
            if(novo > maior){
                maior = novo;
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
    }
}
