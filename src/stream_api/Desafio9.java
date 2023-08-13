package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean saoDistintos = numeros.stream()
                                      .allMatch(numero -> numeros.stream().filter(n -> n.equals(numero)).count() == 1);

        if (saoDistintos) {
            System.out.println("Todos os números são distintos na lista.");
        } else {
            System.out.println("Existem valores repetidos nesta lista");
        }
    }
}
