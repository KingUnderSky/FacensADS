//Algoritmo que indica se um número é positivo ou negativo
import java.util.Scanner;

    class main{
        public static void main(String args[]) {

            //Entrada de dados
            int x;//valor a ser cobrado
            String result;//resultado            
            Scanner negorpos;

            negorpos = new Scanner(System.in);

            //Pedido para acrescentar um número
            System.out.print("Qual número deve ser testado ? : ");
            x = negorpos.nextInt();//número a ser testado

            //Processamento
            //se o número for menor que zero = negativo senão positivo

            if( x < 0) {
                result = "negativo";
            } else if(x == 0) {
                result = "neutro";            
            } else {
                result = "positivo";
            }
            //Saída de Dados
            System.out.println(x + " é um número " + result);
        }
    }