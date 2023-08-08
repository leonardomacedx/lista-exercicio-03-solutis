package main.java.elio.questao07;

import java.util.Scanner;

//Calcule e exiba a comissão de 10% de um garçom num restaurante a partir do valor da
//despesa de um cliente.
public class questao07 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       double comissao, despesaCliente;
        System.out.println("Digite a despesa do cliente: ");
        despesaCliente = scan.nextDouble();
        comissao = despesaCliente * 10/100;
        System.out.println("A comissão do garçom foi de R$ " + String.format("%.2f,",comissao) + " reais.");
    }
}
