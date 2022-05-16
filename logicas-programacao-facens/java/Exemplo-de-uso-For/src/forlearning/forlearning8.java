/*
Lição 9 - Ecreva um programa que leia 20 
números do usuário e exiba quantos são pares.
*/

package forlearning;

import java.util.Scanner;

public class forlearning8 {
    public static void main(String[] args) {

        // Entrada de Dados
        Scanner check = new Scanner(System.in);
        float num = 0f;
        int result = 0;

        // Processamento
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + " número: ");
            num = check.nextFloat() % 2;

            if (num == 0) {
                result++;
            }
        }
        check.close();

        // Saída de Dados
        System.out.print("Tiveram " + result + " números pares.");
    }
}
