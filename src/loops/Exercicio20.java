package loops;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numero;
            int fatorial = 1;
            int count = 1;
            String interacao = "";

            System.out.println("Deseja informar numero para fatoraçao? (S/N): ");
            interacao = scan.next();

            while (interacao.equalsIgnoreCase("S")) {
                do {
                System.out.println("Informe um numero inteiro: ");
                numero = scan.nextInt();

                if (numero <= 16 && numero > 0) {
                   for (int i = 1; i <= numero; i++) {
                    fatorial = fatorial * i;
                }
                    System.out.println("Resultado fatorial do numero " + numero + " é = " + fatorial);
                    count++; 
                } else {
                    System.out.println("Informe um valor valido entre 0 e 16!");
                }                
                
                } while (count < 2);

                    System.out.println("Deseja informar mais um numero? (S/N): ");
                    interacao = scan.next();

            } 
        }
    }
}
