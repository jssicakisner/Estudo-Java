package matrizes;

import java.util.Random;

public class Exercicio02 {
    public static void main(String[] args) {

        int[][] valoresAleatorios = new int[10][10];

        Random numeroRandom = new Random();

        for (int i = 0; i < valoresAleatorios.length; i++) {
            for (int j = 0; j < valoresAleatorios[i].length; j++) {
                valoresAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        int maiorL5 = Integer.MIN_VALUE;
        int menorL5 = Integer.MAX_VALUE;
        int linha5 = 5;
        for (int i = 0; i < valoresAleatorios[linha5].length; i++) {
            if (valoresAleatorios[linha5][i] > maiorL5) {
                maiorL5 = valoresAleatorios[linha5][i];
            }
            if (valoresAleatorios[linha5][i] < menorL5) {
                menorL5 = valoresAleatorios[linha5][i];
            }
        }
        System.out.println("Maior valor na linha 5: " + maiorL5);
        System.out.println("Menor valor na linha 5: " + menorL5);

        int maiorC7 = Integer.MIN_VALUE;
        int menorC7 = Integer.MAX_VALUE;
        int coluna7 = 7;

        for (int i = 0; i < valoresAleatorios.length; i++) {
            if (valoresAleatorios[i][coluna7] > maiorC7) {
                maiorC7 = valoresAleatorios[i][coluna7];
            }
            if (valoresAleatorios[i][coluna7] < menorC7) {
                menorC7 = valoresAleatorios[i][coluna7];
            }           
        }
        System.out.println("Maior valor na coluna 7: " + maiorC7);
        System.out.println("Menor valor na coluna 7: " + menorC7);
    }
}
