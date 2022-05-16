/*
Lição 5 - Faça um programa que receba 4 notas, 
onde cada nota só pode valer de 0 a 10, calcule e
mostre a média aritmética entre elas, caso a média seja:
maior ou igual a 7 - aluno aprovado
maior ou igual a 5 e menor que 7 - exame final
menor que 5 - reprovado
*/

package ifelsefacens;

import java.util.Scanner;

public class ifelselearning4 {
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
        System.out.print("Digite a nota " + contador + " de 0 a 10: ");
        nota1 = check.nextFloat();
        contador++;

        if (nota1 >= 0 && nota1 <= 10) {

            // Nota 2
            System.out.print("Digite a nota " + contador + " de 0 a 10: ");
            nota2 = check.nextFloat();
            contador++;

            if (nota2 >= 0 && nota2 <= 10) {

                // Nota 3
                System.out.print("Digite a nota " + contador + " de 0 a 10: ");
                nota3 = check.nextFloat();
                contador++;

                if (nota3 >= 0 && nota2 <= 10) {

                    // Nota 4
                    System.out.print("Digite a nota " + contador + " de 0 a 10: ");
                    nota4 = check.nextFloat();

                    if (nota4 >= 0 && nota4 <= 10) {

                        /*
                         * Se alguma nota for maior que 10 ou menor que zero, parar código e indicar
                         * para recomeçar, se não continue
                         */

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

                    } else {
                        System.out.print("Nota 4 incorreta");
                    }
                } else {
                    System.out.print("Nota 3 incorreta");
                }
            } else {
                System.out.print("Nota 2 incorreta");
            }
        } else {
            System.out.print("Nota 1 incorreta");
        }

        check.close();

    }
}
