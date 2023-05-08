package vetores_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[20];
            int[] vetorB = new int[vetorA.length];
            int[] vetorC = new int[vetorA.length];

            System.out.println("Informe os valores do vetor A: ");
            for (int i = 0; i < vetorA.length; i++) {
                vetorA[i] = scan.nextInt();
            }

            int indexB = 0; // contador para o vetor B
            int indexC = 0; // contador para o vetor C

            for (int i = 0; i < vetorA.length; i++) {
                if (vetorA[i] % 2 == 0) {
                    vetorB[indexB] = vetorA[i];
                    indexB++;
                } else {
                    vetorC[indexC] = vetorA[i];
                    indexC++;
                }
            }
            System.out.println("Vetor B (pares): " + Arrays.toString(Arrays.copyOf(vetorB, indexB)));
            System.out.println("Vetor C (impares): " + Arrays.toString(Arrays.copyOf(vetorC, indexC)));
        }
    }
}
