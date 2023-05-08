package vetores_arrays;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            boolean palindromo = true;

            for (int i = 0; i < vetorA.length; i++) {
                System.out.printf("Digite o %dº elemento do vetor: ", i + 1);
                vetorA[i] = scan.nextInt();
            }
            for (int i = 0; i < 5; i++) {
                if (vetorA[i] != vetorA[9 - i]) {
                    palindromo = false;
                    break;
                }
            }
            if (palindromo) {
                System.out.println("O vetor é um palíndromo.");
            } else {
                System.out.println("O vetor nao é um palíndromo.");
            }
        }
    }
}
