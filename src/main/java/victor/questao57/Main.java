package main.java.victor.questao57;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/* Entre reutilizar os códigos da questão 24, me dei ao luxo de importar de Time o LocalDate e o Formatter
 utilizando ofPattern, isBefore e plusDays para facilitar */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Informe a data inicial (dd/MM/yyyy): ");
        String dataInicialStr = scanner.next();
        LocalDate dataInicial = LocalDate.parse(dataInicialStr, dateFormatter);

        System.out.print("Informe a data final (dd/MM/yyyy): ");
        String dataFinalStr = scanner.next();
        LocalDate dataFinal = LocalDate.parse(dataFinalStr, dateFormatter);

        System.out.println("Datas entre " + dataInicialStr + " e " + dataFinalStr + ":");

        LocalDate dataAtual = dataInicial.plusDays(1);
        while (dataAtual.isBefore(dataFinal)) {
            System.out.println(dataAtual.format(dateFormatter));
            dataAtual = dataAtual.plusDays(1);
        }

        scanner.close();
    }
}
