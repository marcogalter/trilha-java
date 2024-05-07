import java.util.Scanner;

public class ControleDeSaque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o limite diário de saque
        System.out.print("Informe o limite diário de saque: ");
        double limiteDiario = scanner.nextDouble();

        // Loop para iterar sobre os saques
        while (true) {
            System.out.print("Informe o valor do saque (digite 0 para encerrar): ");
            double valorSaque = scanner.nextDouble();

            // Verifica se o valor do saque é zero, encerrando as transações
            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break;
            }

            // Verifica se o valor do saque ultrapassa o limite diário
            if (valorSaque > limiteDiario) {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break;
            }

            // Se o valor do saque não ultrapassar o limite diário, subtrai o valor do saque do limite diário
            limiteDiario -= valorSaque;

            // Informa que o saque foi realizado e mostra o limite restante
            System.out.printf("Saque realizado. Limite restante: %.2f\n", limiteDiario);
        }

}
}