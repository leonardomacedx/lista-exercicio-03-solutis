package main.java.cainan.questao34;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seguem 50 numeros sorteados entre 1 e 100");
        for (int i = 0; i < 50  ; i++) {
            System.out.println((int)((Math.random() * 100) + 1));
        }
    }
}
