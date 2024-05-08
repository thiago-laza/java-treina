package BControle;
//AULA
public class Condicional_Aula {
    public static void main(String[] args){
        linha();
        maiorValor(17,9);
        linha();
        menorValor(17,9);
        linha();
    }
    public static void maiorValor(int numeroReferencia,int number){
        int maior;
        if (number > numeroReferencia){
            maior = number;
        }else {
            maior = numeroReferencia;
        }
        System.out.println("Numero: " + number);
        System.out.println("Numero de referencia: " + numeroReferencia);
        System.out.println("Maior: " + maior);
    }
    public static void menorValor(int numeroReferencia, int number){
        int menor;
        if (number < numeroReferencia){
            menor = number;
        }else {
            menor = numeroReferencia;
        }
        System.out.println("Numero: " + number);
        System.out.println("Numero de referencia: " + numeroReferencia);
        System.out.println("Menor: " + menor);
    }
    public static void linha(){
        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);
        System.out.println(linhaHifen);
    }
}
