/*
3)	Escreva um algoritmo que calcule a 
média aritmética das 3 notas dos alunos 
de uma classe. O algoritmo deverá ler, 
além das notas, o código do aluno e 
deverá ser encerrado quando o código for 
igual a zero.
*/

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        // Definindo Variáveis
        Scanner ler = new Scanner(System.in);

        int nota = 0; // Notas

        float divisor = 0.0f;

        float media = 0.0f; // Média

        int codigo; // Códigos dos alunos

        // Processamento
        System.out.print("Digite seu código: ");
        codigo = ler.nextInt();

        while (codigo != 0) {

            for (int i = 0; i < 3; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                nota = nota + ler.nextInt();

                divisor++;
            }

            media = nota / divisor;

            // Saída de dados
            System.out.println("A média das notas do aluno código: " + codigo + " é: " + media);

            divisor = 0;
            nota = 0;

            System.out.print("Digite seu código: ");
            codigo = ler.nextInt();

        }
        System.out.println("fim do programa.");
        ler.close();
    }
}