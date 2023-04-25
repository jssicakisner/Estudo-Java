package loops;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numero;
            int fatorial = 1;
            int count = 1;

            do {
                System.out.println("Informe um numero inteiro: ");
                numero = scan.nextInt();

                for (int i = 1; i <= numero; i++) {
                    fatorial = fatorial * i;
                }
                System.out.println("Resultado fatorial do numero " + numero + " é = " + fatorial);
                count++;
                
            } while (count < 2);
        }
    }
}
