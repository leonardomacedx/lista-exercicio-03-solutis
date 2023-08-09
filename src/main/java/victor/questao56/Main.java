package main.java.victor.questao56;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do primeiro candidato: ");
        String candidato1 = scanner.nextLine();

        System.out.print("Informe o nome do segundo candidato: ");
        String candidato2 = scanner.nextLine();

        System.out.print("Informe o nome do terceiro candidato: ");
        String candidato3 = scanner.nextLine();

        int totalVotos = 0;
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosEmBranco = 0;

        while (true) {
            System.out.println("Escolha um candidato para votar\n" +
                    "1 -"+ candidato1 + "\n2 -" + candidato2 + "\n3- " + candidato3 + "\n0 - Para voto em branco");
            int voto = scanner.nextInt();

            if (voto == 0) {
                votosEmBranco++;
            } else if (voto == 1) {
                votosCandidato1++;
            } else if (voto == 2) {
                votosCandidato2++;
            } else if (voto == 3) {
                votosCandidato3++;
            } else {
                System.out.println("Opção inválida! Você deve digitar 1, 2 ou 3 para votar em um candidato ou 0 para votar em branco.");
            }

            totalVotos++;

            System.out.print("Deseja continuar votando? (S/N): ");
            String continuar = scanner.next();

            if (continuar.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println("Resultado da Eleição:");
        System.out.println(candidato1 + ": " + votosCandidato1 + " votos (" + (votosCandidato1 * 100.0 / totalVotos) + "%)");
        System.out.println(candidato2 + ": " + votosCandidato2 + " votos (" + (votosCandidato2 * 100.0 / totalVotos) + "%)");
        System.out.println(candidato3 + ": " + votosCandidato3 + " votos (" + (votosCandidato3 * 100.0 / totalVotos) + "%)");
        System.out.println("Votos em branco: " + votosEmBranco + " votos (" + (votosEmBranco * 100.0 / totalVotos) + "%)");

        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            System.out.println("O ganhador da eleição é: " + candidato1);
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            System.out.println("O ganhador da eleição é: " + candidato2);
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            System.out.println("O ganhador da eleição é: " + candidato3);
        } else {
            System.out.println("A eleição terminou em empate.");
        }

        scanner.close();
    }
}
