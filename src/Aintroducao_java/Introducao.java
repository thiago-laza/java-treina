package Aintroducao_java;

import java.util.Scanner;

public class Introducao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoLinha = 30;
        String linhaHifen = "-".repeat(tamanhoLinha);
        String linhaHifen2 = "=".repeat(tamanhoLinha);
        String linhaHifeTab = "...".repeat(tamanhoLinha);
        while (true) {
            System.out.println("Escolha uma das opcoes abaixo:");
            System.out.println(linhaHifen2);
            System.out.println("[1] Criar/Executar\n[2] Composicao\n[3] Palavras reservadas\n[4] Estrutura\n" +
                    "[5] Comentarios\n[6] Operadores\n[7] Tipos primitivos\n[8] Modificadores de acesso\n" +
                    "[9] Declaracao de classe\n[10] Declaracao de atributos\n[11] Declaracao de metodos\n" +
                    "[0] Sair");
            System.out.println(linhaHifen2);
            System.out.print("OPCAO: ");
            int opcao = scanner.nextInt();
            if (opcao == 0) {
                break;
            } else if (opcao == 1) {
                System.out.println(linhaHifen2);
                System.out.println("CRIAR E EXECUTAR:");
                System.out.println(linhaHifen);
                System.out.println("codigo fonte->compilador->bytecode->maquina virtual->sistema operacional");
                System.out.println(linhaHifen);
                while (true) {
                    System.out.print("[0] inicio: ");
                    int opcao1 = scanner.nextInt();
                    if (opcao1 == 0) {
                        break;
                    }
                }
            } else if (opcao == 2) {
                System.out.println("COMPOSICAO");
                System.out.println(linhaHifen);
                            System.out.println("JDK(JRE(JVM))\n" +
                                    "•JVM = Java Virtual Machine, “programa” responsável pela\n" +
                                    "portabilidade do Java. Não pode ser baixado isoladamente.\n" +
                                    "•JRE = Java Runtime Environment, pacote composto pela\n" +
                                    "JVM e bibliotecas, serve para rodar/executar aplicativos\n" +
                                    "Java (class, jar).\n" +
                                    "•JDK = Java Development Kit, pacote composto pela JRE e\n" +
                                    "demais ferramentas de desenvolvimento, como o\n" +
                                    "compilador.");
                System.out.println(linhaHifen);
                System.out.println();
                while (true) {
                    System.out.print("[0] inicio: ");
                    int opcao2 = scanner.nextInt();
                    if (opcao2 == 0) {
                        break;
                    }
                }
            } else if (opcao == 3) {
                System.out.println("PALAVRAS RESERVADAS");
                System.out.println(linhaHifen);
                System.out.println(
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
                        "22. `goto` (não utilizado)\n" +
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
                System.out.println(linhaHifen);
                while (true) {
                    System.out.print("[0] inicio:");
                    int opcao3 = scanner.nextInt();
                    if (opcao3 == 0) {
                        break;
                    }
                }
            } else if (opcao == 4) {
                System.out.println("ESTRUTURA");
                System.out.println(linhaHifen);
                System.out.println("O codigo em JAVA e estruturado em classes.\n" +
                        "Classe possui ATRIBUTOS e METODOS.");
                System.out.println(linhaHifen);
                while (true) {
                    System.out.print("[0] inicio:");
                    int opcao4 = scanner.nextInt();
                    if (opcao4 == 0) {
                        break;
                    }
                }
            }else if (opcao == 5) {
                System.out.println("COMENTARIOS");
                System.out.println(linhaHifen);
                System.out.println("Em Java é possível comentar código de três formas diferentes:\n" +
                        "• // Comentários de uma linha\n" +
                        "\n" +
                        "• /* comentários\n" +
                        "de várias\n" +
                        "linhas */\n" +
                        "\n" +
                        "• /** comentários para documentação */\n" +
                        "É utilizado pela ferramenta javadoc.\n" +
                        "Deve preceder a declaração de uma variável, um método ou uma classe. O documento\n" +
                        "é gerado no formato HTML.");
                System.out.println(linhaHifen);
                while (true) {
                    System.out.print("[0] inicio:");
                    int opcao5 = scanner.nextInt();
                    if (opcao5 == 0) {
                        break;
                    }
                }
            }else if (opcao == 6) {
                System.out.println("OPERADORES");
                System.out.println(linhaHifen);
                System.out.println(linhaHifeTab);
                System.out.println("= -> Atribuição");
                System.out.println(linhaHifeTab);
                System.out.println("! -> Operador lógico de negação (NOT)");
                System.out.println(linhaHifeTab);
                System.out.println("> , < , >=, <= Operadores lógicos de desigualdade");
                System.out.println(linhaHifeTab);
                System.out.println("== , != -> Operadores lógicos de igualdade e diferença");
                System.out.println(linhaHifeTab);
                System.out.println("&& , || -> E lógico (AND) , OU lógico (OR)");
                System.out.println(linhaHifeTab);
                System.out.println("+, - , * , / , % -> Adição, Subtração, Multiplicação, Divisão, Módulo");
                System.out.println(linhaHifeTab);
                System.out.println("+= , -= , *= , /= , %= -> Operação com atribuição.");
                System.out.println(linhaHifeTab);
                System.out.println("++ , -- -> Incremento (+1), decremento (-1)");
                System.out.println(linhaHifeTab);
                System.out.println(linhaHifen);
                while (true) {
                    System.out.print("[0] inicio:");
                    int opcao6 = scanner.nextInt();
                    if (opcao6 == 0) {
                        break;
                    }
                }
            }else if (opcao == 7) {
                System.out.print("TIPOS PRIMITIVOS");
                System.out.println(linhaHifen);
                System.out.println(linhaHifeTab);
                System.out.println("boolean\nPode assumir o valor true ou o valor false");
                System.out.println(linhaHifeTab);
                System.out.println("char\nCaractere em notação Unicode de 16 bits. Serve para a armazenagem de dados\n" +
                        "alfanuméricos. Também pode ser usado como um dado inteiro com valores na faixa entre 0 e\n" +
                        "65535.");
                System.out.println(linhaHifeTab);
                System.out.println("byte\nInteiro de 8 bits em notação de complemento de dois. Pode assumir valores \n" +
                        "entre -2⁷=-128 e 2⁷-1=127");
                System.out.println(linhaHifeTab);
                System.out.println("short\nInteiro de 16 bits em notação de complemento de dois. Os valores possívels\n" +
                        "cobrem a faixa de -2¹⁵=-32.768 a 2¹⁵-1=32.767");
                System.out.println(linhaHifeTab);
                System.out.println("int\nInteiro de 32 bits em notação de complemento de dois. Pode assumir valores entre\n" +
                        "- 2³¹=2.147.483.648 e 2³¹-1=2.147.483.647.");
                System.out.println(linhaHifeTab);
                System.out.println("long\nInteiro de 64 bits em notação de complemento de dois. Pode assumir valores\n" +
                        "entre -2⁶³ e 2⁶³");
                System.out.println(linhaHifeTab);
                System.out.println("float\nRepresenta números em notação de ponto flutuante normalizada em precisão\n" +
                        "simples de 32 bits em conformidade com a norma IEEE 754-1985. O menor valor positivo represntável\n" +
                        "por esse tipo é 1.40239846e-46 e o maior é 3.40282347e+38");
                System.out.println(linhaHifeTab);
                System.out.println("double\nRepresenta números em notação de ponto flutuante normalizada em precisão\n" +
                        "dupla de 64 bits em conformidade com a norma IEEE 754-1985. O menor valor positivo representável\n" +
                        "é 4.94065645841246544e-324 e o maior é 1.7976931348623157e+308");
                System.out.println(linhaHifeTab);
                while (true) {
                    System.out.print("[0] inicio:");
                    int opcao7 = scanner.nextInt();
                    if (opcao7 == 0) {
                        break;
                    }
                }
            }else if (opcao == 8) {
                System.out.print("MODIFICADORES DE ACESSO");
                System.out.println(linhaHifen);
                System.out.println(linhaHifeTab);
                System.out.println("public: visivel para qualquer outra classe.");
                System.out.println(linhaHifeTab);
                System.out.println("protected: visivel para classes que estao no mesmo pacote ou subclasses.");
                System.out.println(linhaHifeTab);
                System.out.println("<default>: visivel apenas para classes dentro do mesmo pacote.\n"+
                                    "OBS: <default> quer dizer que nenhum modificador foi explicitamente usado.");
                System.out.println(linhaHifeTab);
                System.out.println("private: visivel apenas dentro da mesma classe.");
                System.out.println(linhaHifeTab);
                while (true) {
                    System.out.print("[0] inicio:");
                    int opcao8 = scanner.nextInt();
                    if (opcao8 == 0) {
                        break;
                    }
                }
            }else if (opcao == 9) {
                System.out.println("DECLARACAO DE CLASSE");
                System.out.println(linhaHifen);
                System.out.println(linhaHifeTab);
                System.out.println("<modificadores> class <nome>");
                System.out.println("Modificadores:");
                System.out.println(linhaHifeTab);
                System.out.println("public: pode ser acessado por qualquer outra classe.");
                System.out.println(linhaHifeTab);
                System.out.println("abstract: indica que a classe e uma classe abstrata, ou seja, nao pode ser\n" +
                        "instanciada diretamente e pode conter metodos abstratos.");
                System.out.println(linhaHifeTab);
                System.out.println("final: nao pode ser estendida por outra classe.");
                System.out.println(linhaHifeTab);
                System.out.println(linhaHifen);
                while (true) {
                    System.out.print("[0] inicio:");
                    int opcao9 = scanner.nextInt();
                    if (opcao9 == 0) {
                        break;
                    }
                }
            }else if (opcao == 10) {
                System.out.println("DECLARACAO DE ATRIBUTOS");
                System.out.println(linhaHifen);
                System.out.println("<modificadores><tipo><nome>=<valor inicial>");
                System.out.println(linhaHifen);
                System.out.println("MODIFICADORES");
                System.out.println(linhaHifen);
                System.out.println("public: pode ser acessado por qualquer classe.");
                System.out.println(linhaHifeTab);
                System.out.println("protected: acessado apenas por classes do mesmo pacote ou por\n" +
                        "subclasses, mesmo que estejam em pacotes diferentes.");
                System.out.println(linhaHifeTab);
                System.out.println("private: o atributo so pode ser acessado dentro da propria clase.");
                System.out.println(linhaHifeTab);
                System.out.println("final: o valor do atributo nao pode ser alterado apos a inicializacao.");
                System.out.println(linhaHifeTab);
                System.out.println("static: o atributo pertence a classe em vez de pertencer a instancias\n" +
                        "individuais da classe.");
                System.out.println(linhaHifen);
                System.out.println("TIPO");
                System.out.println(linhaHifen);
                System.out.println("Primitivos: int, double, float, char, boolean, bem como tipos de dados\n" +
                        "da classe, com String e tambem definidos pelo usuario, tipos genericos e arrays.");
                System.out.println(linhaHifeTab);
                System.out.println(linhaHifen);
                while (true) {
                    System.out.print("[0] inicio:");
                    int opcao10 = scanner.nextInt();
                    if (opcao10 == 0) {
                        break;
                    }
                }
            }else if (opcao == 11) {
                System.out.println("DECLARACAO DE METODOS");
                System.out.println(linhaHifen);
                System.out.println("<modificadores><tipo retornado><nome>(<parametros>)");
                System.out.println(linhaHifen);
                System.out.println("MODIFICADORES");
                System.out.println(linhaHifen);
                System.out.println("public: acessado por qualquer classe.");
                System.out.println(linhaHifeTab);
                System.out.println("protected: acessado apenas por classes no mesmo pacote ou por subclasses.");
                System.out.println(linhaHifeTab);
                System.out.println("private: acesso apenas dentro da propria classe.");
                System.out.println(linhaHifeTab);
                System.out.println("abstract: nao possui implementacao e deve ser sobrescrito por subclasses.");
                System.out.println(linhaHifeTab);
                System.out.println("static: pertence a classe em vez de instancias especificas da classe.");
                System.out.println(linhaHifeTab);
                System.out.println("final: impede que o metodo seja sobrescrito em subclasses.");
                System.out.println(linhaHifen);
                System.out.println("TIPOS DE RETORNO");
                System.out.println(linhaHifen);
                System.out.println("void: nao retorna nenhum valor.");
                System.out.println(linhaHifeTab);
                System.out.println("primitivo: int, double, float, char, boolena,...");
                System.out.println(linhaHifeTab);
                System.out.println("String, Integer, ... : indica que o metodo retorna um valor desse tipo.");
                System.out.println(linhaHifeTab);
                System.out.println("Classe personalizada: retorna uma instancia da classe especifica.");
                System.out.println(linhaHifeTab);
                System.out.println(linhaHifen);
                while (true) {
                    System.out.print("[0] inicio:");
                    int opcao11 = scanner.nextInt();
                    if (opcao11 == 0) {
                        break;
                    }
                }
            }
        }
    }
}
