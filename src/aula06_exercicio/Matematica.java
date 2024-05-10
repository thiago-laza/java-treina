package aula06_exercicio;

public class Matematica {

    public  int soma(int a, int b){
        return a + b;
    }

    public  int fatorial(int n){
        int fatorial = 1;
        for (int i = 1; i <= n; i++){
            fatorial *=i;
        }
        return fatorial;
    }
    public double fatorial2(double numero){
        if (numero < 1){
            return 1;
        }
        return numero * fatorial2(numero -1);
    }





}
