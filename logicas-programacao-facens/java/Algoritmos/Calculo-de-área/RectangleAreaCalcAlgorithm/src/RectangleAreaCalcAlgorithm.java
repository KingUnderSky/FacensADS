//Algoritmo que calcula a área de um retângulo
import java.util.Scanner;

    class Main {
        public static void main(String args[]) {

            //Entrada de dados
            float height;//altura
            float width;//largura
            float area;//area

            Scanner calc;

            calc = new Scanner(System.in);
            
            //Usuário é requisitado a preencher a altura e a largura do retângulo
            System.out.print("Qual a base do retângulo em metros ? : ");
            width = calc.nextFloat();//largura definida

            System.out.print("Qual a altura do retângulo ? : ");
            height = calc.nextFloat();//altura definida

            //Processamento de dados
            area = width * height;//calculo da area

            //Saída de Informação
            System.out.println("A área do retângulo é: " + area + " m².");
        }
}
