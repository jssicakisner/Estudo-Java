package loops;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int base, expoente;        

            System.out.println("Informe o numero base: ");
            base = scan.nextInt();

            System.out.println("Informe o numero expoente: ");
            expoente = scan.nextInt();

            int resultado = base;

            for (int i = 1; i < expoente; i++) {
                resultado *= base;            
            }

            System.out.println("O resultado da base " + base + " elevado ao expoente " + expoente + " = " + resultado);
        }
    }
}
