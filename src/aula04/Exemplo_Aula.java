package aula04;
//AULA
import javax.swing.*;

public class Exemplo_Aula {
    public static void main(String[] args){
       executar();
       somaDeUmAteNumero(10);
    }
    private static String pegaDadoTexto(String titulo){
        String textoInformado;
        textoInformado = JOptionPane.showInputDialog(titulo);
        return textoInformado;
    }
    private static void executar(){
        String texto = pegaDadoTexto("Informe um texto");
        System.out.println(texto);

        String numeroInformado = pegaDadoTexto("Informe um numero");
        int numero = Integer.parseInt(numeroInformado);
        int somaDosNumeros = somaDeUmAteNumero(numero);
        System.out.println("A soma dos numeros e " + somaDosNumeros);
    }
    private static int somaDeUmAteNumero(int numero){
        int soma = numero;
        for(int i = 0; i < numero; i++){
            soma+=i;
        }
        System.out.println(soma);
        return soma;
    }




}
