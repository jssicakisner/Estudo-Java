package loops;

import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe o numero de termos 'N': ");
            int n = scan.nextInt();

            double h = 0.0;

            for (int i = 1; i <= n; i++) {
                h += 1.0 / i;
            }
            System.out.println("O valor de H com " + n + " termos é: " + h);
        }
    }
}
