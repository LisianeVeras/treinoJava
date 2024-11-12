import java.util.Scanner;

//Desafio do curso Java: criando sua primeira aplicação da Alura
//Código criado utilizando o loop while e condicionais if/else
public class Main {
    public static void main(String[] args) {
        String nome = "FULANO BELTRANO CICLANO";
        String dadosContaBanco = "ATUALITY";
        String dadosContaAgencia = "1234 - CAPITÓLIO-MG";
        String dadosContaNumero = "1234-5";
        String tipoConta = "CORRENTE";
        double saldo = 2750.00;

        System.out.println("    E X T R A T O   B A N C Á R I O");
        System.out.println("#######################################");
        System.out.println("\nCliente: " + nome);
        System.out.println("Banco: " + dadosContaBanco);
        System.out.println("Agência: " + dadosContaAgencia);
        System.out.println("Conta: " + dadosContaNumero);
        System.out.println("Modo de conta ativa: " + tipoConta);
        System.out.println("\n#######################################");

        System.out.println(" A C E S S O    D O   C L I E N T E");

        String menu = """
                \n----> Digite a opção desejada <----
                     1. Consultar saldo
                     2. Realizar Transferência
                     3. Receber Transferência
                     4. Encerrar acesso
                
                """;

        Scanner scanner = new Scanner(System.in);


        int opcao = 0;
        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atual: R$ " + saldo);
            }
            else if (opcao == 2) {
                System.out.print("Digite o valor que deseja transferir: R$ ");
                double valorTransferencia = scanner.nextDouble();

                if (valorTransferencia > saldo) {
                    System.out.println("Saldo insuficiente para realizar a transferência.");
                } else if (valorTransferencia <= 0) {
                    System.out.println("O valor a ser transferido deve ser maior que zero.");
                } else {
                    saldo = saldo - valorTransferencia;
                    System.out.println("Transferência realizada com sucesso! Novo saldo: R$ " + saldo);
                }
            }
            else if (opcao == 3) {
                System.out.print("Digite o valor a ser recebido: R$ ");
                double valorRecebido = scanner.nextDouble();

                if (valorRecebido <= 0) {
                    System.out.println("O valor a receber deve ser maior que zero.");
                } else {
                    saldo = saldo + valorRecebido;
                    System.out.println("Você recebeu R$ " + valorRecebido + ". Novo saldo: R$ " + saldo);
                }
            }
            else if (opcao == 4) {
                System.out.println("Acesso encerrado. Agradecemos por utilizar nossos serviços! Até a próxima!");
            }
            else {
                System.out.println("Opção inválida. Tente novamente.");
            }

        }
    }
}

