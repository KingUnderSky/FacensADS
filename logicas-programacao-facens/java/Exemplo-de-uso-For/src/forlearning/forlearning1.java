/*
Lição 2 - Faça um algoritmo que conte de 1 a 15.
*/

package forlearning;

public class forlearning1 {
    public static void main(String[] args) throws InterruptedException {

        // ENTRADA-PROCESSAMENTO-SAÍDA DE DADOS
        for (int i = 1; i <= 15; i++) {
            System.out.println("Soma: " + i);
            Thread.sleep(200);
        }
    }
}
