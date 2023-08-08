package main.java.leonardo.questao23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa:");
        String nome1 = scanner.nextLine();
        int dia1, mes1;

        do {
            System.out.println("Digite o dia de nascimento da primeira pessoa (1-31):");
            dia1 = scanner.nextInt();
        } while (dia1 < 1 || dia1 > 31);

        do {
            System.out.println("Digite o mês de nascimento da primeira pessoa (1-12):");
            mes1 = scanner.nextInt();
        } while (mes1 < 1 || mes1 > 12);

        System.out.println("Digite o nome da segunda pessoa:");
        scanner.nextLine();
        String nome2 = scanner.nextLine();
        int dia2, mes2;

        do {
            System.out.println("Digite o dia de nascimento da segunda pessoa (1-31):");
            dia2 = scanner.nextInt();
        } while (dia2 < 1 || dia2 > 31);

        do {
            System.out.println("Digite o mês de nascimento da segunda pessoa (1-12):");
            mes2 = scanner.nextInt();
        } while (mes2 < 1 || mes2 > 12);

        if (mes1 < mes2 || (mes1 == mes2 && dia1 < dia2)) {
            System.out.println("O primeiro aniversariante é: " + nome1);
        } else if (mes2 < mes1 || (mes2 == mes1 && dia2 < dia1)) {
            System.out.println("O primeiro aniversariante é: " + nome2);
        } else {
            System.out.println("Ambas as pessoas fazem aniversário no mesmo dia.");
        }
    }
}
