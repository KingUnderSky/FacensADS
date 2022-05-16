/*
Lição 7 - Leia a idade de 20 pessoas e 
exiba a média das idades.
*/
package forlearning;

import java.util.Scanner;

public class forlearning6 {
    public static void main(String[] args) throws InterruptedException {

        // Entrada de Dados
        Scanner check = new Scanner(System.in);
        float soma = 0f;
        float media = 0f;

        // Processamento de Dados
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a " + i + " idade: ");
            soma = soma + check.nextFloat();
        }
        check.close();

        // Saída de Dados
        media = soma / 20f;
        System.out.println("A soma foi de " + soma + " anos.");
        Thread.sleep(200);
        System.out.println("A média foi de " + media + " anos.");
    }
}
