/*
Lição 1 - Faça um algoritmo que escreva 
20 vezes "EU AMO JAVA".
*/

package forlearning;

public class forlearning0 {
    public static void main(String[] args) throws InterruptedException {

        // PROCESSAMENTO-SAÍDA DE DADOS
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + ": " + "EU AMO JAVA");
            Thread.sleep(200);
        }
    }
}
