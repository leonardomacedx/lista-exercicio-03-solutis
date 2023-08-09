package main.java.cainan.questao47;

public class Patient {
    private String name = "";
    private String sexo = "";
    private float altura = 0f;
    private float peso = 0f;
    private int idade = 0;

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public String getName() {
        return name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
