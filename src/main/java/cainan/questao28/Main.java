package main.java.cainan.questao28;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, aux;
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if (num1 > num3){
            aux = num1;
            num1 = num3;
            num3 = aux;
        }
        if(num1 > num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if(num2 > num3){
            aux = num3;
            num3 = num2;
            num2 = aux;
        }

        System.out.printf("Seguem os números em ordem crescente: %d, %d, %d", num1, num2, num3);
    }
}
