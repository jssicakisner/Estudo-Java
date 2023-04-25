package loops;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {            

            boolean notaValida = false;

            do {
                System.out.println("Informe uma nota: ");
                double nota = scan.nextDouble();

                if (nota <= 10 && nota >= 0) {
                notaValida = true;
                System.out.println("A nota é: " + nota);
                }
                else {
                System.out.println("A nota informada nao é valida!");
                }
            } while (!notaValida);
        }
    }
}
