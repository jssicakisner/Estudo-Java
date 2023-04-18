package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe uma letra para designar sexo (F/M): ");
            String letra = scan.next();

            if(letra.equalsIgnoreCase("F")){
                System.out.println("F - FEMININO");
            }
            else if(letra.equalsIgnoreCase("M")){
                System.out.println("M - MASCULINO");
            } else {
                System.out.println("Sexo inválido!");
            }
        }
    }
}
