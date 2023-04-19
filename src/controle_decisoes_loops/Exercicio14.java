package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe a primeira nota parcial: ");
            double nota1 = scan.nextDouble();

            System.out.println("Informe a segunda nota parcial: ");
            double nota2 = scan.nextDouble();

            double media = (nota1 + nota2)/2;

            if(media <= 10 && media > 9) {
                System.out.println("Nota parcial 1: " + nota1 + " | Nota parcial 2: " + nota2);
                System.out.println("Media: " + media);
                System.out.println("Conceito: A");
                System.out.println("APROVADO");
            } else if (media <= 9 && media > 7.5) {
                System.out.println("Nota parcial 1: " + nota1 + " | Nota parcial 2: " + nota2);
                System.out.println("Media: " + media);
                System.out.println("Conceito: B");
                System.out.println("APROVADO");
            } else if (media <= 7.5 && media > 6) {
                System.out.println("Nota parcial 1: " + nota1 + " | Nota parcial 2: " + nota2);
                System.out.println("Media: " + media);
                System.out.println("Conceito: C");
                System.out.println("APROVADO");
            } else if (media <= 6 && media > 4) {
                System.out.println("Nota parcial 1: " + nota1 + " | Nota parcial 2: " + nota2);
                System.out.println("Media: " + media);
                System.out.println("Conceito: D");
                System.out.println("REPROVADO");
            } else if (media <= 4 && media > 0) {
                System.out.println("Nota parcial 1: " + nota1 + " | Nota parcial 2: " + nota2);
                System.out.println("Media: " + media);
                System.out.println("Conceito: E");
                System.out.println("REPROVADO");
            }
        }
    }
}
