package vetores_arrays;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[15];
            int[] vetorB = new int[vetorA.length];
            

            System.out.println("Digite os elementos do vetor A:");
            for (int i = 0; i < vetorA.length; i++) {
                System.out.printf("vetorA[%d]: ", i);        
                vetorA[i] = scan.nextInt();
            }
            for (int i = 0; i < vetorA.length; i++) {
                int fatorial = 1;
                for (int j = 1; j <= vetorA[i]; j++) {
                    fatorial *= j;
                }
                vetorB[i] = fatorial;
            }
            System.out.println("\nVetor A:");
            for (int i = 0; i < vetorA.length; i++) {
                System.out.printf("%d ", vetorA[i]);
            }
            System.out.println("\n\nVetor B:");
            for (int i = 0; i < vetorB.length; i++) {
                System.out.printf("%d ", vetorB[i]);
            }
        }
    }
}
