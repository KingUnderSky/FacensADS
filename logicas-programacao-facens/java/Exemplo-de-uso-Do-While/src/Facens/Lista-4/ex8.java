/*
8)	Uma empresa deseja aumentar seus preços em 20%. 
Faça um algoritmo que leia o código e o preço de custo 
de cada produto e calcule o preço novo. 
Calcule também, a média dos preços com e 
sem aumento. Mostre o código e o preço novo de cada 
produto e, no final, as médias. A entrada de dados deve 
terminar quando for lido um código de produto negativo.
*/

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {

        // Entrada de Variáveis
        int codigo; // codigo do produto
        float contador = 0.0f; // contador de produtos para calcular média

        float valor = 0.0f; // valor de custo do produto
        float valormaior = 0.0f; // preço com 20%

        float valortotal = 0.0f; // valor total de preços de custo para calculo de média
        float valortotalmaior = 0.0f; // valor total de preços com 20% de aumento para calculo de média

        float mediatotal = 0.0f; // media dos preços de custo
        float mediatotalmaior = 0.0f; // media dos preços com aumento

        Scanner ler = new Scanner(System.in);

        // Entrada de Dados / Processamento
        System.out.print("Digite o código do produto: ");
        codigo = ler.nextInt();

        while (codigo >= 0) {
            contador++;

            System.out.print("Digite o Preço de custo do produto: R$ ");
            valor = ler.nextFloat();
            valortotal = valortotal + valor;

            valormaior = valor + (valor * 2 / 10);
            valortotalmaior = valortotalmaior + valormaior;

            // Informações de aumento do produto / Loop
            System.out.println("O preço do produto código: " + codigo + " deve subir para: R$ " + valormaior);

            System.out.print("Digite o código do próximo produto: ");
            codigo = ler.nextInt();
        }
        ler.close();

        mediatotal = valortotal / contador; // média dos preços de custo
        mediatotalmaior = valortotalmaior / contador; // média dos preços de venda

        // Saída de Dados
        System.out.println("A média de preços de custo da loja é de R$ " + mediatotal);
        System.out.println("A média de preços da loja é de R$ " + mediatotalmaior);
    }
}
