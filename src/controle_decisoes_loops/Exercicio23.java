package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe um numero: ");

            double numero = scan.nextDouble();

            double numeroRound = Math.round(numero);

            if (numero == numeroRound){
                System.out.println("O numero informado é inteiro.");
            } else {
                System.out.println("O numero informado é decimal.");
            }
        }
    }
}
