package vetores_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];

            System.out.println("Digite os elementos do vetor A:");
                for (int i = 0; i < vetorA.length; i++) {
                    System.out.printf("vetorA[%d]: ", i);        
                    vetorA[i] = scan.nextInt();
                }
                Arrays.sort(vetorA, 0, 9);
                System.out.println("Sub Array Classificado em Java: ");
                    for (int num : vetorA) {
                    System.out.println(num);
                    }
        }
    }
}
