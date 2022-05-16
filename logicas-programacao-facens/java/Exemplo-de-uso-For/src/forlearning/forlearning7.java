/*
Lição 8 - Leia a idade de 20 pessoas e 
exiba quantas pessoas são maiores de idade.
*/

import java.util.Scanner;

public class forlearning7 {
    public static void main(String[] args) {

        // Entrada de Dados
        Scanner check = new Scanner(System.in);

        int maioridade = 0;// pessoas que são maiores de idade
        int idade;

        // Processamento
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a " + i + " idade: ");
            idade = check.nextInt();
            // Pessoas maiores de idade
            if (idade >= 18) {
                maioridade++;
            }
        }
        check.close();

        // Saída de Dados
        System.out.println(maioridade + " pessoas são maiores de idade.");
    }
}
