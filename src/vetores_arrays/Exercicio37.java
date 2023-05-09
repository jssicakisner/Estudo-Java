package vetores_arrays;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            int[] vetorB = new int[10];

            System.out.println("Informe os valores de A: ");
            for (int i = 0; i < vetorA.length; i++) {
                vetorA[i] = scan.nextInt();
            }
            for (int i = 0; i < vetorB.length; i++) {
                int sum = 0;
                for (int j = i; j < vetorA.length; j++) {
                    sum += vetorA[j];
                }
                vetorB[i] = sum;
            }
            System.out.println("O valores de B: ");
            for (int i = 0; i < vetorB.length; i++) {
                System.out.print(vetorB[i] + " ");
            }
        }
    }
}
