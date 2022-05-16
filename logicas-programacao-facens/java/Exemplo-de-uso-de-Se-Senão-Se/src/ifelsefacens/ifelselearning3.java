/*
Lição 4 - Faça um programa que receba quatro notas, 
calcule e mostre a média aritmética entre elas, 
caso a media aritmética seja maior ou igual a 7, aluno aprovado.
caso seja maior ou igual a 5 e menor que 7 , exame final.
caso seja menor que 5, aluno reprovado.
*/

package ifelsefacens;

import java.util.Scanner;

public class ifelselearning3 {
    public static void main(String[] args) {

        // Clean Console Before the Code
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Entrada de Dados
        Scanner check = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;// Notas e média declaradas
        String status;// Aprovado ou reprovado ou exame
        int contador = 1;// Para ajudar no Scanner

        // Nota 1
        System.out.print("Digite a nota " + contador + ": ");
        nota1 = check.nextFloat();
        contador++;

        // Nota 2
        System.out.print("Digite a nota " + contador + ": ");
        nota2 = check.nextFloat();
        contador++;

        // Nota 3
        System.out.print("Digite a nota " + contador + ": ");
        nota3 = check.nextFloat();
        contador++;

        // Nota 4
        System.out.print("Digite a nota " + contador + ": ");
        nota4 = check.nextFloat();

        check.close();

        // Equação da média
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            status = "Aluno Aprovado.";
        } else if (media >= 5 && media < 7) {
            status = "Exame Final.";
        } else {
            status = "Aluno Reprovado.";
        }

        // Saída de Dados
        System.out.println("A média foi: " + media);
        System.out.println(status);
    }
}
