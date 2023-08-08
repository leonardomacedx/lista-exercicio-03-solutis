package main.java.leonardo.questao55;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorTotal = 50;
        double minutosSaldo = 100;

        while (true) {
            System.out.print("""
                    Tipo de ligação:
                    (o para outras operadoras)
                    (v para operadora vai-vai)
                    (f para telefone fixo)
                    (outro para finalizar):\s""");

            char tipo = scanner.next().charAt(0);
            if (tipo != 'o' && tipo != 'v' && tipo != 'f') {
                break;
            }
            System.out.println("Quantidade de minutos: ");
            double min = scanner.nextFloat();

            if (tipo == 'v') {
                minutosSaldo += 50;
            } else if (tipo == 'f') {
                min /= 2;
            }

            if (min > minutosSaldo) {
                double excedente = min - minutosSaldo;
                double valorMais;

                if (tipo == 'o' || tipo == 'f') {
                    valorMais = excedente * 0.65;
                } else {
                    valorMais = excedente * 0.20;
                }

                valorTotal += valorMais;
                minutosSaldo = 0;
            }
            else {
                minutosSaldo -= min;
            }

            System.out.println("Minutos restantes: " + minutosSaldo);
            System.out.println("Valor total: " + valorTotal);
            System.out.println();
        }

        System.out.println("Valor final: R$" + String.format("%.2f", valorTotal));
        System.out.println("Fim!");
    }
}
