//Algoritmo capaz de identificar se um número é ímpar ou par
import java.util.Scanner; 

    class main {
        public static void main(String args[]) {

            //Entrada de Dados
            double x;//valor a ser cobrado
            Scanner evenorodd;
            String result;//resultado
            double resolution;//resolução          
        
            evenorodd = new Scanner(System.in);
            
            //Usuário recebe pedido de escolha do número
            System.out.print("Qual número deve ser testado ? : ");
            x = evenorodd.nextDouble();//número a ser testado
            
            //Processamento
            resolution = x % 2; 

            //se na divisão de x/2 sobrar 0 então resultado recebe par
            if(resolution == 0) {
                result = "par";

            //senão recebe ímpar
            } else {
                result = "ímpar";
            }

            //Saída de Dados
            System.out.println(x + " é um número " + result);
        }
    }
