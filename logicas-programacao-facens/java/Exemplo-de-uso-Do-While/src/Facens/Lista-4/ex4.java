/*
4)	Escreva um algoritmo que calcule 
a média dos números digitados 
pelo usuário, se eles forem pares. 
Termine a leitura se o usuário digitar zero (0).
*/

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {

        // Entrada de Variáveis

        Scanner ler = new Scanner(System.in);

        float x = 1.0f; // números digitados pelo usuário
        float soma = 0.0f; // número a ser dividido
        float div = 0.0f; // número que vai dividir
        float result = 0.0f; // resultado
        float parorimpar;

        // Entrada de dados / processamento
        System.out.print("Digite um número: ");
            x = ler.nextFloat();

        while (x != 0) {
            

            parorimpar = x % 2;

            if (parorimpar == 0) {
                soma = soma + x;

                div++;
            }
            
            System.out.print("Digite um número: ");
            x = ler.nextFloat();
        }
        // Saída de Dados
        ler.close();

        result = soma / div;

        System.out.println("A média aritmética é: " + result);

    }
}
