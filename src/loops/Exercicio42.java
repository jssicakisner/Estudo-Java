package loops;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numero;
            int range1, range2, range3, range4;
            range1 = range2 = range3 = range4 = 0;

            while (true) {
                System.out.println("Informe um numero: ");
                numero = scan.nextInt();
                if (numero < 0) {
                    break;
                }

                if (numero >= 0 && numero <= 25) {
                    range1 += 1;
                }
                if (numero > 25 && numero <= 50) {
                    range2 += 1;
                }
                if (numero > 50 && numero <= 75) {
                    range3 += 1;
                }
                if (numero > 75 && numero <= 100) {
                    range4 += 1;
                }
                
            }
                System.out.println("A quantidade de numeros entre 0 e 25 é: " + range1);
        
            System.out.println("A quantidade de numeros entre 26 e 50 é: " + range2);
            System.out.println("A quantidade de numeros entre 51 e 75 é: " + range3);
            System.out.println("A quantidade de numeros entre 76 e 100 é: " + range4);
    }  
  }
}
