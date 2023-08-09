package main.java.alisson.questao8;

import java.util.Scanner;

public class Main {

    private String nome = "Alisson";

    public String parceiro = "Elio";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b;
        System.out.println("Digite o numerador:");
        a = input.nextDouble();
        System.out.println("Digite o denominador:");
        b = input.nextDouble();

        if(b == 0){
            System.out.println("Alerta: Não é possível realizar uma divisão por zero");
        }else{
            System.out.printf("O resultado da divisão é = %.2f", a/b);
        }
    }
}