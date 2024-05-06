import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Digite a nota da prova: ");
        double nota = scanner.nextDouble();

        /*if (nota >= 7)
        System.out.println("Aprovado!"); 
        else if(nota >= 5 && nota < 7)
        System.out.println("Recuperação!");
        else
            System.out.println("Reprovado!");*/
        
        String resultado = nota >= 7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "Recuperação!" : "Reprovado!";
        System.out.println(resultado);
    }
    
}
