package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean saoIguais = numeros.stream()
                                   .allMatch(numero -> numero.equals(numeros.get(0)));

        if (saoIguais) {
            System.out.println("Todos os números da lista sao iguais.");
        } else {
            System.out.println("Os números da lista sao diferentes.");
        }
    }
}
