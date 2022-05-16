/*Faça um programa que leia o nome de um aluno e 
quatro notas, em seguida identifique se o 
aluno passou tendo uma média maior que 7
*/
package ifelsedio;

import java.util.Scanner;

public class Sesenaoselearning {

    public static void main(String[] args) {

        //Clean Console Before the Code
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner ler = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;
        String aluno, status;

        // Entrada
        System.out.print("Digite o nome do aluno: ");
        aluno = ler.nextLine();

        System.out.print("Digite a nota 1 do aluno: ");
        nota1 = ler.nextFloat();
        System.out.print("Digite a nota 2 do aluno: ");
        nota2 = ler.nextFloat();
        System.out.print("Digite a nota 3 do aluno: ");
        nota3 = ler.nextFloat();
        System.out.print("Digite a nota 4 do aluno: ");
        nota4 = ler.nextFloat();

        // Processamento
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média foi: " + media + ".");
        ler.close();

        // Saída
        if (media < 7) {
            status = "reprovado.";
            System.out.println("O aluno " + aluno + " foi " + status);
        } else {
            status = "aprovado";
            System.out.println("O aluno " + aluno + " foi " + status);
        }
    }
}