/*
9)	Foi feita uma pesquisa entre os 1000 habitantes de uma região para 
coletar os seguintes dados: sexo (0-feminino, 1-masculino), 
idade e altura. Faça um algoritmo que leia as informações 
coletadas e mostre as seguintes informações:

a) média da idade do grupo;
b) média da altura das mulheres;
c) média da idade dos homens;
d) percentual de pessoas com idade entre 18 e 35 anos (inclusive).
*/

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        // Entrada de Variáveis
        
        int x; // escolha de sexo do usuário
        int i = 0; // contador

        int idade = 0; // variável de idade
        float altura = 0; // variável de altura

        float mediaidadegrupo; // media de idade do grupo ( dividido por 1000)
        float percentual = 0; // percentual de idade entre 18 e 35 anos

        int feminino = 0; // quantidade de mulheres
        float mediaalturafeminino = 0; // media de altura das mulheres
        float alturafeminino = 0; // altura total das mulheres

        int masculino = 0; // quantidade de homens
        float mediaidademasculino = 0;
        int idademasculino = 0; // idade masculina

        Scanner ler = new Scanner(System.in);

        //Quantas pessoas será entrevistada ?
        System.out.print("Quantas pessoas serão entreveistadas ?: ");
        int pessoas = ler.nextInt();

        // Entrada de dados / processamento
        
        // Looping para 1000 pessoas colocarem suas informações
        do {
            System.out.print("Digite seu sexo; 0 - feminino; 1 - masculino: ");
            x = ler.nextInt();
            
            // Caso tenha escolhido masculino ou feminino
            switch (x) {

                case 0:
                    feminino++;
                    i++; // contador de pessoas
                    break;
                    

                case 1:
                    masculino++;
                    i++; // contador de pessoas
                    break;

                default:
                    System.out.println("Por favor, escolha um valor entre 0 e 1");
                    break;
            }

            // Se feminino
            if (x == 0) {
                System.out.print("Digite sua idade: "); // digitar idade mulheres
                idade = idade + ler.nextInt();

                // se idade for entre 18 e 35, somar no percentual
                if (idade >= 18 && idade <= 35) {
                    percentual++;
                }

                System.out.print("Digite sua altura: "); // digitar altura
                alturafeminino = alturafeminino + ler.nextFloat(); // calculo altura mulheres

                // Se masculino
            } else if (x == 1) {

                System.out.print("Digite sua idade: "); // digitar idade masculino
                idademasculino = idademasculino + ler.nextInt(); // calculo idade homens

                // se idade for entre 18 e 35, somar no percentual
                if (idade >= 18 && idade <= 35) {
                    percentual++;
                }

                System.out.print("Digite sua altura: "); // digitar altura
                altura = altura + ler.nextFloat(); // altura total

            }

        } while (i < pessoas);

        // Processamento das médias
        mediaidadegrupo = (idade + idademasculino) / pessoas; // media de idade do grupo
        mediaalturafeminino = alturafeminino / feminino; // media da altura das mulheres
        mediaidademasculino = idademasculino / masculino; // media de idade masculina

        percentual = percentual * 100 / pessoas; // calculo do percentual entre 18 e 35 anos

        // Saída de Dados
        ler.close();

        System.out.println("A média de idade do grupo é de " + mediaidadegrupo); // media de idade do grupo
        System.out.println("A média da altura das mulheres é de " + mediaalturafeminino + " metros."); // media de altura feminina
        System.out.println("A média da idade dos homens é de " + mediaidademasculino); // media de idade masculina
        System.out.println("O percentual de pessoas com idade entre 18 e 35 anos é de " + percentual + "%"); // percentual
                                                                                                             // de 18 a
                                                                                                             // 35 anos
    }
}
