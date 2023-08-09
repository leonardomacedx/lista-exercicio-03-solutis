package main.java.elio.questao37;

import java.util.Scanner;

//37. Calcule o fatorial de um número.
public class questao37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scan.nextInt();
        int fatorial = 1;


        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
