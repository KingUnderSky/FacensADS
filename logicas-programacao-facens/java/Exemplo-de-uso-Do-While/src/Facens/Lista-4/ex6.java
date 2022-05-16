/*
6)	Faça um algoritmo que leia vários números inteiros e calcule o 
somatório dos números negativos. O fim da leitura será indicado pelo número 0.
*/

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        // Entrada de Variáveis
        int x;
        int soma = 0;

        Scanner ler = new Scanner(System.in);

        // Entrada de Dados
        System.out.print("Digite um número negativo: ");
        x = ler.nextInt();

        // Processamento
        while (x != 0) {
            if (x < 0) {
                soma = soma + (x);
            }
            System.out.print("Digite um número negativo: ");
            x = ler.nextInt();
        }
        ler.close();

        // Saída de Dados
        System.out.println("A soma dos números negativos deu: " + soma);
    }

}
