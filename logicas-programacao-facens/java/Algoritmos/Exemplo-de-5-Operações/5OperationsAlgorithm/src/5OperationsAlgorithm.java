//Algoritmo que exemplifique 5 operações aritméticas
import java.util.Scanner;
import java.lang.Math;

    class main {
        public static void main(String args []) {

            //Entrada de dados
            double x;//valor 1
            double y;//valor2
            double op1;//operação 1
            double op2;//operação 2
            double op3;//operação 3
            double op4;//operação 4
            double op5;//operação 5
            Scanner calc;

            calc = new Scanner(System.in);

            //Número que o usuário escolher
            System.out.print("Dê o valor de x: ");
            x = calc.nextDouble();//número 1 recebido
            System.out.print("Dê o valor de y: ");
            y = calc.nextDouble();//número 2 recebido

            //Processamento de dados
            op1 = x + y;//soma
            op2 = x - y;//subtração
            op3 = x * y;//multiplicação
            op4 = x / y;//divisão
            op5 = Math.pow(x,y);//x elevado por y

            //Saída de informação
            System.out.println("Exemplo de soma: " + x + " + " + y + " = " + op1);
            System.out.println("Exemplo de subtração: " + x + " - " + y + " = " + op2);//op de subtração
            System.out.println("Exemplo de multiplicação: " + x + " * " + y + " = " + op3);//op de multiplicação
            System.out.println("Exemplo de divisão: " + x + " / " + y + " = " + op4);//op de divisão
            System.out.println("Exemplo de potenciação: " + x + " ^(" + y + ")" + " = " + op5);//op multiplicação e divisão
        }
    }