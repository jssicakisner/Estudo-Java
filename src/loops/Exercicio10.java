package loops;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Insira um numero: "); 
            int numero1 = scan.nextInt();

            System.out.println("Insira um numero: "); 
            int numero2 = scan.nextInt();

            if (numero1 < numero2) {
                for (int i = numero1; i <= numero2; i++) {
                    System.out.println(i);
                }
            } else {
                for (int i = numero2; i <= numero1; i++) {
                    System.out.println(i);
            }
   }
        }
  }
}
