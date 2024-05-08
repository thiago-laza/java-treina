package Cmetodos;

import javax.swing.*;

public class Exemplo_Estudo2 {
    public static void main(String[] args){
        tabuada();
    }
    public static void tabuada(){
        String input = JOptionPane.showInputDialog("Digite um numero:");
        int numero = Integer.parseInt(input);

        StringBuilder mensagem = new StringBuilder();

        for (int i = 1; i <= 10; i++){
            int produto = numero * i;
            mensagem.append(numero).append(" x ").append(i).append(" = ").append(produto).append("\n");
        }
        JOptionPane.showMessageDialog(null,mensagem.toString());
    }
}
