/*
Lição 13 - Um comerciante comprou um produto e quer vender
com lucro de 45% se a compra for menor que 20 reais, ou 30%
se não for menor que 20 reais.
*/

package ifelsefacens;

import java.util.Scanner;

public class ifelselearning12 {
    public static void main(String[] args) {

        // Clean Console Before the Code
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Entrada de Dados
        Scanner check = new Scanner(System.in);

        float produto, price;

        // recebe valor do produto
        System.out.print("Qual o valor de compra do produto ?: R$ ");
        produto = check.nextFloat();

        check.close();

        // Processamento
        // se produto tiver preço menor que 20 reais, terá acréscimo de 40% do valor na
        // venda
        if (produto < 20) {
            price = (produto * 0.4f) + produto;
            // senão terá acréscimo de 30% na venda
        } else {
            price = (produto * 0.3f) + produto;
        }
        // Saída de Dados
        System.out.print("O produto deve ser vendido por: R$ " + price);
    }
}
