package main.java.elio.questao14;

import java.util.Scanner;

//Receba do usuário o nome de um mês. Exiba o número equivalente.
public class questao14 {

           public static void main(String[] args) {

            String[] meses = {
                    "janeiro", "fevereiro", "março", "abril", "maio", "junho",
                    "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
            };

           Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o nome de um mês: ");
            String mesDigitado = scanner.nextLine().toLowerCase();

            int numeroMes = -1;
            for (int i = 0; i < meses.length; i++) {
                if (meses[i].equals(mesDigitado)) {
                    numeroMes = i + 1;
                    break;
                }
            }


            if (numeroMes != -1) {
                System.out.println("O mês '" + mesDigitado + "' é o mês " + numeroMes);
            } else {
                System.out.println("Mês não encontrado. Verifique se o nome foi digitado corretamente.");
            }

            scanner.close();
        }
    }