package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, -1);

        boolean todosPositivos = numeros.stream()
                                        .allMatch(numero -> numero > 0);

        if (todosPositivos) {
            System.out.println("Todos os numeros sao positivos");
        } else {
            System.out.println("Existem numeros negativos no vetor!");
        }
    }
}
