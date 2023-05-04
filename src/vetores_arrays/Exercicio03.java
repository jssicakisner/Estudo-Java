package vetores_arrays;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[15];
            int[] vetorB = new int[vetorA.length];

            for (int i = 0; i < vetorA.length; i++) {
                    
            System.out.println("Informe o valor da posicao " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * vetorA[i];
            }
            System.out.print("O vetor A = ");
            for (int i = 0; i < vetorA.length; i++) {
                System.out.print(vetorA[i] + " ");
            }
            System.out.println();
            System.out.print("O vetor B = ");
            for (int i = 0; i < vetorB.length; i++) {
                 System.out.print(vetorB[i] + " ");
            }
        }

        System.out.println();
    }
}
