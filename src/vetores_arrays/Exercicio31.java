package vetores_arrays;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[5];

            System.out.println("Informe os valores do vetor: ");
            for (int i = 0; i < vetorA.length; i++) {
                vetorA[i] = scan.nextInt();
            }
            for (int i = 0; i < vetorA.length; i++) {
                System.out.println("Tabuada de " + vetorA[i] + ":");
                for (int j = 1; j <= 10; j++) {
                    System.out.println(vetorA[i] + " x " + j + " = " + (vetorA[i] * j));
                }
                System.out.println();
            }
        }
    }
}
