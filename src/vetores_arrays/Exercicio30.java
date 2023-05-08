package vetores_arrays;
import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];

        System.out.println("Informe os valores do vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scan.nextInt();
        }
        int indexB = 0; // contador para o vetor B

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[indexB] = vetorA[i];
                indexB++;
            }
        }
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) { 
                vetorB[indexB] = vetorA[i];
                indexB++;
            }
        }

        System.out.println("Vetor B com os elementos pares e ímpares de A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        scan.close();
    }
}
