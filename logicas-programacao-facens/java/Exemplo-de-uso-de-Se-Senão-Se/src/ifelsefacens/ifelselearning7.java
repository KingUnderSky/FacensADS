/*
Lição 8 - faça um programa que 
o usuário escolhe converter em 
celsius para fahrenheit ou 
fahrenheit para celsius

*Bonus kelvin adicionado
*/

package ifelsefacens;

import java.util.Scanner;

public class ifelselearning7 {
    public static void main(String[] args) {

        // Clean Console Before the Code
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Entrada de Dados
        Scanner check = new Scanner(System.in);

        float celsius, fahrenheit, kelvin;// C°,F°, K°
        int padrao; // escolha de temperatura padrao
        int conversão;// escolha de conversão

        // Usuário recebe primeiro pedido de escolha
        System.out.print("Escolha sua temperatura padrão. \n1 - Celsius\n2 - Fahrenheit\n3 - Kelvin\nR: ");
        padrao = check.nextInt();

        // Se escolha for igual a 1 = celsius padrão | igual a 2 = fahrenheit padrão |
        // igual a 3 = kelvin padrão
        switch (padrao) {

        // Celsius padrão
        case 1:

            System.out.print(
                    "Escolha para qual temperatura deverá ser feita a conversão:\n1 - Fahrenheit\n2 - Kelvin\nR: ");
            conversão = check.nextInt();

            // conversão de Celsius para Fahrenheit
            if (conversão == 1) {

                // Usuário recebe pedido para informar temperatura em celsius
                System.out.print("Qual a temperatura atual em C° ? : ");
                celsius = check.nextFloat();// temperatura adquirida

                check.close();

                // Processamento de Dados 1
                fahrenheit = (celsius * 9 / 5) + 32;// fórmula de conversão celsius/fahrenheit

                // Saída de Dados 1
                System.out.println("A temperatura em Fahrenheit é de " + fahrenheit + " F°");

                // conversão de Celsius para Kelvin
            } else if (conversão == 2) {

                // Usuário recebe pedido para informar temperatura em celsius
                System.out.print("Qual a temperatura atual em C° ? : ");
                celsius = check.nextFloat();// temperatura adquirida

                check.close();

                // Processamento de Dados 2
                kelvin = celsius + 273.15f;// fórmula de conversão celsius/kelvin

                // Saída de Dados 2
                System.out.println("A temperatura em Kelvin é de " + kelvin + " K°");
                // caso seja feito escolha errada
            } else {
                System.out.println("Escolha incorreta.\nPor favor, tente o código novamente.");
            }
            break;

        // Fahrenheit padrão
        case 2:

            System.out
                    .print("Escolha para qual temperatura deverá ser feita a conversão:\n1 - Celsius\n2 - Kelvin\nR: ");
            conversão = check.nextInt();

            // conversão de Fahrenheit para Celsius
            if (conversão == 1) {

                // Usuário recebe pedido para informar temperatura em fahrenheits
                System.out.print("Qual a temperatura atual em F° ? : ");
                fahrenheit = check.nextFloat();// temperatura adquirida

                check.close();

                // Processamento de Dados 3
                celsius = (fahrenheit - 32) * 5 / 9;// fórmula de conversão fahrenheit/celsius

                // Saída de Dados 3
                System.out.println("A temperatura em Celsius é de " + celsius + " C°");

                // conversão de Fahrenheit para Kelvin
            } else if (conversão == 2) {

                // Usuário recebe pedido para informar temperatura em fahrenheits
                System.out.print("Qual a temperatura atual em F° ? : ");
                fahrenheit = check.nextFloat();// temperatura adquirida

                check.close();

                // Processamento de Dados 4
                kelvin = (fahrenheit - 32) * 5 / 9 + 273.15f;// fórmula de conversão celsius/kelvin

                // Saída de Dados 4
                System.out.println("A temperatura em Kelvin é de " + kelvin + " K°");

            } else {
                System.out.println("Escolha incorreta.\nPor favor, tente o código novamente.");
            }
            break;

        // Kelvin padrão
        case 3:

            System.out.print(
                    "Escolha para qual temperatura deverá ser feita a conversão:\n1 - Fahrenheit\n2 - Celsius\nR: ");
            conversão = check.nextInt();

            // conversão de Kelvin para Fahrenheit
            if (conversão == 1) {

                // Usuário recebe pedido para informar temperatura em Kelvin
                System.out.print("Qual a temperatura atual em K° ? : ");
                kelvin = check.nextFloat();// temperatura adquirida

                check.close();

                // Processamento de Dados 5
                fahrenheit = (kelvin - 273.15f) * (9 / 5f) + 32;// fórmula de conversão kelvin/fahrenheit

                // Saída de Dados 5
                System.out.println("A temperatura em Fahrenheit é de " + fahrenheit + " F°");

                // conversão de Kelvin para Celsius
            } else if (conversão == 2) {

                // Usuário recebe pedido para informar temperatura em Kelvin
                System.out.print("Qual a temperatura atual em K° ? : ");
                kelvin = check.nextFloat();// temperatura adquirida

                check.close();

                // Processamento de Dados 6
                celsius = kelvin - 273.15f;// fórmula de conversão celsius/kelvin

                // Saída de Dados 6
                System.out.println("A temperatura em Celsius é de " + celsius + " C°");

            } else {
                System.out.println("Escolha incorreta.\nPor favor, tente o código novamente.");
            }
            break;

        // Escolha incorreta
        default:
            System.out.println("Escolha incorreta.\nPor favor, tente o código novamente.");
            break;
        }
    }
}
