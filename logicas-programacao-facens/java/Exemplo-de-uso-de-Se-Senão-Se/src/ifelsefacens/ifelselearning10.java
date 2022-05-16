/*
Lição 11 - Programa que recebe dois números e efetua uma
adição entre eles. Caso a soma seja maior que 20, ele deverá apresentar o
resultado sendo somado por 8. Caso seja menor ou igual a 20, ele deve apresentar o resultado subtraido de 5.*/

package ifelsefacens;

import java.util.Scanner;

public class ifelselearning10 {
    public static void main(String[] args) {

        // Clean Console Before the Code
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Entrada de Informação
        int x, y;// números
        int soma;// resultado da soma
        int var1;// número que vai ser aplicado no processamento
        int var2;// número que vai ser aplicado no processamento

        Scanner check = new Scanner(System.in);

        // Usuário recebe pedido inserir valor os números a serem operados
        System.out.print("Primeiro valor: ");
        x = check.nextInt(); // x recebe número inserido pelo usuário

        System.out.print("Segundo valor: ");
        y = check.nextInt(); // y recebe número inserido pelo usuário

        check.close();

        // Processamento
        soma = x + y;// número dobrado

        if (soma > 20) {
            var1 = 8;
            var2 = soma + 8;
            System.out.println("A soma resultou em: " + soma);
            System.out.println(soma + " + " + var1 + " = " + var2);
        } else if (soma <= 20) {
            var1 = 5;
            var2 = soma - 5;
            System.out.println("A soma resultou em: " + soma);
            System.out.println(soma + " - " + var1 + " = " + var2);
        }
    }
}