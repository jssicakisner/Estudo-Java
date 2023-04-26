package loops;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe um numero inteiro: ");
            int N = scan.nextInt();

            System.out.println("Os numeros primos no intervalo entre 1 e " + N + " sao:");

            int primo = 0;

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        primo++;
                    }
                }
             if (primo == 2) {            
                System.out.println(i);   
            }
            primo = 0;            
            }
        }
    }
}
