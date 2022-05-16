//Algoritmo capaz de converter graus celsius em fahrenheit
import java.util.Scanner;

class main {
    public static void main(String args[]) {

        //Entrada de Dados
        float celsius;//C°
        float fahrenheit;//F°
        
        Scanner convert;

        convert = new Scanner(System.in);
        
        //Usuário recebe pedido para informar temperatura em celsius
        System.out.print("Qual a temperatura atual em C° ? : ");
        celsius = convert.nextFloat();//temperatura adquirida

        //Processamento de Dados
        fahrenheit = (celsius * 9/5) + 32;//fórmula de conversão celsius/fahrenheit

        //Saída de Dados

        System.out.println("A temperatura em Fahrenheit é de " + fahrenheit + " F°");
    }
}
