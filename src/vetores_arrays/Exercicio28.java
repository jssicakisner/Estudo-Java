package vetores_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            int[] vetorB = new int[vetorA.length];
            int[] vetorC = new int[vetorA.length + vetorB.length];

            System.out.println("Informe os valores do vetor A: ");
            for (int i = 0; i < vetorA.length; i++) {
                vetorA[i] = scan.nextInt();
            }
            System.out.println("Informe os valores do vetor B: ");
            for (int i = 0; i < vetorB.length; i++) {
                vetorB[i] = scan.nextInt();
            }
            System.arraycopy(vetorA, 0, vetorC, 0, 10);
            System.arraycopy(vetorB, 0, vetorC, 10, 10);

            System.out.println("Vetor A: " + Arrays.toString(vetorA));
            System.out.println("Vetor B: " + Arrays.toString(vetorB));
            System.out.println("Vetor C: " + Arrays.toString(vetorC));
        }
    }
}
