/*Armazene informações de uma tabela: nomes: 3 nomes;
Endereços: 3 endereços para cada nome;
numeros de telefone: 3 números de telefone para cada nome;
*/
//Importando Scanner
import java.util.Scanner;

public class matrizvetorlearning {
    public static void main(String[] args) {

        //Entrada de variáveis
        String tabela [][] = new String[3][3]; //criando tabela 3x3
        Scanner check = new Scanner(System.in);
        int contador1 = 1;//define a coluna
        int contador2 = 0;//define a linha

        //Processamento
        
        //recebendo valor de cada coluna e linha da tabela
        do {
            System.out.print("Escreva o nome " + contador1 + ": ");//coluna 1
            tabela [contador2][0] = check.nextLine();
            System.out.print("Escreva o endereço: ");
            tabela [contador2][1] = check.nextLine();//coluna2
            System.out.print("Escreva número de telefone: ");//coluna3
            tabela [contador2][2] = check.nextLine();
            contador1 ++;//acrescenta +1 para coluna
            contador2 ++;//acrescenta +1 para linha
        } while (contador1 <= 3);

        //Saída de Dados 
        contador1 = 1;
        contador2 = 0;
        
        /*enquanto contador 1 for menor ou igual a 3 ele vai seguir a mesma lógica do processamento
        para montar a tabela de forma visual para o usuário.
        */

        do {
            System.out.println("Nome " + contador1 + ": " + tabela [contador2][0] + ". Endereço: " + tabela [contador2][1] + ". Telefone: " + tabela [contador2][2] + ".");
            contador1 ++;
            contador2 ++;
        } while (contador1 <= 3);
    } 
}
