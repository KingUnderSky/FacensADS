/*
Lição 6 - Faça um programa que receba quatro notas, onde cada vale de 0 a 10
calcule e mostre a média ponderada, sabendo que o usuário irá entrar com o peso
de cada nota, caso a media ponderada seja: maior ou igual a 7 aprovado
maior ou igual a 5 e menor que 7 - exame
menor que 5 reprovado
*/

package ifelsefacens;

import java.util.Scanner;

public class ifelselearning51 {
    public static void main(String[] args) {

        // Clean Console Before the Code
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Entrada de Dados
        Scanner check = new Scanner(System.in);

        float nota1, p1, nota2, p2, nota3, p3, nota4, p4, media;// Notas, pesos e média declaradas
        String status;// Aprovado ou reprovado ou exame
        int contador = 1;// Para ajudar no Scanner

        // Nota 1
        System.out.print("Digite a nota " + contador + " de 0 a 10: ");
        nota1 = check.nextFloat();
        System.out.print("Digite o peso da nota " + contador + ": ");
        p1 = check.nextFloat();
        if (nota1 >= 0 && nota1 <= 10) {
            contador++;

            // Nota 2
            System.out.print("Digite a nota " + contador + " de 0 a 10: ");
            nota2 = check.nextFloat();
            System.out.print("Digite o peso da nota " + contador + ": ");
            p2 = check.nextFloat();
            if (nota2 >= 0 && nota2 <= 10) {
                contador++;

                // Nota 3
                System.out.print("Digite a nota " + contador + " de 0 a 10: ");
                nota3 = check.nextFloat();
                System.out.print("Digite o peso da nota " + contador + ": ");
                p3 = check.nextFloat();
                if (nota3 >= 0 && nota2 <= 10) {
                    contador++;

                    // Nota 4
                    System.out.print("Digite a nota " + contador + " de 0 a 10: ");
                    nota4 = check.nextFloat();
                    System.out.print("Digite o peso da nota " + contador + ": ");
                    p4 = check.nextFloat();

                    check.close();

                    if (nota4 >= 0 && nota4 <= 10) {

                        /*
                         * Se alguma nota for maior que 10 ou menor que zero, algum peso for menor que
                         * zero, parar código e indicar para recomeçar, se não continue
                         */

                        // Equação da média ponderada
                        media = ((nota1 * p1) + (nota2 * p2) + (nota3 * p3) + (nota4 * p4)) / (p1 + p2 + p3 + p4);

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

    }
}
