package main.java.cainan.questao49;

public class Main {
    public static void main(String[] args) {
        long atual = 0;
        long anterior = 0;

        System.out.println("Seguem os 50 primeiros números da sequencia de Fibonnaci:");
        for (int i = 1; i <= 50; i++) {
                if(i == 1){
                    atual = 1;
                    anterior = 0;
                }else{
                    atual += anterior;
                    anterior = atual - anterior;
                }
            System.out.println(atual);
        }
    }
}
