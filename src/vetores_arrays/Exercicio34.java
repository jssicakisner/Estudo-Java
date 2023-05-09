package vetores_arrays;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
        System.out.printf("Informe o %dº elemento de A: ", i+1);        
            vetorA[i] = scan.nextInt();
    
            System.out.printf("Elemento %d de A: %d\n", i+1, vetorA[i]);
    
            System.out.printf("Divisores de 0 até %d: ", vetorA[i]);
            for (int j = 1; j <= vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    System.out.printf("%d ", j);
                }            
            }
            System.out.println("\n");
        }      
        scan.close();
    }
}
