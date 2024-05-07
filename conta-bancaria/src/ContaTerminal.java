import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu de Opções:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                    System.out.print("Informe o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                case 2:
                    System.out.print("Informe o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: R$ " + saldo);
                    } else {
                        continuar = false;  
                        System.out.println("Saldo atual: R$ " + saldo);                    
                        System.out.println("Saldo insuficiente.");
                        System.out.println("Encerrando o programa...");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }
        }
    }
    }
