package matrizes;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrizM = new int[3][3];

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.println("Informe o valor da posicao: [" + i + "," + j + "]");
                matrizM[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println();
        }

        int pares = 0;
        int impares = 0;

        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                if (matrizM[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        scan.close();
        System.out.println("O numero de pares na Matriz M: " + pares);
        System.out.println("O numero de impares na Matriz M: " + impares);
    }
}
