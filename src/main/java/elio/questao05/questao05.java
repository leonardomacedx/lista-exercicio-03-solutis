package main.java.elio.questao05;

import java.util.Scanner;

/*Calcule e exiba o valor final de uma dívida. Para isto pergunte ao usuário o valor inicial do
débito, a quantidade de meses e os juros mensais. Use o calculo de juros simples. */
public class questao05 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      double valorInicial, meses, juros, valorDivida;

        System.out.println("Valor inicial do débito: ");
        valorInicial = scan.nextDouble();
        System.out.println("Meses de dívida: ");
        meses = scan.nextDouble();

        juros = (valorInicial * 10/100 * meses);
        valorDivida = (juros + valorInicial);
        System.out.println("O valor da dívida atual é de " + String.format("%.2f",valorDivida) + " reais");

    }
}
