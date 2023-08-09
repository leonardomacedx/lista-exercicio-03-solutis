package main.java.leonardo.questao40;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de pessoas: ");
        int quantidade = scanner.nextInt();

        int maior = 0;
        int menor = 150;
        int soma = 0;
        int maioresIdade = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print(i + "º pessoa: ");
            int idade = scanner.nextInt();

            soma += idade;
            if (idade > maior) {
                maior = idade;
            }
            if (idade < menor) {
                menor = idade;
            }
            if (idade > 18) {
                maioresIdade++;
            }
        }

        float media = (float) soma / quantidade;
        System.out.println("Média das idades: " + String.format("%.2f", media));
        System.out.println("Maior idade: " + maior);
        System.out.println("Menor idade: " + menor);
        System.out.println("Quantidade de maiores de idade: " + maioresIdade);
    }
}
