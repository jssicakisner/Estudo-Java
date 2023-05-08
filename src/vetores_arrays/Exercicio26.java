package vetores_arrays;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            char[] vetorB = new char[vetorA.length];

            for (int i = 0; i < vetorA.length; i++) {
                System.out.printf("Digite o %dº elemento do vetor A: ", i + 1);
                vetorA[i] = scan.nextInt();
            }
            for (int i = 0; i < vetorB.length; i++) {
                if (vetorA[i] < 7) {
                    vetorB[i] = 'a';
                } else if (vetorA[i] == 7) {
                    vetorB[i] = 'b';
                } else if (vetorA[i] > 7 && vetorA[i] < 10) {
                    vetorB[i] = 'c';
                } else if (vetorA[i] == 10) {
                    vetorB[i] = 'd';
                } else if (vetorA[i] > 10) {
                    vetorB[i] = 'e';
                }
            }
            System.out.println("Vetor B:");
            for (int i = 0; i < vetorB.length; i++) {
                System.out.printf("%c ", vetorB[i]);
            }
        }

        System.out.println();
    }
}
