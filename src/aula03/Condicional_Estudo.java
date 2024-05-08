package aula03;
//ESTUDO
import java.util.Scanner;

public class Condicional_Estudo {
    public static void main(String[] args){
        entradas();
    }
    public static void entradas(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor de controle: ");
        int valorControle = scanner.nextInt();
        System.out.print("Numero informado: ");
        int valorInformado = scanner.nextInt();

        if (valorInformado < valorControle){
            System.out.print("O valor informado " + valorInformado +" e menor que o valor de controle " + valorControle);
        } else if (valorControle < valorInformado) {
            System.out.print("O valor de controle " + valorControle + " e menor que o valor informado " + valorInformado);
        }
    }
}
