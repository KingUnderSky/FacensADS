// caixa eletrônico

import java.util.Scanner;

public class ac2_banco {
    public static void main(String[] args) {

        // iniciando variáveis
        String cpf = "123.456.789-00", cpftest, password = "01020304", passwordtest; // cpf e senha
        int menu, tentativas = 3, sair = 1; // variáveis para o usuário interagir no menu e sair
        float deposito, saque, saldo = 1000; // variáveis de depósito, saque e saldo
        Scanner ler = new Scanner(System.in); // scanner

        // tela bem vindo
        System.out.println("===================================");
        System.out.println("=============Bem-vindo=============");
        System.out.println("=============CAIXA POP=============");
        System.out.println("===================================");

        // digite cpf
        System.out.print("Digite seu CPF: ");
        cpftest = ler.nextLine();
        /*
         * se o cpf for igual ao cpf registrado então pedir senha se não, parar
         * programa, indicar cpf incorreto
         */
        if (cpf.equals(cpftest)) {

            do {
                // digite a senha
                System.out.print("Digite a senha: ");
                passwordtest = ler.nextLine();

                // se a senha senha errada, indicar tentativas antes de bloquear e pedir
                // novamente
                if (!passwordtest.equals(password)) {
                    System.out.println("Senha ERRADA!");
                    tentativas--;
                    System.out.println("Tentativas antes de bloquear a conta: " + tentativas);
                }

                // se acabar as tentativas, bloquear conta e fechar o programa
                if (tentativas == 0) {
                    System.out.println("Conta Bloqueada");
                    ler.close();
                    System.exit(0);
                }

                // se senha correta e tentativas disponíveis, mostrar menu
            } while (!passwordtest.equals(password) && tentativas != 0);

            /*
             * enquanto usuário não pedir para sair do menu, exibir as informações após as
             * escolhas
             */

            while (sair != 0) {

                System.out.println("Opções");
                System.out.println("1 - Ver SALDO" + " \n2 - Fazer DEPÓSITO" + " \n3 - Fazer SAQUE" + " \n0 - SAIR");
                menu = ler.nextInt();

                // opções do menu = 1,2,3,0
                switch (menu) {

                    // opção 1 - mostrar saldo
                    case (1):
                        System.out.println("Seu SALDO é de R$: " + saldo);
                        break;

                    // opção 2 - depositar
                    case (2):
                        System.out.println("Digite a quantia para o DEPÓSITO");
                        deposito = ler.nextFloat();
                        saldo = deposito + saldo;
                        System.out.println("Seu saldo atual é de R$ " + saldo);
                        break;

                    // opção 3 - sacar
                    case (3):
                        System.out.println("Digite a quantia do SAQUE");
                        saque = ler.nextFloat();
                        saldo = saldo - saque;
                        System.out.println("Seu saldo atual é de R$ " + saldo);
                        break;

                    // opção 0 - sair
                    case (0):
                        System.out.println("OBRIGADO POR USAR NOSSO SERVIÇOS!!");
                        sair = 0;
                        System.exit(0);
                        ler.close();
                        break;
                }
            }

            // cpf incorreto - sair
        } else {
            System.out.println("O CPF está incorreto");
            ler.close();
            System.exit(0);
        }
    }
}
