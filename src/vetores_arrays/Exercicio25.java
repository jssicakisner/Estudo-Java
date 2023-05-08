package vetores_arrays;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            int[] vetorB = new int[vetorA.length];
            int[] vetorC = new int[vetorA.length];

            for (int i = 0; i < vetorA.length; i++) {
                System.out.printf("Digite o %dº elemento do vetor A: ", i + 1);
                vetorA[i] = scan.nextInt();            
            } 
            for (int i = 0; i < vetorB.length; i++) {
                System.out.printf("Digite o %dº elemento do vetor B: ", i + 1);
                vetorB[i] = scan.nextInt();            
            }
            for (int i = 0; i < vetorC.length; i++) {
                if (vetorA[i] > vetorB[i]) {
                    vetorC[i] = 1;
                } else if (vetorA[i] == vetorB[i]) {
                    vetorC[i] = 0;
                } else if (vetorA[i] < vetorB[i]) {
                    vetorC[i] = -1;
                }
            }
            System.out.println("O vetor A: ");
                for (int i = 0; i < vetorA.length; i++) {
                    System.out.print(vetorA[i] + " ");
                }
                System.out.println();
                System.out.println("O vetor B: ");
                for (int i = 0; i < vetorB.length; i++) {
                    System.out.print(vetorB[i] + " ");
                }
                System.out.println();
                System.out.println("O vetor C: ");
                for (int i = 0; i < vetorC.length; i++) {
                    System.out.print(vetorC[i] + " ");
                }
        }

        System.out.println();
    }
}
