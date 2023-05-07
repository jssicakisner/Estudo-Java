package vetores_arrays;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            int idade = 0;

            for (int i = 0; i < vetorA.length; i++) {
                System.out.println("Informe a idade da pessoa: " + (i + 1));
                vetorA[i] = scan.nextInt();

                if (vetorA[i] > 35) {
                    idade++;
                }
            }
            System.out.println("O numero de pessoas com idade maior que 35 anos: " + idade);
        }
    }
}
