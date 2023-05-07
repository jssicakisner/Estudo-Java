package vetores_arrays;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            int somaMenor15 = 0;
            int elementoIgual15 = 0;
            int mediaMaior15 = 0;
            int count = 0;

            for (int i = 0; i < vetorA.length; i++) {
                System.out.println("Informe o valor da posicao " + i);
                vetorA[i] = scan.nextInt();

                if (vetorA[i] < 15) {
                    somaMenor15 += vetorA[i];
                }
                if (vetorA[i] == 15) {
                    elementoIgual15++;
                }
                if (vetorA[i] > 15) {
                    mediaMaior15 += vetorA[i];
                    count++;
                }
            }
            System.out.println("A soma de elementos armazenados neste vetor que sao inferiores a 15: " + somaMenor15);
            System.out.println("A quantidade de elementos armazenados no vetor que sao iguais a 15: " + elementoIgual15);
            System.out.println("A média dos elementos armazenados no vetor que sao superiores a 15: " + (mediaMaior15 / count));
        }
    }
}
