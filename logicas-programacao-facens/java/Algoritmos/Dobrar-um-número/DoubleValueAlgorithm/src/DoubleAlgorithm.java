//Algoritmo que é capaz de dobrar o valor de um número que o usuário especificar
import java.util.Scanner;

    class Main {
        public static void main(String args[]) {
            
            //Entrada de Informação
            int x = 0;//número que vai ser dobrado
            int doublex;//número dobrado
            Scanner check;

            check = new Scanner(System.in);
            
            //Usuário recebe pedido inserir valor a ser dobrado
            System.out.print("Valor a ser dobrado: ");
            x = check.nextInt(); //x recebe número inserido pelo usuário
            
            //Processamento
            doublex = x * 2;//número dobrado

            //Saída de Informação

            System.out.println("O dobro de " + x + " é " + doublex + ".");//primeira variável com valor mudado            
        }
    }
