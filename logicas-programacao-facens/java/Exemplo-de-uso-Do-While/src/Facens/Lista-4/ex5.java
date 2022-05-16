import java.util.Scanner;

/*
5)	Escrever um algoritmo que leia uma quantidade desconhecida de
 números e conte quantos deles estão nos seguintes intervalos: [0.25], [26,50], [51,75] e [76,100].
 A entrada de dados deve terminar quando for lido um número negativo.
*/
public class ex5 {
    public static void main(String[] args) {

        // Entrada de variáveis

        float x; // número que o usuário digitar
        float inter1 = 0.0f, inter2 = 0.0f, inter3 = 0.0f, inter4 = 0.0f; // intervalos

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número: ");
        x = ler.nextFloat();

        do {
            if (x >= 0 && x <= 25) {
                inter1++;

            } else if (x >= 26 && x <= 50) {
                inter2++;

            } else if (x >= 51 && x <= 75) {
                inter3++;

            } else if (x >= 76 && x <= 100) {
                inter4++;
            }

            System.out.print("Digite um número: ");
            x = ler.nextFloat();

        } while (x != 0);

        ler.close();
        System.out.println("Existem " + inter1 + " números no primeiro intervalo. (0,25)");
        System.out.println("Existem " + inter2 + " números no segundo intervalo. (26,50)");
        System.out.println("Existem " + inter3 + " números no terceiro intervalo. (51,75)");
        System.out.println("Existem " + inter4 + " números no quarto intervalo. (76,100)");
    }
}
