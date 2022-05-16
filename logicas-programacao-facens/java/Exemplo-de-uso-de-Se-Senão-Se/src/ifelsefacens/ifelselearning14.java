/*
Lição 15 - Crie um programa que calcule a 
média final das notas de um aluno. O programa
deve ler as notas dos 4 bimestres e o número
de faltas. Em seguida deve calcular a média
aritmética das notas e imprimir umas das seguintes
mensagens:
*aprovado para média entre 7 e 10 e número de faltas até 36
*exame final para média de 4 a 7 e número de faltas até 36
*reprovado média abaixo de 4 ou número de faltas maior que 36
*/

package ifelsefacens;

import java.util.Scanner;

public class ifelselearning14 {
    public static void main(String[] args) {

        // Clean Console Before the Code
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Entrada de Dados
        Scanner check = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;// notas de cada bimestre e media
        int faltas1, faltas2, faltas3, faltas4, faltastotal;// faltas de cada bimestre
        int contador = 1;// facilitador
        String status;

        // Nota e Falta do Bimestre 1
        System.out.print("Insira a nota do " + contador + " bimestre: ");
        nota1 = check.nextFloat();
        System.out.print("Insira as faltas do " + contador + " bimestre: ");
        faltas1 = check.nextInt();
        contador++;

        // Nota e Falta do Bimestre 2
        System.out.print("Insira a nota do " + contador + " bimestre: ");
        nota2 = check.nextFloat();
        System.out.print("Insira as faltas do " + contador + " bimestre: ");
        faltas2 = check.nextInt();
        contador++;

        // Nota e Falta do Bimestre 3
        System.out.print("Insira a nota do " + contador + " bimestre: ");
        nota3 = check.nextFloat();
        System.out.print("Insira as faltas do " + contador + " bimestre: ");
        faltas3 = check.nextInt();
        contador++;

        // Nota e Falta do Bimestre 4
        System.out.print("Insira a nota do " + contador + " bimestre: ");
        nota4 = check.nextFloat();
        System.out.print("Insira as faltas do " + contador + " bimestre: ");
        faltas4 = check.nextInt();
        contador++;

        check.close();

        // Processamento
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        faltastotal = faltas1 + faltas2 + faltas3 + faltas4;

        if (media >= 7 && faltastotal <= 36) {
            status = "Aprovado.";
        } else if (media >= 4 && media > 7 && faltastotal <= 36) {
            status = "Exame final";
        } else {
            status = "reprovado";
        }

        // Saída de Informação
        System.out.print("Aluno foi " + status + " com " + faltastotal + " faltas e " + media + " de média.");
    }
}
