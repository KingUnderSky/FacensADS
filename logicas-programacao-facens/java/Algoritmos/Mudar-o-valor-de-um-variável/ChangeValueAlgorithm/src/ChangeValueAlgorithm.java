//Algoritmo que é capaz de trocar o valor de duas variáveis, sendo elas numéricas
import java.util.Scanner;

    class Main {
        public static void main(String args[]) {
            
            //Entrada de Informação
            int var1 = 0;//primeira variável
            int var2 = 100;//segunda variável
            Scanner check;

            check = new Scanner(System.in);
            
            //Usuário recebe pedido de troca de valor primeira variável
            System.out.println("O valor da primeira variável é: " + var1);
            System.out.print("Escolha o valor que a primeira variável deve receber: ");
            var1 = check.nextInt(); //primeira variável recebe valor escolhido pelo usuário
            
            //Usuário recebe pedido de troca de valor segunda variável
            System.out.println("O valor da segunda variável é: " + var2);
            System.out.print("Escolha o valor que a segunda variável deve receber: ");        
            var2 = check.nextInt(); //segunda variável recebe valor escolhido pelo usuário

            //Saída de Informação

            System.out.println("O valor que a primeira variável recebeu foi: " + var1);//primeira variável com valor mudado
            System.out.print("O valor que a segunda variável recebeu foi: " + var2);//segunda variável com valor mudado
        }
    }
