package main.java.alisson.questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int men, woman, total;
        double menPercentage, womanPercentage;
        System.out.println("Informe a quantidade de homens na turma:");
        men = input.nextInt();
        System.out.println("Informe a quantidade de mulheres na turma:");
        woman = input.nextInt();
        total = men + woman;
        menPercentage = (double)men/total;
        womanPercentage = (double)woman/total;
        System.out.printf("Existem %.2f%% de homens e %.2f%% de mulheres na turma", menPercentage*100, womanPercentage*100);
    }
}
