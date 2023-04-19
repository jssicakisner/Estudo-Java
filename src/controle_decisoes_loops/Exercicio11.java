package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe seu salário: ");
            double salarioAtual = scan.nextDouble();

            double range1 = (salarioAtual * 20)/100;
            double range2 = (salarioAtual * 15)/100;
            double range3 = (salarioAtual * 10)/100;
            double range4 = (salarioAtual * 5)/100;

            double aumento1 = range1 + salarioAtual;
            double aumento2 = range2 + salarioAtual;
            double aumento3 = range3 + salarioAtual;
            double aumento4 = range4 + salarioAtual;


            if (salarioAtual <= 280) {
                System.out.println("Salario antes do reajuste: " + salarioAtual + " Percentual aplicado: 20%. Valor do aumento: R$" + range1 + " Novo salário: R$" + aumento1);
            } else if (salarioAtual <= 700 && salarioAtual > 280) {
                System.out.println("Salario antes do reajuste: " + salarioAtual + " Percentual aplicado: 15%. Valor do aumento: R$" + range2 + " Novo salário: R$" + aumento2);
            } else if (salarioAtual <= 1500 && salarioAtual > 700) {
                System.out.println("Salario antes do reajuste: " + salarioAtual + " Percentual aplicado: 10%. Valor do aumento: R$" + range3 + " Novo salário: R$" + aumento3);
            } else if (salarioAtual > 1500) {
                System.out.println("Salario antes do reajuste: " + salarioAtual + " Percentual aplicado: 5%. Valor do aumento: R$" + range4 + " Novo salário: R$" + aumento4);
            }
        }
    }
}
