/*
Lição 3 - Construa um algoritmo que leia o nome 
do usuário e escreva ele 10 vezes.
*/
package forlearning;

import java.util.Scanner;

public class forlearning2 {
  public static void main(String[] args) throws InterruptedException {

    // Entrada de Dados
    Scanner check = new Scanner(System.in);
    String nome;

    System.out.print("Escreva seu nome: ");
    nome = check.nextLine();

    check.close();

    // Processamento - Saída de Dados
    for (int i = 1; i <= 10; i++) {
      System.out.println(i + ": O nome do usuário é: " + nome);
      Thread.sleep(200);
    }
  }
}
