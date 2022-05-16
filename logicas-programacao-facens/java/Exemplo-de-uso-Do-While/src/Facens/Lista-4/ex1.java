/*
1)	Construir um algoritmo que 
calcule a média aritmética de 
vários valores inteiros positivos.
O final da leitura acontecerá 
quando for lido um valor negativo.
*/

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

        // Definindo variáveis

        int x = 0; // valor inserido pelo usuário
        int soma = 0; // soma dos valores inseridos pelo usuário

        Scanner ler = new Scanner(System.in);

        int i = 0; // contador
        int resultado;

        // Processamento

        while (x != -1) {
            System.out.print("Insira o valor " + (i + 1) + " : ");
            x = ler.nextInt();

            if (x > 0) {

                soma = soma + x;
                i++;

            } else if (x <= 0)  {

                x = -1;
            }
        } 
        
        // Saída de informação
        ler.close();

        resultado = soma / i;        
        System.out.println ("A média aritmética desses números é : " + resultado);
        
        
        
    }
        
}
