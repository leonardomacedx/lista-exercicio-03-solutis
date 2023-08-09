package main.java.cainan.questao47;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Patient patient;
        List<Patient> listaPatients = new ArrayList<>();

        System.out.println("Digite as informaçoes do paciente, digite fim, no lugar do nome quando desejar finalizar o programa!");
        printExample();

        do {
            patient = new Patient();
            patient.setName(input.next());
            if (patient.getName().equals("fim")) break;

            patient.setSexo(input.next().toUpperCase());
            patient.setPeso(input.nextFloat());
            patient.setAltura(input.nextFloat());
            patient.setIdade(input.nextInt());

            listaPatients.add(patient);

        } while (!patient.getName().equals("fim"));

        printRelatorio(listaPatients);
    }

    public static void printList(List<Patient> a){
        for (Patient patient: a) {
            System.out.printf("%s %s %f %f %d", patient.getName(), patient.getSexo(), patient.getPeso(), patient.getAltura(), patient.getIdade());
        }
    }

    public static void printExample(){
        System.out.println("-----------Exemplo-----------");
        System.out.println(" NOME H/M PESO ALTURA IDADE ");
        System.out.println("-----------------------------");
    }

    public static void printRelatorio(List<Patient> a){
        System.out.println("----------Relatório----------");
        System.out.println("Quantidade de pacientes: " + totalPatients(a));
        System.out.println("Média de idade entre homens: " + mediaAge(a));
        System.out.println("Mulheres entre 1,60 e 1,70 e acima de 70kg: " + countFemaleWithHeightWeight(a));
        System.out.println("Número de pessoas entre 18 e 25 anos: " + patientsInRange(a));
        System.out.println("Nome do paciente mais velho: " + olderPatient(a));
        System.out.println("Nome da mulher mais baixa: " + shorterFemalePatient(a));
        System.out.println("-----------------------------");
    }

    public static int totalPatients(List<Patient> a){
        return a.size();
    }

    public static double mediaAge(List<Patient> a){
        int somaIdade = 0, numPatients = 0;
        for (Patient patient : a) {
            if (patient.getSexo().equals("H")) {
                somaIdade += patient.getIdade();
                numPatients++;
            }
        }
        if(numPatients == 0) return 0f;
        return (float)somaIdade/numPatients;
    }

    public static int countFemaleWithHeightWeight(List<Patient> a){
        float peso, altura;
        int count = 0;
        for (Patient patient : a) {
            altura = patient.getAltura();
            peso = patient.getPeso();
            if (patient.getSexo().equals("M") && altura > 1.60 && altura < 1.70 && peso > 70) {
                count++;
            }
        }
        return count;
    }
    public static int patientsInRange(List<Patient> a){
        int age, count = 0;
        for (Patient patient : a) {
            age = patient.getIdade();
            if (age >= 18 && age <= 25) {
                count++;
            }
        }
        return count;
    }
    public static String olderPatient(List<Patient> a){
        Patient olderPaciente;
        olderPaciente = new Patient();
        for (Patient patient : a) {
            if (olderPaciente.getIdade() < patient.getIdade()) {
                olderPaciente = patient;
            }
        }

        return olderPaciente.getName();
    }
    public static String shorterFemalePatient(List<Patient> a){
        Patient shorterPatient = new Patient();
        for (Patient patient : a) {
            if (patient.getSexo().equals("M") && (shorterPatient.getAltura() > patient.getAltura() || shorterPatient.getAltura() == 0f) ) {
                shorterPatient = patient;
            }
        }

        return shorterPatient.getName();
    }
}
