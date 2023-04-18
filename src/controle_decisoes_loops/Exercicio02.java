package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe um numero: ");
            double numero = scan.nextDouble();

            if(numero >= 0){
                System.out.println("O numero é positivo.");
            } else {
                System.out.println("O numero é negativo.");
            }
        }
    }
}
