/*
lição 5 - Faça um programa que leia 10 números 
do usuário e calcule a soma desses números.
*/

package forlearning;

import java.util.Scanner;

public class forlearning4 {
    public static void main(String[] args) {

        // Entrada de Dados
        Scanner check = new Scanner(System.in);
        Double soma = 0.0;

        // Processamento - Saída de Dados
        for (int i = 1; i <= 10; i++) {
            System.out.print("Escreva o " + i + " número: ");
            soma = soma + check.nextDouble();
        }
        check.close();

        System.out.print("A soma total é: " + soma);
    }
}
