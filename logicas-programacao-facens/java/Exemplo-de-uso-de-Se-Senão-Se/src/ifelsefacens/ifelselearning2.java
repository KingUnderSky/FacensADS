/*
Lição 3 - Faça um programa que receba três notas, calcule e mostre
a média aritmética entre elas. Caso a média seja maior ou igual a 7
"Aluno aprovado", se menor que 7 "aluno reprovado".
*/

package ifelsefacens;

import java.util.Scanner;

public class ifelselearning2 {
    public static void main(String[] args) {

        // Clean Console Before the Code
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Entrada de Dados
        Scanner check = new Scanner(System.in);

        int contador = 1;
        float media, nota1, nota2, nota3;
        String status;

        // Primeira nota
        System.out.print("Digite a nota " + contador + ": ");
        nota1 = check.nextFloat();
        contador++;

        // Segunda nota
        System.out.print("Digite a nota " + contador + ": ");
        nota2 = check.nextFloat();
        contador++;

        // Terceira nota
        System.out.print("Digite a nota " + contador + ": ");
        nota3 = check.nextFloat();
        contador++;

        check.close();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            status = "Aluno Aprovado";
        } else {
            status = "Aluno Reprovado";
        }

        // Saída de Dados
        System.out.println("A média foi " + media);
        System.out.println(status);
    }
}