package main.java.alisson.questao41;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Descubra o numero que ja foi sorteado! (de 0 a 100)");

        int aux=0;
        double valorSorteado =(int) (Math.random()*(100-0))+0,valor;
        boolean acertou = false;

        while(acertou == false){
            aux++;
            System.out.println("Qual seu palpite?");
            valor = sc.nextDouble();

            if (valor == valorSorteado){
                acertou=true;
            } else if (valor > valorSorteado) {
                System.out.println("Quase! O valor sorteado esta mais pra baixo");
            }else {
                System.out.println("Quase! O valor sorteado esta mais pra cima");
            }
        }
        System.out.println("Voce acertou em "+aux+" tentativas!");
    }
}
