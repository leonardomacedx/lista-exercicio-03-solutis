package main.java.elio.questao04;

import java.util.Scanner;

//4. Determine e exiba a média aritmética de um aluno a partir de suas 4 notas.
public class questao04 {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;
        System.out.println("Digite a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = scan.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = scan.nextDouble();
        System.out.println("Digite a quarta nota: ");
        nota4 = scan.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média aritmética é = " + media);
    }
}
