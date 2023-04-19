package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe seu turno de estudo (M - V - N): ");
            String letra = scan.next();

            switch(letra) {
                case "m":
                case "M":
                System.out.println("Bom Dia!");
                break;
                case "v":
                case "V":
                System.out.println("Boa Tarde!");
                break;
                case "n":
                case "N":
                System.out.println("Boa Noite!");
                break;
                default:
                System.out.println("Valor Inválido!");
            }
        }
    }
}
