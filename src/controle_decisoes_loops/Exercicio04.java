package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe uma letra: ");
            String letra = scan.next();

            switch(letra) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                System.out.println("A letra informada é uma vogal.");
                break;
                default:
                System.out.println("A letra informada é uma consoante.");
            }
        }
    }
}
