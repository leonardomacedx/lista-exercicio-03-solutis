package main.java.elio.questao01;

import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int anoAtual, anoNascimento, idade;

        System.out.println("Qual é o ano atual?");
        anoAtual = scan.nextInt();
        System.out.println("Qual o seu ano de nascimento?");
        anoNascimento = scan.nextInt();

        idade = anoAtual - anoNascimento;
        System.out.println("Você fará " + idade + " anos em 2023");
    }
}