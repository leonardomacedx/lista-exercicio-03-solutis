package main.java.leonardo.questao35;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd, min, max;

        System.out.println("Informe quantos numeros sorteados voce deseja:");
        qtd = sc.nextInt();

        System.out.println("Informe também qual a faixa do sorteio. Comece informando o minimo:");
        min = sc.nextInt();

        System.out.println("Agora o informe o maximo:");
        max = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            if(i!= qtd-1){
                System.out.print((int) (Math.random()*(max-min))+min+" - ");
            }else{
                System.out.print((int) (Math.random()*(max-min))+min);
            }
        }
    }
}
