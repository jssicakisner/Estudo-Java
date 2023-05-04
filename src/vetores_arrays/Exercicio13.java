package vetores_arrays;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            int multiplo5 = 0;

            for (int i = 0; i < vetorA.length; i++) {
               System.out.println("Informe o valor da posicao " + i); 
               vetorA[i] = scan.nextInt();

               if (vetorA[i] % 5 == 0) {
                multiplo5 += vetorA[i];
               }
               System.out.println("A soma dos múltiplos de 5 neste vetor é: " + multiplo5);
            }
        }        
    }
}
