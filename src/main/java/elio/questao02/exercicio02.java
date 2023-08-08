package main.java.elio.questao02;
/*Calcule e exiba a quantidade de salários mínimos que um determinado funcionário ganha.
Para isto, peça o valor do seu salário e o valor do salário mínimo atual.*/

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            double salario, salarioMinimo, resultado;

        System.out.println("Quanto você ganha? ");
        salario = scan.nextDouble();
        System.out.println("Qual é o valor do salário mínimo? ");
        salarioMinimo = scan.nextDouble();

        resultado = salario / salarioMinimo;
        System.out.println("Você recebe " + String.format("%.2f",resultado) + " salários mínimos.");
    }
}
