/*
Vetor e Matriz

Existem array Unidimensional = uma linha = vetor
Existem array Bidimensional = várias linhas = matriz

Ex: unidimensional = vetor(1.1,1.2,1.3)

Ex: bidimensional = vetor(1.1,1.2,1.3)
                          2.1,2.2,2.3

Criando um vetor: String[] nome = new String[qnt]
* java não suporta array bidimensional, mas dá para criar o mesmo resultado criando array de arrays

declarando matriz: tipo-do-dado nome-do-array[][] = new tipo-de-dado[qntl][qntc]
ex: int array[][] = new int[3][3] = matriz 3x3
*/

import java.util.Scanner;

public class arrays {
    
    public static void main(String[] args) {
        // modo 1 inicializando array bidimensional conhecido como matriz
        int [] [] matriz1 = new int [3] [3];

        /*
         * 1 2 3 0 - [120] [232] [201] 1 - [] [] [] 2 - [] [] []
         * 
         */
        matriz1 [0] [0] = 120;
        matriz1 [0] [1] = 232;
        matriz1 [0] [2] = 201;

        // modo 2 inicializando array bidimensional conhecido como matriz

        int [] [] matriz2 = { { 120, 232, 201 }, { 129, 111, 187 }, { 128, 0, 0 } };

        /*
         * 1 2 3 0 - [120] [232] [201] 1 - [129] [111] [187] 2 - [128] [0] [0]
         * 
         */

        // modo 3 inicializando array bidimensional conhecido como matris - estrutura de
        // repetição

        Scanner ler = new Scanner(System.in);
        
        int[][] matriz3 = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número: ");
                matriz3[i][j] = ler.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("\t matriz [%d] [%d]: %d \t",i,j,matriz3[i][j]);
            }
        }
        ler.close();
    }
}
