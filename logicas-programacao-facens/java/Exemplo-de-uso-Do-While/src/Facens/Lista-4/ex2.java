/*
2)	Em uma eleição presidencial existem quatro candidatos. 
Os votos são informados através de códigos. 
Os dados utilizados para a contagem dos votos 
obedecem à seguinte codificação:  
- 1,2,3,4 = voto para os respectivos candidatos;
- 5 = voto nulo;
- 6 = voto em branco;
Elabore um algoritmo que leia o código do candidato em um voto. Calcule e escreva:
- total de votos para cada candidato;
- total de votos nulos;
- total de votos em branco;
Como finalizador do conjunto de votos, tem-se o valor 0.

*/

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        // Importando variáveis
        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0; // Candidatos
        int voto = 0, nulo = 0, branco = 0; // votos do usuário

        Scanner ler = new Scanner(System.in);

        do {
            System.out.print("Insira seu voto: ");
            voto = ler.nextInt();

            switch (voto) {

                case 1:
                    System.out.println("Seu voto foi para o candidato 1.");
                    candidato1++;
                    break;

                case 2:
                    System.out.println("Seu voto foi para o candidato 2.");
                    candidato2++;
                    break;

                case 3:
                    System.out.println("Seu voto foi para o candidato 3.");
                    candidato3++;
                    break;

                case 4:
                    System.out.println("Seu voto foi para o candidato 4.");
                    candidato4++;
                    break;

                case 5:
                    System.out.println("Seu voto foi nulo.");
                    nulo++;
                    break;

                case 6:
                    System.out.println("Seu voto foi branco.");
                    branco++;
                    break;

                default:
                    System.out.println("Seu voto foi considerado branco.");
                    branco++;
                    break;
            }

        } while (voto != 0);
        ler.close();

        System.out.println("Votos Candidato 1: " + candidato1);
        System.out.println("Votos Candidato 2: " + candidato2);
        System.out.println("Votos Candidato 3: " + candidato3);
        System.out.println("Votos Candidato 4: " + candidato4);
        System.out.println("Votos Brancos: " + branco);
        System.out.println("Votos Nulos: " + nulo);
    }
}
