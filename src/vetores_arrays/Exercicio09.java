package vetores_arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("#,##0.00");

            int[] vetorA = new int[10];
            int[] vetorB = new int[10];
            int[] vetorC = new int[vetorA.length];

                for (int i = 0; i < vetorA.length; i++) {
                                        
                System.out.println("Informe o valor da posicao (VETOR A): " + i);
                vetorA[i] = scan.nextInt();

                }

                for (int i = 0; i < vetorA.length; i++) {

                System.out.println("Informe o valor da posicao (VETOR B): " + i);
                vetorB[i] = scan.nextInt();

                vetorC[i] = vetorA[i] / vetorB[i];

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
                System.out.println();
                System.out.print("O vetor C = ");
                for (int i = 0; i < vetorC.length; i++) {
                    System.out.print(df.format(vetorC[i]) + " ");
                }
        }
        System.out.println();
    }
}
