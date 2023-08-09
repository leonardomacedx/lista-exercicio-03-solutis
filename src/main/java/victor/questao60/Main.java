package main.java.victor.questao60;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double divida, taxa;
        int anos, anoInicial = 2007;

        System.out.println("Digite o valor da dívida:");
        divida = input.nextDouble();
        System.out.println("Digite a taxa de correção:");
        taxa = input.nextDouble();
        System.out.println("Digite a quantidade de anos:");
        anos = input.nextInt();

        printTitle();
        for (int i = 0; i < anos; i++) {
            System.out.printf("| %d |", anoInicial+i);
            for (int j = 0; j < 12; j++) {
                System.out.printf(" %.2f |", divida);
                divida += (divida*(taxa/100));
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------");

    }

    public static void printTitle(){
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println("| Anos |  Jan   |  Fev   |  Mar   |  Abr   |  Mai   |  Jun   |  Jul   |  Ago   |  Set   |  Out   |  Nov   |  Dez   |");
    }
}