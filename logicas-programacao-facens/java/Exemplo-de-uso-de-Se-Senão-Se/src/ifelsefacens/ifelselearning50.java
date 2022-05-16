/*
Lição 6 - Faça um programa que receba quatro notas, onde cada vale de 0 a 10
calcule e mostre a média ponderada, sabendo que o usuário irá entrar com o peso
de cada nota, caso a media ponderada seja: maior ou igual a 7 aprovado
maior ou igual a 5 e menor que 7 - exame
menor que 5 reprovado - utilizando for
*/

package ifelsefacens;

import java.util.Scanner;

public class ifelselearning50 {
    public static void main(String[] args) {

        // Clean Console Before the Code
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Entrada de Dados
        Scanner ler = new Scanner(System.in);
        float nota, soma = 0, media;
        float peso, somaPeso = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite Nota " + (i + 1) + ": ");
            nota = ler.nextFloat();

            if (nota >= 0 && nota <= 10) {
                System.out.print("Digite peso Nota " + (i + 1) + ": ");
                peso = ler.nextFloat();

                soma = soma + (nota * peso);
                somaPeso = somaPeso + peso;
            } else {
                System.out.println("Nota inválido!!!");
                i--;
            }
        }
        ler.close();
        media = soma / somaPeso;

        System.out.println("Média Ponderada: " + media);
    }
}
