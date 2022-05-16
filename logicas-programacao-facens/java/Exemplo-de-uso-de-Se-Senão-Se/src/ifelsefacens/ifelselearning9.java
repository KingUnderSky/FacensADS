/*
Lição 10 - Faça um programa que receba 3 números e imprima o maior deles
*/

package ifelsefacens;

import java.util.Scanner;

public class ifelselearning9 {
    public static void main(String[] args) {

         // Clean Console Before the Code
         System.out.print("\033[H\033[2J");
         System.out.flush();

        // Entrada de Dados
        int x;// variável 1
        int y;// variável 2
        int z;// variável 3
        String result;// resultado

        Scanner highnumber = new Scanner(System.in);

        // Usuário é requisitado para acrescentar as variáveis
        System.out.print("Qual será o primeiro número ? : ");
        x = highnumber.nextInt();// variável 1 recebe número

        System.out.print("Qual será o segundo número ? : ");
        y = highnumber.nextInt();// variável 2 recebe número

        System.out.print("Qual será o terceiro número ? : ");
        z = highnumber.nextInt();// variável 3 recebe número

        highnumber.close();

        // Processamento
        if (x > y && x > z) {
            result = "o número " + x + " é o maior";
        } else if (y > x && y > z) {
            result = "o número " + y + " é o maior";
        } else if (z > x && z > y) {
            result = "o número " + z + " é o maior";
        } else {
            result = "não há maior número";
        }

        // Saída de Dados
        System.out.print(result);
    }
}
