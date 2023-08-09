package main.java.victor.questao13;

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
        } else if (media >= 5) {
            System.out.println("Em recuperação. Faça a prova final!");
            System.out.print("Nota na prova final: ");
            float notaFinal = scanner.nextFloat();

            if (notaFinal >= 5.0) {
                System.out.println("Aprovado após prova final!");
            } else {
                System.out.println("Reprovado após prova final!");
            }
        }else {
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}
