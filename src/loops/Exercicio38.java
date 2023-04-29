package loops;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            int ano = 1995;
            double salario;
            int anoAtual = 2023;
            double aumento = 1.5;

            System.out.println("Informe o salario inicial: ");
            salario = scan.nextDouble();

            do {
                salario = salario + ((salario * aumento) / 100);
                aumento = aumento * 2;
                ano++;
            } while (ano <= anoAtual);

            System.out.println("Salario atual: R$" + salario);
        }
    }
}
