package main.java.victor.questao29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Receber as coordenadas dos vértices do retângulo
        System.out.println("Digite as coordenadas do vértice superior esquerdo (x1,y1):");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Digite as coordenadas do vértice inferior direito (x2,y2):");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // Verificar o tipo de retângulo
        String rectangleType = "";
        if (x1 == x2 && y1 == y2) {
            rectangleType = "Ponto";
        } else if (x1 == x2) {
            rectangleType = "Reta Vertical";
        } else if (y1 == y2) {
            rectangleType = "Reta Horizontal";
        } else {
            rectangleType = "Retângulo";
        }

        System.out.println("Tipo de figura: " + rectangleType);

        // Calcular a área do retângulo
        int area = Math.abs((x2 - x1) * (y2 - y1));
        System.out.println("Área do retângulo: " + area);

        // Receber as coordenadas do ponto adicional
        System.out.println("Digite as coordenadas do ponto adicional (x y):");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // Verificar a posição do ponto em relação ao retângulo
        String position = "";
        if (x < x1 && y > y2) {
            position = "Acima e à esquerda";
        } else if (x > x2 && y > y2) {
            position = "Acima e à direita";
        } else if (x < x1 && y < y1) {
            position = "Embaixo e à esquerda";
        } else if (x > x2 && y < y1) {
            position = "Embaixo e à direita";
        } else if (x < x1) {
            position = "À esquerda";
        } else if (x > x2) {
            position = "À direita";
        } else if (y > y2) {
            position = "Acima";
        } else if (y < y1) {
            position = "Embaixo";
        } else {
            position = "Dentro do retângulo";
        }

        System.out.println("Posição do ponto em relação ao retângulo: " + position);

        scanner.close();
    }
}