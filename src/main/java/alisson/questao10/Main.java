package main.java.alisson.questao10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salarioBruto = 0, descontos = 0, emprestimo = 0;

        System.out.println("Digite o valor do seu salário bruto:");
        salarioBruto = input.nextDouble();

        System.out.println("Digite o valor total dos descontos:");
        descontos = input.nextDouble();

        System.out.println("Digite o valor do possível empréstimo:");
        emprestimo = input.nextDouble();

        if((salarioBruto - descontos) * 0.3 >= emprestimo)
            System.out.println("É possível realizar o empréstimo");
        else
            System.out.println("Não é possivel realizar o empréstimo");
    }
}