package main.java.elio.questao16;

import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {

        String[] meses = {
                "janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };


        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número do dia do aniversário: ");
        int dia = scanner.nextInt();


        System.out.print("Digite o nome do mês do aniversário: ");
        String mesDigitado = scanner.next().toLowerCase();


        if (dia < 1 || dia > 31) {
            System.out.println("Dia inválido. O dia deve estar entre 1 e 31.");
            scanner.close();
            return;
        }


        int numeroMes = -1;
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].equals(mesDigitado)) {
                numeroMes = i + 1;
                break;
            }
        }

        if (numeroMes == -1) {
            System.out.println("Mês inválido. Verifique se o nome foi digitado corretamente.");
            scanner.close();
            return;
        }


        boolean dataValida = (dia <= 29 && numeroMes == 2) || (dia <= 30 && (numeroMes == 4 || numeroMes == 6 || numeroMes == 9 || numeroMes == 11)) || (dia <= 31);


        if (dataValida) {
            System.out.println("Data de aniversário válida: " + dia + " de " + meses[numeroMes - 1]);
            int trimestre = (numeroMes - 1) / 3 + 1;
            System.out.println("A pessoa nasceu no " + trimestre + "º trimestre.");
        } else {
            System.out.println("Data de aniversário inválida. Verifique o dia e o mês inseridos.");
        }


        scanner.close();
    }
}
