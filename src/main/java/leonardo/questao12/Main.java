package main.java.leonardo.questao12;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Segunda nota: ");
        float nota2 = scanner.nextFloat();
        System.out.print("Terceira nota: ");
        float nota3 = scanner.nextFloat();

        float media = (nota1 + nota2 + nota3)/3;

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media < 7 && media >= 5 ) {
            System.out.println("Em recuperação!");
        }
        else {
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}