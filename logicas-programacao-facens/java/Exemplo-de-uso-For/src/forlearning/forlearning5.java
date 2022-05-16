/*
Lição 6 - Leia a idade de 20 pessoa e 
exiba a soma das idades.
*/
package forlearning;

import java.util.Scanner;

public class forlearning5 {
    public static void main(String[] args) {

        // Entrada de Dados
        Scanner check = new Scanner(System.in);
        int soma = 0;

        // Processamento
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digita a " + i + " idade: ");
            soma = soma + check.nextInt();

        }
        check.close();

        // Saída de Dados
        System.out.print("A soma das idades foi de " + soma + " anos.");
    }
}
