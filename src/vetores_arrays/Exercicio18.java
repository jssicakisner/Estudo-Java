package vetores_arrays;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int[] idades = new int[10];

            for (int i = 0; i < 10; i++) {
                System.out.printf("Digite a idade da %dª pessoa: ", i + 1);
                idades[i] = scan.nextInt();
            }

            int menorIdade = idades[0];
            int posicaoMenor = 0;

            for (int i = 1; i < 10; i++) {
                if (idades[i] < menorIdade) {
                    menorIdade = idades[i];
                    posicaoMenor = i + 1;
                }
            }
            int maiorIdade = idades[0];
            int posicaoMaior = 0;
            for (int i = 1; i < 10; i++) {
                if (idades[i] > maiorIdade) {
                    maiorIdade = idades[i];
                    posicaoMaior = i + 1;
                }
            }
            System.out.printf("Menor idade: %d (posiçao %d)%n", menorIdade, posicaoMenor);
            System.out.printf("Maior idade: %d (posiçao %d)%n", maiorIdade, posicaoMaior);
        }
    }
}
