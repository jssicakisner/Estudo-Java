package loops;

import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Informe a quantidade de termos (n): ");
            int n = scan.nextInt();
            
            double soma = 0.0;
            int m = 1;
            for (int i = 1; i <= n; i++) {
                soma += (double) i / m;
                m += 2;
                System.out.print(i + "/" + (m-2));
                if (i < n) {
                    System.out.print(" + ");
                }
            }
            
            System.out.println("\nA soma da série é: " + soma);
        }
    }
}
