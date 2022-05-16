/*
7)	Escreva um algoritmo em Java que recebe um caractere e exibe: 
a)	O seu valor numérico 
b) O caractere 12 casas a frente na tabela Unicode. (1 ponto).
c)	Caso seja uma letra, o exibe em maiúsculo. Ou seja, exibir em maiúsculo de qualquer forma. (1 ponto).  
d ) Caso seja uma letra, o exibe em minúsculo de qualquer forma. (1 ponto).
e)	Caso seja uma letra, o exibe após alternar entre maiúsculo e minúsculo. 
Ou seja, se minúsculo exibe em maiúsculo, se maiúsculo, exibe em minúsculo. (1 ponto).
*/

import java.util.Scanner;

public class ADS1Exercicio7Ettore {
    public static void main(String[] args) {

        // declarando variáveis
        Scanner ler = new Scanner(System.in); // scanner

        char caractere; // caractere a ser testado
        char letram; // se letra forçado em minúsculo
        char letraM; // se letra forçado em maiúsculo

        int valornumerico; // valor da letra
        char caracterfrente; // caracter 12 casas a frente

        // recebendo a informação
        System.out.print("Digite um caractere: ");
        caractere = ler.next().charAt(0); // recebendo um caractere

        ler.close();

        // processamento

        valornumerico = caractere; // valor númerico do caractere

        caracterfrente = (char) (valornumerico + 12); // calculo 12 casas a frente

        // se o caractere for letra (considerando os caracteres: 65~90(A~Z);
        // 97~122(a~z))
        if (valornumerico >= 65 && valornumerico <= 90 || valornumerico >= 97 && valornumerico <= 122) {
            letram = Character.toLowerCase(caractere); // letra em minúsculo forçado

            letraM = Character.toUpperCase(caractere); // letra em maiúsculo forçado

            // saída de informações letra
            System.out.println("Seu valor numérico é: " + valornumerico);
            System.out.println("O caracter que está 12 casas a frente é: " + caracterfrente + " / com valor: " + (valornumerico + 12));
            System.out.println("O caracter em maiúsculo é: " + letraM);
            System.out.println("O caracter em minúsculo é: " + letram);

            // se maiúsculo, mostrar em minúsculo, se minúsculo, mostrar em maiúsculo
            if (caractere == letraM) {
                System.out.println(
                        "Como o caractere é maiúsculo, será imprimido em minúsculo: " + letram);
            } else if (caractere == letram) {
                System.out.println(
                        "Como o caractere é minúsculo, será imprimido em maiúsculo: " + letraM);
            }

            // se não letra
        } else {

            // saída de informações não letra
            System.out.println("Seu valor numérico é: " + valornumerico);
            System.out.println("O caracter que está 12 casas a frente é: " + caracterfrente + " / com valor: " + (valornumerico + 12));

        }
    }
}
