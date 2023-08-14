package stream_api;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Desafio16 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numero = scan.nextInt();

        long fatorial = IntStream.rangeClosed(1, numero)
                                 .mapToLong(i -> i)
                                 .reduce(1, (a, b) -> a * b);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
