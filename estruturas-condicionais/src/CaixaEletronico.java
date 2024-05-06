import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        double saldo = 2000;

        System.out.print("Olá, você tem o total de " + saldo + "R$ disponível, por favor, digite quanto você deseja sacar: ");
        double valorSolicitado = scanner.nextDouble();

        if (valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;
            System.out.print("Saque efetuado com sucesso, o valor restante em conta é de: " + saldo + "R$");
        } else{
            System.out.print("O valor desejado é maior que o saldo disponível, favor digitar um valor menor!");
    }}
}
