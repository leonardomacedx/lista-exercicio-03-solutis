package main.java.cainan.questao30;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite os vértices do primeiro retângulo:");
        double[][] rectangle1 = getRectangle();

        System.out.println("Digite os vértices do segundo retângulo:");
        double[][] rectangle2 = getRectangle();

        if (isOverlapping(rectangle1, rectangle2)) {
            System.out.println("Os retângulos se interceptam.");
        } else {
            System.out.println("Os retângulos não se interceptam.");
        }
    }

    public static boolean isOverlapping(double[][] rectangle1, double[][] rectangle2) {
        Arrays.sort(rectangle1, (a, b) -> Double.compare(a[0], b[0]));
        Arrays.sort(rectangle2, (a, b) -> Double.compare(a[0], b[0]));

        if (rectangle1[2][0] <= rectangle2[0][0] || rectangle2[2][0] <= rectangle1[0][0]) {
            return false;
        }else if (rectangle1[2][1] <= rectangle2[0][1] || rectangle2[2][1] <= rectangle1[0][1]) {
            return false;
        }

        return true;
    }

    public static double[][] getRectangle() {
        double[][] rectangle = new double[4][2];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite as coordenadas x e y de um vértice: ");
            double x = input.nextDouble();
            double y = input.nextDouble();
            rectangle[i][0] = x;
            rectangle[i][1] = y;
        }

        return rectangle;
    }
}
