package matrizes;

import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        
        int[][] valoresAleatorios = new int[4][4];

        Random numeroRandom = new Random();

        for (int i = 0; i < valoresAleatorios.length; i++) {
            for (int j = 0; j < valoresAleatorios[i].length; j++) {
                valoresAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }
        int maior = Integer.MIN_VALUE;
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < valoresAleatorios.length; i++) {
            for (int j = 0; j < valoresAleatorios[i].length; j++) {
                if (valoresAleatorios[i][j] > maior) {
                    maior = valoresAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        //Verificando os numeros impressos na matriz
        for (int i = 0; i < valoresAleatorios.length; i++) {
            for (int j = 0; j < valoresAleatorios[i].length; j++) {
                System.out.print(valoresAleatorios[i][j] + " ");
            }
            System.out.println();        
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);
    } 
}
