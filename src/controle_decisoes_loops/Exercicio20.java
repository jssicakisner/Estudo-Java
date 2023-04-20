package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Insira a primeira nota parcial: ");
            double nota1 = scan.nextDouble();

            System.out.println("Insira a segunda nota parcial: ");
            double nota2 = scan.nextDouble();

            System.out.println("Insira a terceira nota parcial: ");
            double nota3 = scan.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

            if (media == 10){
                System.out.println("Aprovado com distincao! - media: " + media);
            } else if (media <= 10 && media >= 7) {
                System.out.println("Aprovado! - media: " + media);
            } else if (media < 7) {
                System.out.println("Reprovado! - media: " + media);
            }
        }

    }
}
