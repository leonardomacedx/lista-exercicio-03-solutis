package main.java.cainan.questao39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, soma = 0;
        System.out.println("Digite um número inteiro:");
        num = input.nextInt();

        for (int i = 1; i < num; i++) {
            if(num%i ==0){
                soma += i;
            }
        }
        if(num == soma){
            System.out.println("O número " + num + " é perfeito");
        }else{
            System.out.println("O número " + num + " não é perfeito");
        }
    }
}
