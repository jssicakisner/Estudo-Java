package vetores_arrays;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            int[] vetorB = new int[vetorA.length];

            System.out.println("Informe os valores do vetor A: ");
            for (int i = 0; i < vetorA.length; i++) {
                vetorA[i] = scan.nextInt();
            }
            for (int i = 0; i < vetorB.length; i++) {
                vetorB[i] = vetorA[9 - i];
            }
            System.out.println("Vetor B: ");
            for (int i = 0; i < vetorB.length; i++) {
                System.out.print(vetorB[i] + " ");
            }
        }

        System.out.println();
    }
}
