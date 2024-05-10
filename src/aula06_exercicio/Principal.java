package aula06_exercicio;

public class Principal {
    public static void main(String[] args){
        Matematica operacao = new Matematica();

       System.out.println("A soma entre 2 e 3 e igual a " + operacao.soma(2,3));
       System.out.println("O fatorial de 3 e igual a " + operacao.fatorial(3));
       System.out.println(operacao.fatorial2(3));
    }
}
