package main.java.victor.questao21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o código do cargo do funcionário da empresa:\n1 - Diretoria\n2 - Gerência\n3 - Operacional");
        int cargo = scanner.nextInt();

        System.out.println("Informe o salário do funcionário: ");
        double salario = scanner.nextDouble();

        double percentual = 0.0;

        switch(cargo){
            case 1:
                percentual = 0.3;
                break;
            case 2:
                percentual = 0.25;
                break;
            case 3:
                percentual = 0.2;
                break;
            default:
                System.out.println("Cargo inválido, você deve digitar um número de 1 a 3 de acordo com o cargo desejado");
        }

        double emprestimo = salario * percentual;
        System.out.println("O valor do empréstimo possível é: " + emprestimo);


    }
}