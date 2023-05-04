package vetores_arrays;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            int count = 0;

            for (int i = 0; i < vetorA.length; i++) {
                System.out.println("Informe o valor da posicao " + i);
                vetorA[i] = scan.nextInt();
                
                if (vetorA[i] % 2 == 0) {
                    count++;
                    System.out.println("O numero de pares no vetor sao: " + count);
                }
            }
        }
    }
}
