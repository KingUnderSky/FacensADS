/*
Lição 9 - Faça um programa que receba
um número via teclado e resolva se é par ou ímpar
*/
package ifelsefacens;

import java.util.Scanner;

public class ifelselearning8 {
    public static void main(String[] args) {

         // Clean Console Before the Code
         System.out.print("\033[H\033[2J");
         System.out.flush();

        // Entrada de Dados
        double x;// valor a ser cobrado
        Scanner evenorodd = new Scanner(System.in);
        String result;// resultado
        double resolution;// resolução

        // Usuário recebe pedido de escolha do número
        System.out.print("Qual número deve ser testado ? : ");
        x = evenorodd.nextDouble();// número a ser testado
        evenorodd.close();

        // Processamento
        resolution = x % 2;

        // se na divisão de x/2 sobrar 0 então resultado recebe par
        if (resolution == 0) {
            result = "par";

            // senão recebe ímpar
        } else {
            result = "ímpar";
        }

        // Saída de Dados
        System.out.println(x + " é um número " + result);
    }
}
