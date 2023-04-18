package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe a primeira nota parcial: ");
            int nota1 = scan.nextInt();

            System.out.println("Informe a segunda nota parcial: ");
            int nota2 = scan.nextInt();

            int media = (nota1 + nota2)/2;

        if (media == 10) {
            System.out.println("Media: " + media + " - Aprovado com distinçao!");
      } else if (media < 7){
            System.out.println("Media: " + media + " - Reprovado!");
      } else if (media >= 7) {
            System.out.println("Media: " + media + " - Aprovado");
      } else {
            System.out.println("Error.");
      }
        }
    }
}
