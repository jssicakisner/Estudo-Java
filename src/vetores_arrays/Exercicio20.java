package vetores_arrays;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Informe a cotaçao do dólar em relação ao real: ");
            double cotacaoDolarReal = scan.nextDouble();

            double[] conversoes = new double[20];
            for (int i = 1; i <= 20; i++) {
                conversoes[i - 1] = cotacaoDolarReal * i;
            }
            System.out.println("Conversoes de dólar para real:");
            for (int i = 0; i < 20; i++) {
                System.out.printf("US$ %d = R$ %.2f%n", i + 1, conversoes[i]);
            }
        }
    }
}
