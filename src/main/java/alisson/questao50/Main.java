package main.java.alisson.questao50;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> trib = new ArrayList<>();

        trib.add(1);
        trib.add(1);

        System.out.println("Qual é o n-esimo número que você deseja ver da sequencia de fibonacci?");
        int quantidade = sc.nextInt(), soma;

        for (int i = 0; i < quantidade; i++) {
            soma = 0;
            for (int j = 0; j <2; j++) {
                soma+=trib.get((trib.size()-j)-1);
            }
            trib.add(soma);
        }
        System.out.println(trib.get(quantidade-1));
    }
}
