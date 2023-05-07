package vetores_arrays;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            int impares = 0;
            int count = 0;

            for (int i = 0; i < vetorA.length; i++) {
                System.out.println("Informe o valor da posicao " + i);
                vetorA[i] = scan.nextInt();

                if (vetorA[i] % 2 != 0) {
                    impares += vetorA[i];
                    count++;
                }
            }
            System.out.println("A média aritmetica simples dos elementos impares deste vetor é: " + (impares / count));
        }
    }
}
