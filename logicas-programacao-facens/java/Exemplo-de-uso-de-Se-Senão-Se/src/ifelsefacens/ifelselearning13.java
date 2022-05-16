/*
Lição 14 - Fazer um programa que calcule a conta 
de luz considerando 100 kw para cada 1/7 de um
salário mínimo. O programa vai receber o valor
gasto em kw e irá retornar o valor da conta final
com 10% de desconto
*/

package ifelsefacens;

import java.util.Scanner;

public class ifelselearning13 {
    public static void main(String[] args) {

        // Clean Console Before the Code
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Entrada de Dados
        Scanner check = new Scanner(System.in);
        float kwtts, gasto, desconto, valor;
        float sm = 1100;// salário mínimo

        // Valor gasto em kwtts
        System.out.print("Quanto foi gasto em kilowatts ? : ");
        kwtts = check.nextFloat();

        check.close();

        // Processamento de Dados

        // reais por kwtts
        valor = (sm * 1 / 7) / 100;

        // Preço sem desconto
        gasto = valor * kwtts;

        if (gasto >= sm) {

            // Preço com desconto
            desconto = gasto - (gasto * 0.1f);

            // Saída de Dados
            System.out.println("Você ia pagar " + gasto);
            System.out.println("Mas você recebeu 10% de desconto e o valor caiu para: R$ " + desconto);

        } else {
            System.out.printf("Você vai pagar R$ %.2f ", gasto);
        }
    }
}
