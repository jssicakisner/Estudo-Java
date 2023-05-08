package vetores_arrays;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] nota1 = new int[10];
            int[] nota2 = new int[nota1.length];
            int[] result = new int[10];

            for (int i = 0; i < nota1.length; i++) {
                System.out.printf("Informe a nota 1 do %dª aluno: ", i + 1);
                nota1[i] = scan.nextInt();

                System.out.printf("Informe a nota 2 do %dª aluno: ", i + 1);
                nota2[i] = scan.nextInt();            
            }
            for (int i = 0; i < result.length; i++) {
                result[i] = (nota1[i] + nota2[i]) / 2;

                if (result[i] < 7) {
                    System.out.printf("Media do %dª aluno: %d (Situaçao: Reprovado)%n", (i + 1), result[i]);
                } else {
                    System.out.printf("Media do %dª aluno: %d (Situaçao: Aprovado)%n", (i + 1), result[i]);
                }
            }
        }
    }
}
