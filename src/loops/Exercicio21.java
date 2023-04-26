package loops;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe um numero inteiro: ");
            int numero = scan.nextInt();

            int count = 2;
            boolean primo = true;

            while (count < numero) {
                if (numero % count == 0) {
                    primo = false;
                    break;
                }
                count += 1;
            }
            if (primo) {
                System.out.println("O numero " + numero + " é primo!");
            } else {
                System.out.println("O numero " + numero + " nao é primo!");
            }
        }
    }
}
