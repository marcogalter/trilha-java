import java.util.Scanner;

public class VerificadorDeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Lê a entrada do usuário como uma string representando o número da conta
            System.out.print("Digite o número da conta bancária: ");
            String numeroConta = scanner.nextLine();

            // Chama o método verificarNumeroConta, passando o número da conta como argumento
            verificarNumeroConta(numeroConta);

            // Imprime que o número de conta é válido
            System.out.println("Número de conta válido.");
        } catch (IllegalArgumentException e) {
            // Captura a exceção do tipo IllegalArgumentException
            // Imprime uma mensagem de erro, mostrando a mensagem associada à exceção
            System.out.println("Erro: " + e.getMessage());
        } finally {

        }
    }

    // Método que verifica se o número da conta tem exatamente 8 dígitos
    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            // Lança uma exceção do tipo IllegalArgumentException caso o número de conta não tenha 8 dígitos
            throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 dígitos.");
        }
    }
}
