package aula04;
//Recebendo e exibindo o input pelo JOptionPane
import javax.swing.*;

public class Exemplo_Estudo1 {
    public static void main(String[] args){
        recebeNome();
        recebeIdade();
    }
    public static void recebeNome(){
        String nome = JOptionPane.showInputDialog("Nome:");
        JOptionPane.showMessageDialog(null,"Nome: " + nome);
    }
    public static void recebeIdade(){
        String idade = JOptionPane.showInputDialog("Idade:");
        JOptionPane.showMessageDialog(null,"Idade: " + idade);
    }


}
