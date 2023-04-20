package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe o primeiro numero: ");
            double numero1 = scan.nextDouble();

            System.out.println("Informe o segundo numero: ");
            double numero2 = scan.nextDouble();

            System.out.println("Informe a operacao desejada (+, -, *, /): ");
            String operacao = scan.next();

            double resultado = 0;
            boolean validacao = true;

            switch (operacao) {
                case "+": resultado = numero1 + numero2; break;
                case "-": resultado = numero1 - numero2; break;
                case "*": resultado = numero1 * numero2; break;
                case "/": resultado = numero1 / numero2; break;
                default: 
                System.out.println("Operacao inválida!");
                validacao = false;
            }
            if (validacao) {
                System.out.println("O resultado é: " + resultado);
            }
            if (resultado % 2 == 0) {
                System.out.println("O resultado é par.");
            } else {
                System.out.println("O resultado é impar.");
            }
            if (resultado >= 0) {
                System.out.println("O resultado é positivo.");
            } else {
                System.out.println("O resultado é negativo.");
            }
            if (resultado == (Math.round(resultado))) {
                System.out.println("O resultado é inteiro.");
            } else {
                System.out.println("O resultado é decimal.");
            }
        }
    }
}
