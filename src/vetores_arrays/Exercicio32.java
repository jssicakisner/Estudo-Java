package vetores_arrays;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];       

        System.out.println("Informe os valores do vetor: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {
            int elemento = vetorA[i];
            boolean primo = true;
        
            for (int j = 2; j < elemento; j++) {
                if (elemento % j == 0) {
                    primo = false;
                    break;
                }
            }
            System.out.println();
            if (primo) {
                System.out.println(elemento + " - primo.");
            } else {
                System.out.println(elemento + " - nao é primo.");
            }
        }
        scan.close();
    }
}
