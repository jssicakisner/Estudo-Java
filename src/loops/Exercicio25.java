package loops;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int idade;
            int soma = 0;
            int media;
            String interacao = "";
            int count = 1;

            System.out.println("Deseja informar uma idade para calculo da media? (S/N): ");
            interacao = scan.next();

            while (interacao.equalsIgnoreCase("S")){
                System.out.println("Informe uma idade: ");
                idade = scan.nextInt();

                soma += idade;

                System.out.println("Numero de idades informadas: " + count);

                media = soma / count;

                if (media <= 25) {
                    System.out.println("A media das idades informadas é: " + media + ". O grupo é JOVEM.");
                } else if (media > 25 && media <= 60) {
                    System.out.println("A media das idades informadas é: " + media + ". O grupo é ADULTO.");
                } else if (media > 60) {
                    System.out.println("A media das idades informadas é: " + media + ". O grupo é IDOSO.");
                }
                count++;

                System.out.println("Deseja informar outra idade para calculo da media do grupo? (S/N): ");
                interacao = scan.next();
            }
        }
    }
}
