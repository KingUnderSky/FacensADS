/*
5) Escreva um algoritmo em java que 
imprime os caracteres imprimíveis da 
tabela ASCII. (1 ponto) 
*/

public class ADS1Exercicio5Ettore {
    public static void main(String[] args) {

        // variável utilizada
        char c; // vai receber os valores da tabela para impressão
                
        /*
        Processamento - Os números que podem ser impressos na 
        tabela ascii estão entre: 33 e 126; 160 e 255
        */  

        // primeira parte entre 33 e 126 (não considerei 32 pois o espaço não é necessariamente visível)
        for (int i = 33; i <= 126; i++) {
            c = (char) (i);
            System.out.print(c + ", ");
        }
        
        // segunda parte entre 160 e 255
        for (int i = 160; i < 255; i++) {
            c = (char) i;
            System.out.print(c + ", ");
               
        }

        c = (char) (255);
        System.out.print(c + "."); // para encerrar com .
        // Não consegui bater os caracteres da tabela ascci na segunda parte
    }
}
