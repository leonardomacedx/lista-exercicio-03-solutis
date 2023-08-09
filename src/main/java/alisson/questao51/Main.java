package main.java.alisson.questao51;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> trib = new ArrayList<>();

        trib.add(1);
        trib.add(1);
        trib.add(2);

        System.out.println("Quantos numeros você deseja que tenha em sua tribonacci? ");
        int quantidade = sc.nextInt(), soma;

        for (int i = 1; i <= quantidade; i++) {
            soma = 0;
            for (int j = 0; j <3; j++) {
                soma+=trib.get((trib.size()-j)-1);
            }
            trib.add(soma);
        }
        System.out.println(trib);
    }
}
