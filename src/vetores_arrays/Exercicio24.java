package vetores_arrays;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            int[] vetorB = new int[vetorA.length];

            for (int i = 0; i < vetorA.length; i++) {
                System.out.printf("Digite o %dº elemento do vetor A: ", i + 1);
                vetorA[i] = scan.nextInt();            
            } 
            for (int i = 0; i < vetorB.length; i++) {
                if (vetorA[i] % 2 != 0) {
                    vetorB[i] = 0;
                } else {
                    vetorB[i] = 1;
                }
            }
            System.out.println("O vetor A: ");
            for (int i = 0; i < vetorA.length; i++) {
                System.out.print(vetorA[i]);
            }
            System.out.println();
            System.out.println("O vetor B: ");
            for (int i = 0; i < vetorB.length; i++) {
                System.out.print(vetorB[i]);
            }
        }

        System.out.println();
    }
}
