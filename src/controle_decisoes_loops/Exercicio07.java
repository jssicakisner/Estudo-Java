package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe o primeiro numero: ");
            int numero1 = scan.nextInt();

            System.out.println("Informe o segundo numero: ");
            int numero2 = scan.nextInt();

            System.out.println("Informe o terceiro numero: ");
            int numero3 = scan.nextInt();

            if (numero1 > numero2 && numero1 > numero3){
                System.out.println("O maior numero informado é: " + numero1);
            } else if (numero2 > numero1 && numero2 > numero3) {
                System.out.println("O maior numero informado é: " + numero2);
            } else if (numero3 > numero1 && numero3 > numero2) {
                System.out.println("O maior numero informado é: " + numero3);
            }
            if (numero1 < numero2 && numero1 < numero3){
                System.out.println("O menor numero informado é: " + numero1);
            } else if (numero2 < numero1 && numero2 < numero3) {
                System.out.println("O menor numero informado é: " + numero2);
            } else if (numero3 < numero1 && numero3 < numero2) {
                System.out.println("O menor numero informado é: " + numero3);
            }
        }
    }
}
