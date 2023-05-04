package vetores_arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("#,##0.00");

            double[] vetorA = new double[15];
            double[] vetorB = new double[vetorA.length];

            for (int i = 0; i < vetorA.length; i++) {
                        
            System.out.println("Informe o valor da posicao " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
            }
            System.out.print("O vetor A = ");
            for (int i = 0; i < vetorA.length; i++) {
                System.out.print(vetorA[i] + " ");
                }
            System.out.println();
            System.out.print("O vetor B = ");
            for (int i = 0; i < vetorB.length; i++) {
                System.out.print(df.format(vetorB[i]) + " ");
            }
        }
    }
}
