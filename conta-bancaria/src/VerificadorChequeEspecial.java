import java.util.Scanner;

public class VerificadorChequeEspecial { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Informe o saldo atual da conta bancária: ");
        double saldo = scanner.nextDouble(); 
        System.out.print("Informe o valor do saque que deseja realizar: ");
        double saque = scanner.nextDouble(); 
        double limiteChequeEspecial = 500; 

        // Verifique se o saque não ultrapassa o saldo disponível na conta:
        if (saldo >= saque) {
            System.out.println("Transação realizada com sucesso.");
        } else {
            // Verifica se o saque ultrapassa o saldo disponível e o limite do cheque especial
            if (saque > saldo + limiteChequeEspecial) {
                System.out.println("Transação não realizada. Limite do cheque especial excedido.");
            } else {
                System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            }
        }
    }
}
