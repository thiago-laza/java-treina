package aula06_exercicio2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        p1.nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        p1.idade = scanner.nextInt();

        p1.pedeNome();
        p1.pedeIdade();
        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
        p1.fazAniversario();
        System.out.println("'Nova' idade:  " + p1.idade);

        scanner.close();
    }
}
