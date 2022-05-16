/*
Lição 10 - Faça um programa que leia 20 números e no 
final, escreva quantos estão entre 0 e 100.
*/
package forlearning;

import java.util.Scanner;

public class forlearning9 {
    public static void main(String[] args) {

        // Entrada de Dados
        Scanner check = new Scanner(System.in);
        int num;
        int result = 0;

        // Processamento
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + " número: ");
            num = check.nextInt();

            if (num >= 0 && num <= 100) {
                result++;
            }
        }
        check.close();

        // Saída de Dados
        System.out.print(result + " números estiverem entre 0 e 100.");
    }
}
