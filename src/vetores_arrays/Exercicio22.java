package vetores_arrays;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            boolean todosPares = true;

            for (int i = 0; i < vetorA.length; i++) {
               System.out.printf("Digite o %dº elemento do vetor: ", i + 1);
               vetorA[i] = scan.nextInt();
            }
            for (int i = 0; i < vetorA.length; i++) {
                if (vetorA[i] % 2 != 0) {
                    todosPares = false;
                    break;
                } 
            }
            if (todosPares) {
                System.out.println("Todos os elementos do vetor sao pares.");
            } else {
                System.out.println("Pelo menos um elemento do vetor nao é par.");
            }
        }        
    }
}
