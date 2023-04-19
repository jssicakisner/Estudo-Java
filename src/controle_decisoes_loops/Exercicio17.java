package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe um ano: ");
            int ano = scan.nextInt();

            double anoBissextoProva1 = ano % 4;
            double anoBissextoProva2 = ano % 100;

            if (anoBissextoProva1 == 0 && anoBissextoProva2 != 0) {
                System.out.println("O ano informado é/foi bissexto.");
            } else {
                System.out.println("O ano informado nao é/foi bissexto.");
            }
        }

    }
}
