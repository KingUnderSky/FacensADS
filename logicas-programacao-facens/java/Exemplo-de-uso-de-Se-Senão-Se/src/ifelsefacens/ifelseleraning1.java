/*
Lição 2 - Fazer uma lógica que leia um inteiro e imprima 
uma mensagem caso seja menor que 3 ou maior que 25.
*/

package ifelsefacens;

import java.util.Scanner;

public class ifelseleraning1 {
    public static void main(String[] args) {

        // Clean Console Before the Code
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Entrada de Dados
        Scanner check = new Scanner(System.in);

        int num1;
        String answer;

        System.out.print("Digite um número inteiro entre 3 e 25: ");
        num1 = check.nextInt();
        check.close();

        // Processamento
        if (num1 < 3 || num1 > 25) {
            answer = "O número digitado está Fora da Faixa";
        } else {
            answer = "O número digitado foi: " + num1;
        }

        // Saída de Dados
        System.out.println(answer);
    }
}