/*
6)Escreva um algoritmo em java que 
recebe um número inteiro e 
converte para character e exibe. (1 ponto).
*/
import java.util.Scanner;
public class ADS1Exercico6Ettore {
    public static void main(String[] args) {
        
    
    // declarando variáveis

    int x; // número que será convertido
    char c; // resultado da conversão
    Scanner ler = new Scanner(System.in); // scanner

    // entrada do número
    System.out.print("Digite um número que seja inteiro: ");
    x = ler.nextInt();
    ler.close();

    // conversão
    c = (char) x;

    // saída do character convertido
    System.out.print(x + " foi convertido para " + c);
    }
}
