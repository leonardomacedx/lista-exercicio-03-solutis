package main.java.victor.questao24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a data (dia/mês/ano): ");
        String data = scanner.nextLine();

        String[] dataParte = data.split("/");
        if (dataParte.length != 3){
            System.out.println("Formato de data inválido. Tente colocar por exemplo: 10/10/2010");
            return;
        }

        int dia = Integer.parseInt(dataParte[0]);
        int mes = Integer.parseInt(dataParte[1]);
        int ano = Integer.parseInt(dataParte[2]);

        boolean dataValida = verificarData(dia, mes, ano);
        if (dataValida){
            System.out.println("A data digitada é válida!");
        } else {
            System.out.println("A data digitada não é válida!");
        }
    }
    public static boolean verificarData(int dia, int mes, int ano){
        if (dia < 1 || mes < 1 || mes > 12 || dia < 1){
            return false;
        }

        if (mes == 2){
            if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0){
                return dia <= 29;
            } else {
                return dia <=28;
            }
        } else if(mes == 4 || mes == 6 || mes == 11){
            return dia <= 30;
        } else {
            return dia <=31;
        }


    }


}
