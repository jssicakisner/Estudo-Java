package loops;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numero;
            int quantPares = 0;
            int quantImpares = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.println("Informe um numero: ");
                numero = scan.nextInt();
                if (numero % 2 == 0) {
                    quantPares++;
                } else {
                    quantImpares++;
                }                
            }
            System.out.println("A quantidade de pares é: " + quantPares);
            System.out.println("A quantidade de impares é: " + quantImpares);
        }
    }
}
