/*
Lição 1 - Faça um programa que 
receba um número e verifique se 
está entre 100 e 200. Se sim 
imprima: "você digitou um número 
entre 100 e 200." Se não imprima: 
"você digitou um número fora da faixa de 100 e 200." 
*/

package ifelsefacens;

import java.util.Scanner;

public class ifelselearning0 {
    public static void main(String[] args) {

        // Clean Console Before the Code
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Entrada de Dados
        Scanner check = new Scanner(System.in);
        int num1;
        String result;

        System.out.print("Digite um número entre 100 e 200: ");
        num1 = check.nextInt();
        check.close();

        // Processamento
        if (num1 >= 100 && num1 <= 200) {
            result = " dentro da faixa ";
        } else {
            result = " fora da faixa ";
        }

        // Saída de Dados
        System.out.print("O número digitado está" + result + "de 100 e 200.");
    }
}
