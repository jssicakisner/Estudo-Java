package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maiorPrimo = numeros.stream()
                                .filter(Desafio14::isPrimo)
                                .max(Integer::compareTo)
                                .orElse(-1);

        if (maiorPrimo != -1) {
            System.out.println("Maior número primo da lista: " + maiorPrimo);
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }

    private static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
