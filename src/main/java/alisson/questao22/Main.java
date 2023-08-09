package main.java.alisson.questao22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aniversarioUm, aniversarioDois;
        boolean iguais =false;

        System.out.println("Informe a primeira data: (Ex: 29/12/2001)");
        aniversarioUm = sc.nextLine();

        System.out.println("Informe a segunda data: (Ex: 29/12/2001)");
        aniversarioDois = sc.nextLine();

        iguais = aniversarioUm.substring(3,5).equals(aniversarioDois.substring(3,5)) ? aniversarioUm.substring(0,2).equals(aniversarioDois.substring(3,5)) ? true:false : false;

        if (iguais){
            System.out.println("Essas datas "+aniversarioUm+" e "+aniversarioDois+ " são iguais");
        }else {
            System.out.println("Essas datas "+aniversarioUm+" e "+aniversarioDois+" são diferentes");
        }
    }
}
