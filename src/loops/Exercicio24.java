package loops;

import java.util.Scanner;


public class Exercicio24 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double nota;
            double soma = 0;
            String interacao = "";
            int count = 1;

            System.out.println("Deseja informar uma nota para calculo da media? (S/N): ");
            interacao = scan.next();

            while (interacao.equalsIgnoreCase("S")) {                
                System.out.println("Informe uma nota: ");
                nota = scan.nextDouble();
                soma += nota;

                System.out.println("Numero de notas informadas: " + count);

                System.out.println("A media das notas informadas é: " + (soma/count));
                count++;

                System.out.println("Deseja informar outra nota para calculo da media? (S/N): ");
                interacao = scan.next();
            }
        }        
    }
}
