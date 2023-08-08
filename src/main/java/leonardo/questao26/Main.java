package main.java.leonardo.questao26;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Informe o primeiro horário (hh:mm:ss):");
        String horario1 = scanner.nextLine();

        System.out.println("Informe o segundo horário (hh:mm:ss):");
        String horario2 = scanner.nextLine();

        LocalTime horarioFmt1 = LocalTime.parse(horario1, fmt);
        LocalTime horarioFmt2 = LocalTime.parse(horario2, fmt);


        Duration duracao = Duration.between(horarioFmt1, horarioFmt2);
        System.out.println("Diferença em segundos: " + duracao.getSeconds());
    }
}
