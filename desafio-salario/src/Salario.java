/*Faça um programa que calcule e imprima o salário a ser transferidopara um funcionário
 * Para realizar o cálculo, recebe o valor bruto do salário e o adicional dos benefícios
 * O salário a ser transferido é calculado da seguinte maneira
 * 
 * (valor bruto do salário - percentual de imposto mediante ao salário) + adicional dos benefícios
 * 
 * Para calcular o percentual de imposto segue as aliquiotas
 * de 0 a 1100.00R$ = 5.00%
 * de R$1100.01 a R$2500.00 = 10.00%
 * maior que R$2500.00 = 15.00%
 * 
 * 
*/

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Qual o seu salário? ");
        double salario = scanner.nextDouble();

        System.out.println("Quais os seus benefícios? ");
        double beneficios = scanner.nextDouble();

        double imposto = 0;
        if (salario >= 0 && salario < 1100){
            imposto = salario * 0.05;
        }
        else if (salario > 1100 && salario < 2500) {
            imposto = salario * 0.10;
        }
        else{
            imposto = salario * 0.15;
        }

        double salarioLiquido = salario - imposto + beneficios;
        System.out.println("O que você tem a receber é: R$" + salarioLiquido);
    }
}