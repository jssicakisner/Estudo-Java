package loops;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numero;
            int fatorial = 1;

            System.out.println("Informe um numero inteiro para obter o fatorial: ");
            numero = scan.nextInt();

            System.out.println("Fatorial de: " + numero);
            System.out.println(numero + "! =");
            //5 . 4 . 3 . 2 . 1 = 120*/

                for (int i = 0; i < numero; i++) {
                    if (numero - i > 1) {
                        System.out.println(numero - i + " . ");
                    }
                 fatorial *= numero - i;
             }
             System.out.println("1 = " + fatorial);
        }
    }
}
