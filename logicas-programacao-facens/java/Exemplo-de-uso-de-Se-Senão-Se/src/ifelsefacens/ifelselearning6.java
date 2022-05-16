/*
Lição 7 - Faça um programa que leia 
o valor de um produto x e 
leia também a quantidade 
em reais de um cofrinho no formato:

*n moedas de 1 real;
*n moedas de 50 centavos;
*n moedas de 25 centavos;
*n moedas de 10 centavos;
*n moedas de 5 centavos;
*n moedas de 1 centavo;

o progama deve verificar se o 
total de reais que 
contem no cofrinho é o bastante 
para comprar o produto x.
*/

package ifelsefacens;

import java.util.Scanner;

public class ifelselearning6 {
    public static void main(String[] args) throws InterruptedException {

        // Clean Console Before the Code
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Entrada de Dados
        Scanner check = new Scanner(System.in);

        float n1r, n50c, n25c, n10c, n5c, n1c; // moedas do usuário
        float valor; // valor do produto
        float dinheiro; // quantidade em reais do usuário
        String produto;// produto x
        String status;// pode comprar ou não pode comprar

        // Dando o nome do produto
        System.out.print("Escreva o nome do produto: ");
        produto = check.nextLine();

        // Dando o preço do produto
        System.out.print("Digite o preço do produto em reais: R$ ");
        valor = check.nextFloat();

        // Descobrindo quantas moedas o usuário tem no cofrinho
        System.out.print("Digite quantas moedas de 1 real você tem: ");
        n1r = check.nextFloat(); // 1 real

        System.out.print("Digite quantas moedas de 50 centavos você tem: ");
        n50c = check.nextFloat(); // 50 centavos

        System.out.print("Digite quantas moedas de 25 centavos você tem: ");
        n25c = check.nextFloat(); // 25 centavos

        System.out.print("Digite quantas moedas de 10 centavos você tem: ");
        n10c = check.nextFloat(); // 10 centavos

        System.out.print("Digite quantas moedas de 5 centavos você tem: ");
        n5c = check.nextFloat(); // 5 centavos

        System.out.print("Digite quantas moedas de 1 centavo você tem: ");
        n1c = check.nextFloat(); // 1 centavo

        check.close();

        // Processamento dos Dados

        // Conta para converter as moedas em reais
        dinheiro = (n1r) + (n50c * 0.5f) + (n25c * 0.25f) + (n10c * 0.1f) + (n5c * 0.05f) + (n1c * 0.01f);

        /*
         * Se houver dinheiro igual ou maior que o preço do produto, será possível fazer
         * a compra, senão, não será possível fazer a compra
         */
        if (dinheiro >= valor) {
            status = "É possível fazer a compra.";
        } else {
            status = "Não é possível fazer a compra.";
        }

        // Saída de Dados

        // Indicando o cofre
        System.out.println("Você tem " + n1r + " moedas de 1 real.");
        Thread.sleep(1500);
        System.out.println("Você tem " + n50c + " moedas de 50 centavos.");
        Thread.sleep(1500);
        System.out.println("Você tem " + n25c + " moedas de 25 centavos.");
        Thread.sleep(1500);
        System.out.println("Você tem " + n10c + " moedas de 10 centavos.");
        Thread.sleep(1500);
        System.out.println("Você tem " + n5c + " moedas de 5 centavos.");
        Thread.sleep(1500);
        System.out.println("Você tem " + n1c + " moedas de 1 centavos.");
        Thread.sleep(1500);

        // Feedback de compra
        System.out.println("Você tem: R$ " + dinheiro);// indica quantos reais vc tem ao todo
        Thread.sleep(2500);
        System.out.println("O produto: " + produto + " custa: R$ " + valor);// indicando o valor do produto
        Thread.sleep(2500);
        System.out.println(status);// é possível ou não comprar
        Thread.sleep(2500);

        // se o dinheiro for maior ou igual ao valor do produto, mostrar quanto irá
        // sobrar
        if (dinheiro >= valor) {
            dinheiro = dinheiro - valor;
            System.out.printf("Irá sobrar R$ %.2f " , dinheiro);
            Thread.sleep(3500);
        }
    }
}
