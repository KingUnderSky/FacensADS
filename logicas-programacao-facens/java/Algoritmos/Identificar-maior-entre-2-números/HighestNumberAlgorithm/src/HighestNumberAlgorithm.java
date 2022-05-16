//Algoritmo capaz de identificar qual o maior número entre duas variáveis (bonus indica se o número for igual)
import java.util.Scanner;

    class main {
        public static void main(String args[]) {

            //Entrada de Dados
            int x;//variável 1
            int y;//variável 2
            String result;//resultado
            Scanner highnumber;

            highnumber = new Scanner(System.in);
            
            //Usuário é requisitado para acrescentar as variáveis
            System.out.print("Qual será o primeiro número ? : ");
            x = highnumber.nextInt();//variável 1 recebe número
            
            System.out.print("Qual será o segundo número ? : ");
            y = highnumber.nextInt();//variável 2 recebe número
            
            //Processamento
            if (x < y) {
                result = "menor que ";
            } else if (x > y) {
                result = "maior que ";
            } else {
                result = "igual a ";
            }
              
            //Saída de Dados
            System.out.print(x + " é " + result +y);
        }
    }
