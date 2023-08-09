package main.java.victor.questao52;

public class Main {
    public static void main(String[] args) {
        int casa = 64;
        long graosNaUltimaCasa = calcularGraosNaCasa(casa);

        System.out.println("Número de grãos na última casa (casa " + casa + "): " + graosNaUltimaCasa);
    }

    public static long calcularGraosNaCasa(int casa) {
        return (long) Math.pow(2, casa - 1);
    }
}

