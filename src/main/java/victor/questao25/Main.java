package main.java.victor.questao25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um horário (hh:mm:ss): ");
        String horario = scanner.nextLine();

        String[] horarioParte = horario.split(":");
        if (horarioParte.length != 3){
            System.out.println("Formato de horário inválido. Tente colocar por exemplo: 10:10:10");
            return;
        }

        int hora = Integer.parseInt(horarioParte[0]);
        int minuto = Integer.parseInt(horarioParte[1]);
        int segundo = Integer.parseInt(horarioParte[2]);

        boolean horarioValido = verificarHorario(hora, minuto, segundo);
            if (horarioValido){
                System.out.println("O horário digitado é válida");
            } else {
                System.out.println("O horário digitado não é válido");
            }
        }



    public static boolean verificarHorario(int hora, int minuto, int segundo){
        if (hora < 0 || hora > 23 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59){
            return false;
        }
        return true;

    }
}
