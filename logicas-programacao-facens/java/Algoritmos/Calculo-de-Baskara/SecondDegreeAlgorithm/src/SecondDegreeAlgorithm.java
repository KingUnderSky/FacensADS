//Algoritmo capaz de calcular uma equação de segundo grau utilizando fórmula de báskara
import java.util.Scanner;

    class Main {
        public static void main(String args[]) {
            
            //Entrada de Dados
            double a;//var a
            double b;//var b
            double c;//var c
            double delta;//var delta
            double deltar;//raiz quardada de delta
            double x1;//var x1
            double x2;//var x2
                        
            Scanner calc;

            calc = new Scanner(System.in);

            //Usuário preenche os valores de A B e C
            System.out.print("Valor de A: ");
            a = calc.nextDouble();

            System.out.print("Valor de B: ");
            b = calc.nextDouble();

            System.out.print("Valor de C: ");
            c = calc.nextDouble();
            
            //Processamento de Dados
            //Math.pow = eleva x1 por x2 (x1,x2)
            //Math.sqrt(x) = raiz quadrada de x
            delta = Math.pow(b,2) - (4 * a * c);//fórmula de báskara delta
            deltar = Math.sqrt(delta);//raiz quadrada de delta aplicada
            
            x1 =  (- b + deltar) / (2 * a);//fórmula raíz 1
            x2 = (- b - deltar) / (2 * a);//fórmula raiz 2
 
            //Saída de Dados            
            System.out.println("O valor de delta é: " + delta);//valor de delta

            //se delta for < 0 dizer que não há raíz quadrada
            if(delta < 0) {
                System.out.println("A raíz quadrada de delta não existe nos números racionais.");
            }

            //senão mostrar raíz de delta 
            else {
                System.out.println("A raíz de delta é: " + deltar);
            }       
            
            //se delta for < 0 dizer que não existem raizes reais
            if(delta < 0) {
                System.out.println("Não existem raízes reais.");
            }

            //senão se delta for igual a zero dizer apenas uma das raízes pois x1 = x2
            else if (delta == 0) {
                System.out.println("Existe apenas uma raíz: " + x1);
            }

            //senão dizer as duas raízes x1 e x2
            else {
                System.out.println("Existem duas raízes");
                System.out.println("raíz 1: " + x1 + " e " + "raíz 2: " + x2);
            }            
        }
    }
