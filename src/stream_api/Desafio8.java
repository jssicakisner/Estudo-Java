package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosDigitos = numeros.stream()
                                    .mapToInt(numero -> String.valueOf(numero).length())
                                    .sum();

        System.out.println("Soma dos dígitos de todos os números: " + somaDosDigitos);
    }
}
