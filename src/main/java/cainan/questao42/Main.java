package main.java.cainan.questao42;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 3; j++) {
                numeros[j] = (int)((Math.random() * 60));
            }
            sortAndPrint(numeros[0], numeros[1], numeros[2]);
        }
    }

    public static void sortAndPrint(int a, int b, int c){
        int aux;

        if (a > c){
            aux = a;
            a = c;
            c = aux;
        }
        if(a > b){
            aux = a;
            a = b;
            b = aux;
        }
        if(b > c){
            aux = c;
            c = b;
            b = aux;
        }

        System.out.printf("[%d, %d, %d]\n", a, b, c);
    }
}
