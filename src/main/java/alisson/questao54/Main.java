package main.java.alisson.questao54;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dolar, inicial, fim, incremento;

        System.out.println("Informe o valor inicial:");

        inicial = sc.nextDouble();

        System.out.println("Informe o valor final");
        fim = sc.nextDouble();


        System.out.println("Informe o valor do incremento");
        incremento = sc.nextDouble();


        System.out.println("Informe o valor do dolar");
        dolar = sc.nextDouble();

        while(inicial <= fim){
            System.out.println("Real: "+inicial+"  =  Dolar: "+inicial*dolar);
            inicial+= incremento;

        }



    }
}
