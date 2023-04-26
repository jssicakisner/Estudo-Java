package loops;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numero;
            int count = 2;
            boolean primo = true;

            System.out.println("Informe um numero inteiro: ");
            numero = scan.nextInt();

            while (count < numero) {
                if (numero % count == 0) {
                    primo = false;
                    break;                
                } 

                count += 1;

                }

                if (primo) {
                    System.out.println("O numero " + numero + " é primo!");
                    
                } else {
                    System.out.println("O numero " + numero + " nao é primo!");
            }
        }
        
    }
}
