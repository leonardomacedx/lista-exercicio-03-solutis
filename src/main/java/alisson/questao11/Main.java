package main.java.alisson.questao11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        System.out.println("Digite a idade do cidadão:");
        idade = input.nextInt();

        if(idade < 16){
            System.out.println("Não pode votar!");
        }else if(idade <= 17 || idade >= 65){
            System.out.println("Voto facultativo!");
        }else{
            System.out.println("Voto obrigatório!");
        }
    }
}