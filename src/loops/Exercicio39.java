package loops;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double maiorAltura = Double.MIN_VALUE;
            double menorAltura = Double.MAX_VALUE;

            int numeroMenorAltura, numeroMaiorAltura, count;
            numeroMenorAltura = numeroMaiorAltura = count = 0;

            do {
                System.out.println("Informe o numero do aluno: ");
                int numero = scan.nextInt();

                System.out.println("Informe a altura do aluno em cm: ");
                double altura = scan.nextDouble();

                count += 1;
                if (altura > maiorAltura) {
                    numeroMaiorAltura = numero;
                    maiorAltura = altura;
                }
                if (altura < menorAltura) {
                    numeroMenorAltura = numero;
                    menorAltura = altura;
                }
            } while (count < 10);
            System.out.println("A pessoa mais alta possui: " + maiorAltura + "cm e seu numero é: " + numeroMaiorAltura);
            System.out.println("A pessoa mais baixa possui: " + menorAltura + "cm e seu numero é: " + numeroMenorAltura);
        }
    }
}
