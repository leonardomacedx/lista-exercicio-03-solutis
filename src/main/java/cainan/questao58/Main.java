package main.java.cainan.questao58;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a data no formato dd/MM/yyyy: ");
        String dateString = input.next();

        System.out.print("Digite a quantidade de dias a serem adicionados: ");
        int daysToAdd = input.nextInt();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = LocalDate.parse(dateString, dateFormatter);
        LocalDate newDate = date.plusDays(daysToAdd);
        String newDateString = newDate.format(dateFormatter);

        System.out.println("Nova data após adicionar " + daysToAdd + " dias: " + newDateString);

        }
    }
