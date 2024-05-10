package aula06_exercicio2;

public class Pessoa {
    public String nome;
    public int idade;

    public String pedeNome(){
        return nome;
    }
    public int pedeIdade(){
        return idade;
    }
    public void fazAniversario(){
        idade +=1;
    }
}
