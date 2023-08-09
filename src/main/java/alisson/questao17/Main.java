package main.java.alisson.questao17;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        String[] meses = {
                "janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };


        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número do dia do aniversário: ");
        int dia = scanner.nextInt();


        System.out.print("Digite o nome do mês do aniversário: ");
        String mesDigitado = scanner.next().toLowerCase();


        if (dia < 1 || dia > 31) {
            System.out.println("Dia inválido. O dia deve estar entre 1 e 31.");
            scanner.close();
            return;
        }


        int numeroMes = -1;
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].equals(mesDigitado)) {
                numeroMes = i + 1;
                break;
            }
        }

        if (numeroMes == -1) {
            System.out.println("Mês inválido. Verifique se o nome foi digitado corretamente.");
            scanner.close();
            return;
        }


        boolean dataValida = (dia <= 29 && numeroMes == 2) || (dia <= 30 && (numeroMes == 4 || numeroMes == 6 || numeroMes == 9 || numeroMes == 11)) || (dia <= 31);


        if (dataValida) {
            System.out.println("Data de aniversário válida: " + dia + " de " + meses[numeroMes - 1]);
            int trimestre = (numeroMes - 1) / 3 + 1;
            System.out.println("A pessoa nasceu no " + trimestre + "º trimestre.");
            System.out.println(descobrirSigno(dia, mesDigitado));


        } else {
            System.out.println("Data de aniversário inválida. Verifique o dia e o mês inseridos.");
        }


        scanner.close();
    }

    public static String descobrirSigno(int dia, String mes){
        String frase= "O signo e: ";
        if ((mes.equals("janeiro") && dia <=20)||(mes.equals("dezembro") && dia >=22)){
            frase+="Capricornio";
        } else if ((mes.equals("janeiro") && dia <=21)||(mes.equals("fevereiro") && dia <=18)) {
            frase+="Aquario";
        } else if ((mes.equals("fevereiro") && dia >=19)||(mes.equals("marco") && dia <=20)) {
            frase+="Peixes";
        } else if ((mes.equals("marco") && dia >=21)||(mes.equals("abril") && dia <=20)) {
            frase+="Aries";
        } else if ((mes.equals("abril") && dia >=21)||(mes.equals("maio") && dia <=20)) {
            frase+="Touro";
        } else if ((mes.equals("maio") && dia >=21)||(mes.equals("junho") && dia <=20)) {
            frase+="Gemeos";
        } else if ((mes.equals("junho") && dia >=21)||(mes.equals("julho") && dia <=22)) {
            frase+="Cancer";
        } else if ((mes.equals("julho") && dia >=23)||(mes.equals("agosto") && dia <=22)) {
            frase+="Leao";
        } else if ((mes.equals("agosto") && dia >=23)||(mes.equals("setembro") && dia <=22)) {
             frase+="Virgem";
        } else if ((mes.equals("setembro") && dia >=23)||(mes.equals("outubro") && dia <=22)) {
            return frase+"Libra";
        } else if ((mes.equals("outubro") && dia >=23)||(mes.equals("novembro") && dia <=21)) {
            frase+="Escorpiao";
        } else if ((mes.equals("novembro") && dia >=23)||(mes.equals("dezembro") && dia <=22)) {
            frase+="Sagitario";
        }
        return frase;
    }
}