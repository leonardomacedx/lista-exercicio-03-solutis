package main.java.leonardo.questao19;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        float num1 = scanner.nextFloat();
        System.out.println("Segundo número: ");
        float num2 = scanner.nextFloat();

        if (num1 > num2) {
            System.out.println(num2 + ", " + num1);
        } else {
            System.out.println(num1 + ", " + num2);
        }

    }
}
