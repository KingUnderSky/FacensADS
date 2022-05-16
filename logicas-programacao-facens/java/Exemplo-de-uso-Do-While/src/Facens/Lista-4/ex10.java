/*
10)	Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre; 
a quantidade de pessoas com mais de 90 quilos; 
a média das idades das sete pessoas
*/

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        // Entrada de Variáveis

        int idade = 0; // var de idade
        int i = 0; // contador
        float peso; // var de peso

        float mediaidade; // var da media
        int pesoacima = 0; // pessoas com mais de 90 kgs

        Scanner ler = new Scanner(System.in);

        // Entrada de dados / looping
        while (i < 7) {

            i++;
            System.out.print("Digite sua idade: ");
            idade = idade + ler.nextInt();

            System.out.print("Digite seu peso: ");
            peso = ler.nextFloat();

            if (peso > 90) {
                pesoacima++;
            }
        }
        ler.close();

        // Processamento dos dados
        mediaidade = idade / 7;
        
        // saída de dados
        System.out.println("A quantidade de pesssoas acima de 90 KG é " + pesoacima);
        System.out.println("A media das idades das sete pessoas é de " + mediaidade);
    }
}
