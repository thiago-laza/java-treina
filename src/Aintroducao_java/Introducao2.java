package Aintroducao_java;

import javax.swing.*;
import java.awt.*;

public class Introducao2 {
    public static void main(String[] args){
        // Definir um tamanho de fonte maior - GPT
        Font fonte = new Font(Font.SANS_SERIF, Font.PLAIN, 20); // Fonte sans-serif com tamanho 20
        // Definir a fonte globalmente para toda a aplicação - GPT
        UIManager.put("OptionPane.messageFont", fonte);
        // Definir o tamanho da caixa de diálogo de opções - GPT
        UIManager.put("OptionPane.minimumSize", new Dimension(900, 600)); // Largura e altura da caixa de diálogo

        boolean executando = true;
        while (executando){
            String[] opcoes = {"Criar/Executar", "Composicao", "Palavras reservadas",
                    "Estrutura", "Comentarios", "Operadores", "Tipos primitivos",
                    "Modificadores de acesso", "Declaracao de classes", "Declaracao de atributos",
                    "Declaracao de metodos"};

            // Criar uma mensagem de opção com as opções listadas verticalmente - GPT
            String opcaoSelecionada = (String) JOptionPane.showInputDialog(
                    null,
                    "Escolha uma opcao:",
                    "Menu",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            switch (opcaoSelecionada) {
                case "Criar/Executar":
                    JOptionPane.showMessageDialog(null, "CRIAR E EXECUTAR:\n" +
                            "codigo fonte->compilador->bytecode->maquina virtual->sistema operacional");
                    break;
                case "Composicao":
                    JOptionPane.showMessageDialog(null,"COMPOSICAO:\n" +
                            "\n" +
                            "JDK(JRE(JVM))\n" +
                            "\n"+
                            "•JVM = Java Virtual Machine, “programa” responsável pela portabilidade do Java. Não pode \n" +
                            "ser baixado isoladamente.\n"+
                            "\n"+
                            "•JRE = Java Runtime Environment, pacote composto pela JVM e bibliotecas, serve para \n" +
                            "rodar/executar aplicativos Java (class, jar).\n" +
                            "\n"+
                            "•JDK = Java Development Kit, pacote composto pela JRE e demais ferramentas de \n" +
                            "desenvolvimento, como o compilador.");
                    break;
                case "Palavras reservadas":
                    JTextArea mensagem = new JTextArea("PALAVRAS RESERVADAS:\n" +
                            "\n" +
                            "1. `abstract`\n" +
                            "2. `assert`\n" +
                            "3. `boolean`\n" +
                            "4. `break`\n" +
                            "5. `byte`\n" +
                            "6. `case`\n" +
                            "7. `catch`\n" +
                            "8. `char`\n" +
                            "9. `class`\n" +
                            "10. `const` (não utilizado)\n" +
                            "11. `continue`\n" +
                            "12. `default`\n" +
                            "13. `do`\n" +
                            "14. `double`\n" +
                            "15. `else`\n" +
                            "16. `enum`\n" +
                            "17. `extends`\n" +
                            "18. `final`\n" +
                            "19. `finally`\n" +
                            "20. `float`\n" +
                            "21. `for`\n" +
                            "22. `goto` (não utilizado)" +
                            "23. `if`\n" +
                            "24. `implements`\n" +
                            "25. `import`\n" +
                            "26. `instanceof`\n" +
                            "27. `int`\n" +
                            "28. `interface`\n" +
                            "29. `long`\n" +
                            "30. `native`\n" +
                            "31. `new`\n" +
                            "32. `null`\n" +
                            "33. `package`\n" +
                            "34. `private`\n" +
                            "35. `protected`\n" +
                            "36. `public`\n" +
                            "37. `return`\n" +
                            "38. `short`\n" +
                            "39. `static`\n" +
                            "40. `strictfp`\n" +
                            "41. `super`\n" +
                            "42. `switch`\n" +
                            "43. `synchronized`\n" +
                            "44. `this`\n" +
                            "45. `throw`\n" +
                            "46. `throws`\n" +
                            "47. `transient`\n" +
                            "48. `try`\n" +
                            "49. `void`\n" +
                            "50. `volatile`\n" +
                            "51. `while`");
                    mensagem.setEditable(false); // Impede que o usuário edite o texto
                    JScrollPane scrollPane = new JScrollPane(mensagem); // Adiciona uma barra de rolagem
                    scrollPane.setPreferredSize(new Dimension(700, 400)); // Define o tamanho do painel de rolagem
                    JOptionPane.showMessageDialog(null, scrollPane); // Exibe a mensagem com a barra de rolagem
                    break;
                case "Estrutura":
                    JOptionPane.showMessageDialog(null,"ESTRUTURA\n" +
                            "O codigo em JAVA e estruturado em classes\n" +
                            "Classes possuem ATRIBUTOS e METODOS.");
                    break;
                case "Comentarios":
                    JOptionPane.showMessageDialog(null,"COMENTARIOS\n" +
                            "\n"+
                            "// comentario de linha //\n" +
                            "\n"+
                            "/* comentario de varias linhas */\n" +
                            "\n"+
                            "/** comentario de documentacao */");
                    break;
                case "Operadores":
                    JOptionPane.showMessageDialog(null,"OPERADORES\n" +
                            "\n"+
                            "= -> Atribuição\n" +
                            "\n"+
                            "! -> Operador lógico de negação (NOT)\n" +
                            "\n"+
                            "> , < , >=, <= Operadores lógicos de desigualdade\n" +
                            "\n"+
                            "== , != -> Operadores lógicos de igualdade e diferença\n" +
                            "\n"+
                            "&& , || -> E lógico (AND) , OU lógico (OR)\n" +
                            "\n"+
                            "+, - , * , / , % -> Adição, Subtração, Multiplicação, Divisão, Módulo\n" +
                            "\n"+
                            "+= , -= , *= , /= , %= -> Operação com atribuição.\n" +
                            "\n"+
                            "++ , -- -> Incremento (+1), decremento (-1)\n");
                    break;
                case "Tipos primitivos":
                    JTextArea mensagem1 = new JTextArea("TIPOS PRIMITIVOS\n" +
                            "\n" +
                            "boolean => Pode assumir o valor true ou o valor false\n" +
                            " \n" +
                            "char => Caractere em notação Unicode de 16 bits. Serve para a\n" +
                            "        armazenagem de dados alfanuméricos. Também pode ser usado como\n" +
                            "        um dado inteiro com valores na faixa entre 0 e 65535.\n" +
                            "\n" +
                            "byte => Inteiro de 8 bits em notação de complemento de dois. \n" +
                            "        Pode assumir valores entre -2⁷=-128 e 2⁷-1=127\n" +
                            "\n" +
                            "short => Inteiro de 16 bits em notação de complemento de dois. Os valores possívels \n" +
                            "         cobrem a faixa de -2¹⁵=-32.768 a 2¹⁵-1=32.767\n" +
                            "\n" +
                            "int => Inteiro de 32 bits em notação de complemento de dois. Pode assumir valores entre\n" +
                            "       - 2³¹=2.147.483.648 e 2³¹-1=2.147.483.647.\n" +
                            "\n" +
                            "long => Inteiro de 64 bits em notação de complemento de dois. Pode assumir valores\n" +
                            "        entre -2⁶³ e 2⁶³\n" +
                            "\n" +
                            "float => Representa números em notação de ponto flutuante normalizada em precisão\n" +
                            "         simples de 32 bits em conformidade com a norma IEEE 754-1985. O menor valor\n" +
                            "         positivo represntável por esse tipo é 1.40239846e-46 e o maior é 3.40282347e+38\n" +
                            "\n" +
                            "double => Representa números em notação de ponto flutuante normalizada em precisão\n" +
                            "          dupla de 64 bits em conformidade com a norma IEEE 754-1985. O menor valor\n" +
                            "          positivo representável é 4.94065645841246544e-324 e o maior\n" +
                            "          é 1.7976931348623157e+308");

                    mensagem1.setEditable(false); // Impede que o usuário edite o texto
                    JScrollPane scrollPane1 = new JScrollPane(mensagem1); // Adiciona uma barra de rolagem
                    scrollPane1.setPreferredSize(new Dimension(500, 300)); // Define o tamanho do painel de rolagem
                    JOptionPane.showMessageDialog(null, scrollPane1); // Exibe a mensagem com a barra de rolagem
                    break;
                case "Modificadores de acesso":
                    JOptionPane.showMessageDialog(null,"MODIFICADORES DE ACESSO\n" +
                            "\n" +
                            "public: visivel para qualquer outra classe.\n" +
                            "\n" +
                            "protected: visivel para classes que estao no mesmo pacote ou subclasses.\n" +
                            "\n" +
                            "<default>: visivel apenas para classes dentro do mesmo pacote.\n" +
                            "OBS: <default> quer dizer que nenhum modificador foi explicitamente usado.\n" +
                            "\n" +
                            "private: visivel apenas dentro da mesma classe.");
                    break;
                case "Declaracao de classes":
                    JOptionPane.showMessageDialog(null,"DECLARACAO DE CLASSE\n" +
                            "<modificadores> class <nome>\n" +
                            "Modificadores:\n" +
                            "public: pode ser acessado por qualquer outra classe.\n" +
                            "abstract: indica que a classe e uma classe abstrata, ou seja, nao pode ser\n" +
                            "          instanciada diretamente e pode conter metodos abstratos.\n" +
                            "final: nao pode ser estendida por outra classe.\n");
                    break;
                case "Declaracao de atributos":
                    JOptionPane.showMessageDialog(null,"DECLARACAO DE ATRIBUTOS:\n" +
                            "<modificadores><tipo><nome>=<valor inicial>\n" +
                            "Modificadores:\n" +
                            "public: pode ser acessado por qualquer classe.\n" +
                            "protected: acessado apenas por classes do mesmo pacote ou por\n" +
                            "           subclasses, mesmo que estejam em pacotes diferentes.\n" +
                            "private: o atributo so pode ser acessado dentro da propria clase.\n" +
                            "final: o valor do atributo nao pode ser alterado apos a inicializacao.\n" +
                            "static: o atributo pertence a classe em vez de pertencer a instancias\n" +
                            "        individuais da classe.\n" +
                            "Tipos:\n" +
                            "Primitivos: int, double, float, char, boolean, bem como tipos de dados\n" +
                            "            da classe, com String e tambem definidos pelo usuario, tipos genericos e arrays.");
                    break;
                case "Declaracao de metodos":
                    JOptionPane.showMessageDialog(null,"DECLARACAO DE METODOS:\n" +
                            "<modificadores><tipo retornado><nome>(<parametros>)\n" +
                            "Modificadores:\n" +
                            "public: acessado por qualquer classe.\n" +
                            "protected: acessado apenas por classes no mesmo pacote ou por subclasses.\n" +
                            "private: acesso apenas dentro da propria classe.\n" +
                            "abstract: nao possui implementacao e deve ser sobrescrito por subclasses.\n" +
                            "static: pertence a classe em vez de instancias especificas da classe.\n" +
                            "final: impede que o metodo seja sobrescrito em subclasses.\n" +
                            "Tipos de retorno:\n" +
                            "void: nao retorna nenhum valor.\n" +
                            "primitivo: int, double, float, char, boolena,...\n" +
                            "String, Integer, ... : indica que o metodo retorna um valor desse tipo.\n" +
                            "Classe personalizada: retorna uma instancia da classe especifica.");
                    break;
            }
        }
        }






}

