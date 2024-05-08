package aula05;

public class Principal {
    public static void main(String[] args){

        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);
        String linhaHifen2 = "=".repeat(tamanhoLinha);

        Time time1 = new Time();
        time1.nome = "Sao Paulo";
        time1.titulos = 30;
        time1.atletas = 45;
        time1.jogaHoje = true;

        Time time2 = new Time();
        time2.nome = "Palmeiras";
        time2.titulos = 40;
        time2.atletas = 50;
        time2.jogaHoje = false;

        System.out.println(linhaHifen2);
        System.out.println("Instanciando a classe Time:");
        System.out.println(linhaHifen2);
        System.out.println("Nome: " + time1.nome);
        System.out.println("Titulos: " + time1.titulos);
        System.out.println("Atletas: " + time1.atletas);
        System.out.println("Joga hoje: " + time1.jogaHoje);
        System.out.println(linhaHifen);
        System.out.println("Nome: " + time2.nome);
        System.out.println("Titulos: " + time2.titulos);
        System.out.println("Atletas: " + time2.atletas);
        System.out.println("Joga hoje: " + time2.jogaHoje);
        time1.fezGol();
        time1.nomeTime();



        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.nome = "Thiago";
        p2.nome = "Tito";
        p1.profissao = "Professor";
        p2.profissao = "Desenvolvedor";
        p1.altura = 1.65;
        p2.altura = 1.70;
        p1.idade = 41;
        p2.idade = 42;
        p1.peso = 65.7;
        p2.peso = 65.9;

        System.out.println(linhaHifen2);
        System.out.println("Instanciando a classe Pessoa:");
        System.out.println(linhaHifen2);
        System.out.println("Nome: " + p1.nome);
        System.out.println("Profissao: " + p1.profissao);
        System.out.println("Altura: " + p1.altura);
        System.out.println("Peso: " + p1.peso);
        System.out.println(linhaHifen);
        System.out.println("Nome: " + p2.nome);
        System.out.println("Profissao: " + p2.profissao);
        System.out.println("Altura: " + p2.altura);
        System.out.println("Peso: " + p2.peso);
        System.out.println(linhaHifen);

        Onibus onubus1 = new Onibus();
        onubus1.marca = "BMW";
        onubus1.totalLugares = 100;
        onubus1.revisado = true;
        onubus1.fabricacao = 2021;
        Onibus onibus2 = new Onibus();
        onibus2.marca = "CAIO";
        onibus2.totalLugares = 120;
        onibus2.revisado = false;
        onibus2.fabricacao =2015;

        System.out.println(linhaHifen2);
        System.out.println("Instanciando a classe Onibus:");
        System.out.println(linhaHifen2);
        System.out.println("Marca: " + onubus1.marca);
        System.out.println("Total de lugares: " + onubus1.totalLugares);
        System.out.println("Revisado: " + onubus1.revisado);
        System.out.println(linhaHifen);
        System.out.println("Marca: " + onibus2.marca);
        System.out.println("Total de lugares: " + onibus2.totalLugares);
        System.out.println("Revisado: " + onibus2.revisado);
        System.out.println(linhaHifen);
    }
}
