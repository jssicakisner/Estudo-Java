package vetores_arrays;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            int soma = 0;

            for (int i = 0; i < vetorA.length; i++) {
                System.out.println("Informe o valor da posicao " + i);
                vetorA[i] = scan.nextInt();
                    
                soma += vetorA[i];
               System.out.println("A soma dos elementos do vetor é: " + soma); 
            }
        }        
    }
}
