package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> grupo = numeros.stream()
                                                   .filter(numero -> numero % 2 != 0 && (numero % 3 == 0 || numero % 5 == 0))
                                                   .collect(Collectors.partitioningBy(numero -> numero % 3 == 0));

        System.out.println("Valores ímpares múltiplos de 3 ou de 5 agrupados por múltiplo de 3:");
        System.out.println("Múltiplos de 3: " + grupo.get(true));
        System.out.println("Múltiplos de 5: " + grupo.get(false));
    }
}
