/*
Faça um algoritmo com as funções de um caixa eletrônico. Utilize estrutura de repetição. Deve apresentar um menu:
1 - Saldo
2 - Saque
3 - Depósito
4 - Sair
- O algoritmo deve executar as operações de um cliente até que ele digite a opção 4- Sair.
- Caso o cliente digite uma opção que não exista informe "Opção invalida".
- Algoritmo deve operar as quatro funções do caixa eletrônico.
- O Saldo inicial é igual a 0,00.
- Caso o usuário tente sacar um valor maior que o saldo disponível o programa deve apresentar a mensagem "Saldo insuficiente".
- No final de cada operação o saldo deve ser apresentado.
 */

//Transformar esse código em SWING com JOPTIONPANE

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        String answer, resposta, options = """
                \nQue opção deseja escolher?
                [1] Saldo
                [2] Saque
                [3] Depósito
                [4] Sair
                """;

        int r;
        double totalAccount = 0, quant, deposito;

        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("\n              B        A         N         C          O                 ");
        System.out.println("\n--------------------------------------------------------------------------");
        System.out.print("\nDigite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu CPF: ");
        double cpf = sc.nextDouble();

        System.out.println("\n--------------------------------------------------------------------------");

        System.out.println("\nSeja bem-vindo(a) " + nome + "! Portador do CPF de número: " + cpf);

        do {
            do {
                System.out.println("\n--------------------------------------------------------------------------");
                System.out.println(options);
                System.out.print("R: ");
                r = sc.nextInt();

                if (r > 4) {
                    System.out.println("\n Digite uma opção válida!");
                }

            } while (r > 4);

            switch (r) {
                case 1:
                    System.out.println("\n--------------------------------------------------------------------------");
                    System.out.println("\nVocê selecionou a opção [1] Saldo, vamos conferir o saldo da sua conta!");
                    System.out.println("\nNo momento, seu saldo total é de R$" + totalAccount);
                    System.out.println("\nDeseja selecionar outra opção? [s/n]");
                    System.out.print("R: ");
                    break;

                case 2:
                    System.out.println("\n--------------------------------------------------------------------------");
                    System.out.println("\nVocê selecionou a opção [2] Saque, vamos lá!");
                    System.out.println("\nNo momento, seu saldo total é de R$" + totalAccount);

                    do {

                        System.out.println("\n--------------------------------------------------------------------------");
                        System.out.print("\nQual a quantia que você deseja sacar? R$");
                        quant = sc.nextDouble();

                        if (quant > totalAccount) {
                            System.out.println("\n--------------------------------------------------------------------------");
                            System.out.println("\nVocê não possui saldo suficiente!");
                            System.out.println("\nTentar novamente? [s/n]");
                            System.out.print("R: ");
                        }

                        resposta = sc.nextLine();
                        resposta = sc.nextLine();

                    } while (resposta.equalsIgnoreCase("s"));



                    if (resposta.equalsIgnoreCase("n")) {
                        System.out.println("\n--------------------------------------------------------------------------");
                        System.out.println("\n                V  O  L  T  E     S  E  M  P  R  E                        ");
                        System.out.println("\n--------------------------------------------------------------------------");
                        System.exit(0);
                        break;
                    }
                    System.out.println("\nVocê sacou a quantia de R$" + quant);
                    totalAccount -= quant;
                    System.out.println("\nSeu saldo atual, após o saque é de R$" + totalAccount);
                    System.out.println("\nDeseja selecionar outra opção? [s/n]");
                    break;

                case 3:
                    System.out.println("\n--------------------------------------------------------------------------");
                    System.out.println("\nVocê selecionou a opção [3] Depósito, vamos lá!");
                    System.out.println("\nNo momento, seu saldo total é de R$" + totalAccount);
                    System.out.print("\nQual a quantia que você deseja depositar? R$");
                    deposito = sc.nextDouble();
                    System.out.println("\nVocê depositou a quantia de R$" + deposito);
                    totalAccount += deposito;
                    System.out.println("\nSeu saldo atual, após o saque é de R$" + totalAccount);
                    System.out.println("\nDeseja selecionar outra opção? [s/n]");
                    break;

                case 4:
                    System.out.println("\n--------------------------------------------------------------------------");
                    System.out.println("\n                V  O  L  T  E     S  E  M  P  R  E                        ");
                    System.out.println("\n--------------------------------------------------------------------------");
                    System.exit(0);
                    break;
            }

            answer = sc.nextLine();
            answer = sc.nextLine();

        } while (answer.equalsIgnoreCase("s"));

        System.out.println("\n--------------------------------------------------------------------------");
        System.out.println("\n                V  O  L  T  E     S  E  M  P  R  E                        ");
        System.out.println("\n--------------------------------------------------------------------------");
        System.exit(0);

    }
}



