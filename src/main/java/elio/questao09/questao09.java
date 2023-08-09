package main.java.elio.questao09;

import java.util.Scanner;

//9. Verifique se o usuário é maior de idade ou não.
public class questao09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.println("Digite a idade: ");
        idade = scan.nextInt();
        if (idade<18){
            System.out.println("Menor de idade: ");
      }
        else{
            System.out.println("Maior de idade.");
        }
    }
}