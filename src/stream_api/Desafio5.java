package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double mediaMaioresQueCinco = numeros.stream()
                                             .filter(numero -> numero > 5)
                                             .mapToInt(Integer::intValue)
                                             .average()
                                             .orElse(0.0);

        System.out.println("Media dos numeros maiores que cinco: " + mediaMaioresQueCinco);
    }
}
