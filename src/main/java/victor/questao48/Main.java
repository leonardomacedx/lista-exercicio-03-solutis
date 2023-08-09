package main.java.victor.questao48;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número de notas: ");
        int numeroNotas = scanner.nextInt();

        System.out.println("Informe o número de faltas: ");
        int faltas = scanner.nextInt();

        double somaNotas = 0;

        for (int i = 1 ; i <= numeroNotas ; i++){
            System.out.println("Informe a" + i + "ª nota: ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / numeroNotas;


        String mediaFormatada = String.format("%.2f", media);
        System.out.println("Sua média semestral é: " + mediaFormatada);

        if(media >= 5){
            if (faltas <= 4) {
                System.out.println("Parabéns, aluno aprovado!");
            } else {
                System.out.println("Que pena, aluno reprovado por faltas.");
            }
        } else {
            System.out.println("Que pena, aluno reprovado por nota.");
        }



    }
}
