/*Uma loja fornece 10% de desconto para funcionários e 
5% de desconto para clientes vips. Faça um programa 
que calcule o valor total a ser pago por uma pessoa.
O programa deverá ler o valor total da compra efetuada 
e um código que identifique se o comprador é um 
cliente comum (1), funcionário (2) ou vip (3).
*/

import java.util.Scanner;

public class Switchlearning {

    public static void main(String[] args) {

        Scanner check = new Scanner(System.in);

        int rank;
        float desconto;
        float compra;
        float valorfinal;
        float descontado;
        
        System.out.println("0: Cliente comum.")
        System.out.println("Você é: ");        
        System.out.println("1: Cliente VIP.");
        System.out.println("2: Funcionário.");
    
        System.out.print("Resposta: ");
        rank = check.nextInt();

        System.out.print("Valor da compra: R$ ");
        compra = check.nextFloat();

        switch (rank) {
        case 1:
            desconto = 0.05f;
            descontado = compra * desconto;
            valorfinal = compra - (compra * desconto);
            System.out.println("Como você é cliente VIP, terá 5% de desconto.");
            System.out.print("Sua compra foi de: R$ " + compra + " R$ para R$" + valorfinal + ". Valor descontado: R$" + descontado + ".");
            break;
        case 2:
            desconto = 0.1f;
            descontado = compra * desconto;
            valorfinal = compra - descontado;
            System.out.println("Como você é um funcionário, terá 10% de desconto.");
            System.out.print("Sua compra foi de: R$ " + compra + " R$ para R$" + valorfinal + ". Valor descontado: R$" + descontado + ".");
            break;
        default:
            System.out.println("Você é um cliente.");
            System.out.println("Sua compra foi de: R$ " + compra);
        }
    }
}
