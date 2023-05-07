package vetores_arrays;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] vetorA = new int[10];
            int impares = 0;
            int pares = 0;
            int porcentagemImpar;
            int porcentagemPar;

            for (int i = 0; i < vetorA.length; i++) {
                System.out.println("Informe o valor da posicao " + i);
                vetorA[i] = scan.nextInt();

                if (vetorA[i] % 2 != 0) {
                    impares++;
                }
                if (vetorA[i] % 2 == 0) {
                    pares++;
                }            
            }

            porcentagemImpar = (impares * 100) / vetorA.length;
            porcentagemPar = (pares * 100) / vetorA.length;
            System.out.println("O percentual de elementos PARES neste vetor é: " + porcentagemPar + "%");
            System.out.println("O percentual de elementos IMPARES neste vetor é: " + porcentagemImpar + "%");
        }
    }
}
