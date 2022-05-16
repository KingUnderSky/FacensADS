
/*
Faça um programa que calcule a 
tabuada de um número qualquer 
inteiro que será digitado pelo 
usuário, porém. a tabuada não deve 
necessariamente iniciar em 1 e terminar 
em 10, o valor inicial e final devem 
ser informados também pelo usuário, 
conforme exemplo abaixo.
*/
import java.util.Scanner;

public class tabuada {

  public static void main(String[] args) {

    // declarando variáveis
    Scanner ler = new Scanner(System.in); // variável de scanner

    int x; // onde começar
    int y; // onde terminar
    int z; // número a ser multiplicado

    int result = 0; // resultado de cada multiplicação.

    // processamento do algoritmo
    System.out.print("Montar a tabuada de: "); // número a ser multiplicado
    z = ler.nextInt();

    System.out.print("Começar por: "); // onde começar
    x = ler.nextInt();

    System.out.print("Terminar em: "); // onde terminar
    y = ler.nextInt();

    ler.close(); // fechando scanner

    System.out.println("Vou montar a tabuada de " + z + " começando em " + x + " e terminando em " + y + ":");

    // multiplicando
    for (int i = x; i <= y; i++) {

      // resultado de cada multiplicação
      result = i * z;

      // print de cada conta
      System.out.println(z + " X " + y + " = " + result);
    }
  }
}
