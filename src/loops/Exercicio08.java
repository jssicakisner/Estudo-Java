package loops;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numeros = 0;
            int soma = 0;
            int count = 0;

            do {
               System.out.println("Insira um numero: "); 
               numeros = scan.nextInt();

               count++;
               soma += numeros;
               

            } while ( count < 5);
            
            System.out.println("A soma dos numeros é: " + soma);
            System.out.println("A media dos numeros é: " + (soma/count));
        }

    }
}
