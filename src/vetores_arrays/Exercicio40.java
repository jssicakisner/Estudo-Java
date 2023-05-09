package vetores_arrays;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            int elementoX;
            boolean igualA;

            System.out.println("Digite os elementos do vetor A:");
                for (int i = 0; i < vetorA.length; i++) {
                    System.out.printf("vetorA[%d]: ", i);        
                    vetorA[i] = scan.nextInt();
                }
            System.out.println("Informe o elemento a ser buscado no vetor: ");
            elementoX = scan.nextInt();

            do {
                for (int i = 0; i < vetorA.length; i++) {
                    if (elementoX == vetorA[i]) {
                        igualA = true;
                        System.out.print("O elemento " + elementoX + " é igual ao índice " + i + " do vetor A, com elemento: " + vetorA[i]);
                        break;                    
                    }
                }
            } while (igualA = false);
        }
    }
}
