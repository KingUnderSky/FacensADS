/*
Lição 4 - Leia o nome e um número qualquer do usuário. 
Escreva seu nome com a mesma quantidade de 
vezes do número digitado.
*/

package forlearning;

import java.util.Scanner;

public class forlearning3 {
    public static void main(String[] args) throws InterruptedException {

        // Entrada de Dados
        Scanner check = new Scanner(System.in);
        int num1;
        String nome;
        // Digitar nome
        System.out.print("Digite seu nome: ");
        nome = check.nextLine();
        // Digitar número
        System.out.print("Digite um número: ");
        num1 = check.nextInt();

        check.close();

        // Processamento - Saída de Dados
        for (int i = 1; i <= num1; i++) {
            System.out.println(i + ": O nome do usuário é: " + nome);
            Thread.sleep(200);
        }
    }
}
