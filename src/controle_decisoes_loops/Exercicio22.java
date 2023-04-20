package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe um numero: ");
            int numero = scan.nextInt();
            
            int resto = numero % 2;

            if (resto == 0) {
                System.out.println("O numero informado é par!");
            } else {
                System.out.println("O numero informado é impar!");
            }
        }        
    }
}
