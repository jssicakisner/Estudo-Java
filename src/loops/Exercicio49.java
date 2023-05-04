package loops;

import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o numero de termos 'n' da série: ");
        int n = scan.nextInt();

        double soma = 0;
        int m = 1;

        for (int i = 1; i <= n; i++) {
            soma += (double) i / m;
            m += 2;
        }
        System.out.println("A série é: ");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "/" + (2 * i - 1));
            if (i < n) {
                System.out.println(" + ");
            }
        }
        System.out.println();
        System.out.println("A soma da série é: " + soma);
        scan.close();
    }
}
