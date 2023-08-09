package main.java.leonardo.questao27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        float num1 = scanner.nextFloat();
        System.out.print("Segundo valor: ");
        float num2 = scanner.nextFloat();
        System.out.print("Terceiro valor: ");
        float num3 = scanner.nextFloat();

        float maior;

        if (num1 > num2 && num1 > num3) {
            maior = num1;
        } else if (num2 > num1 && num2 > num3 ) {
            maior = num2;
        } else if (num3 > num1 && num3 > num2) {
            maior = num3;
        } else {
            System.out.println("Os números são todos iguais!");
            return;
        }

        System.out.println("O número " + maior + " é o maior");

    }
}
