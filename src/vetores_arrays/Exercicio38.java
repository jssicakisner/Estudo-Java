package vetores_arrays;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            int[] vetorB = new int[vetorA.length];
            int[] vetorC = new int[Math.min(vetorA.length, vetorB.length)];
            int index = 0;

            System.out.println("Digite os elementos do vetor A:");
                for (int i = 0; i < vetorA.length; i++) {
                    System.out.printf("vetorA[%d]: ", i);        
                    vetorA[i] = scan.nextInt();
                }
            System.out.println("Digite os elementos do vetor B:");
                for (int i = 0; i < vetorB.length; i++) {
                    System.out.printf("vetorB[%d]: ", i);        
                    vetorB[i] = scan.nextInt();
                }
                for (int i = 0; i < vetorA.length; i++) {
                    for (int j = 0; j < vetorB.length; j++) {
                        if (vetorA[i] == vetorB[j]) {
                            vetorC[index++] = vetorA[i];
                            break;
                        }
                    }
                }
                System.out.print("Vetor C: [");
                for (int i = 0; i < index; i++) {
                    System.out.print(vetorC[i]);
                    if (i < index - 1) {
                        System.out.print(", ");
                    }
                }
        }

        System.out.println("]");
    }
}
