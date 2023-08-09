package main.java.leonardo.questao46;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> listaSexo = new ArrayList<>();
        List<Integer> listaIdade = new ArrayList<>();
        int homens = 0;
        int mulheres = 0;

        //Homens são representados por 1 e mulheres por 2
        for (int i = 0; i < 200; i++){
            int idade = random.nextInt(1, 110);
            int sexo = random.nextInt(1, 3);
            listaSexo.add(sexo);
            listaIdade.add(idade);
        }

        for (int i = 0; i < listaSexo.size(); i++) {
            if (listaIdade.get(i) > 18) {
                if (listaSexo.get(i) == 1) {
                    homens++;
                } else {
                    mulheres++;
                }
            }
        }

        System.out.println("Homens maiores de idade: " + homens);
        System.out.println("Mulheres maiores de idade: " + mulheres);
    }
}
