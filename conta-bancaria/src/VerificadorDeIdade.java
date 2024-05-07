import java.util.Scanner;

public class VerificadorDeIdade { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite sua idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); 

        // Verifica se a idade é maior ou igual a 18
        if (idade >= 18) {
            // Imprime uma mensagem informando que o usuário é elegível para criar uma conta bancária
            System.out.println("Você está elegível para criar uma conta bancária.");
        } else {
            // Imprime uma mensagem informando que o usuário não é elegível para criar uma conta bancária
            System.out.println("Você não está elegível para criar uma conta bancária.");
        }
    }
}
