package main.java.alisson.questao20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomePUm, nomePDois;
        int idadePUm, idadePDois;

        System.out.println("Informe os dados da pessoa 1 e da pessoa 2:");
        System.out.println("Nome da pessoa 1:");
        nomePUm = sc.nextLine();

        System.out.println("Idade da pessoa 1:");
        idadePUm = sc.nextInt();

        sc.nextLine();

        System.out.println("-------------------------");
        System.out.println("Nome da pessoa 2:");
        nomePDois = sc.nextLine();

        System.out.println("Idade da pessoa 2:");
        idadePDois = sc.nextInt();

        sc.nextLine();

        if (idadePUm >= idadePDois){
            System.out.println("Pessoa mais velha: "+nomePUm);
            System.out.println("Pessoa mais nova: "+nomePDois);
        }else {
            System.out.println("Pessoa mais velha: "+nomePDois);
            System.out.println("Pessoa mais nova: "+nomePUm);
        }
    }
}
