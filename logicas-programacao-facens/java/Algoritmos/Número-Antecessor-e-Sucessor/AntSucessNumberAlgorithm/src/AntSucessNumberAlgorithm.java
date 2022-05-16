//Algoritmo que descobre o número sucessor e antecessor de um número qualquer
import java.util.Scanner;

    class Main {
        public static void main(String args[]) {

            //Entrada de dados
            int x;//número qualquer
            int ax;//var antecessor
            int xs;//var sucessor
            Scanner check;

            check = new Scanner(System.in);

            //Número que o usuário escolher
            System.out.print("Insira um número: ");
            x = check.nextInt();//número recebido

            //Processamento de dados
            ax = x - 1;//número antecessor
            xs = x + 1;//número sucessor
          
            //Saída de Informação
            System.out.println(ax + " é o antecessor de " + x);
            System.out.println("O sucessor de " + x + " é " + xs);
        }
    }