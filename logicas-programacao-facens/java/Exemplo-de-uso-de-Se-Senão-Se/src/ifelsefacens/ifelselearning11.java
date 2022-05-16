/*
Lição 12 - Uma empresa abriu uma linha de crédito
para os funcionários. O valor da prestação não pode
ser maior que 30% do salário. Programe de forma que receba
o valor do empréstimo e salário e informe se o empréstimo
 pode ser concedido. Nenhum valor pode ser zero ou negativo
*/

package ifelsefacens;

import java.util.Scanner;

public class ifelselearning11 {
    public static void main(String[] args) {

        // Clean Console Before the Code
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Entrada de Dados
        Scanner check = new Scanner(System.in);

        float salario, emprestimo, prestacao;// o salário, o emprestimo e os 30% do salário
        String status; // concedido ou não concedido

        // Pedido para inserir valor de emprestimo
        System.out.print("Qual o valor de empréstimo desejado ? : R$ ");
        emprestimo = check.nextFloat();

        System.out.print("Qual seu salário ? : R$ ");
        salario = check.nextFloat();

        check.close();

        // Processamento
        prestacao = salario * 30 / 100;// 30% do salário

        if (emprestimo <= prestacao && emprestimo > 0 && salario > 0) {
            status = "Aprovado.";
        } else {
            status = "Reprovado";
        }

        // Saída de Dados
        System.out.print("O empréstimo está: " + status);
    }
}
