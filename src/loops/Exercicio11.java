package loops;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Insira um numero: "); 
            int numero1 = scan.nextInt();

            System.out.println("Insira um numero: "); 
            int numero2 = scan.nextInt();

            int soma = 0;

            if (numero1 < numero2) {
                for (int i = numero1; i <= numero2; i++) {
                    soma = i + soma;
                    System.out.println(i);
                    System.out.println("A soma dos numeros do intervalo é: " + soma);
                }
            } else {
                for (int i = numero2; i <= numero1; i++) {
                    soma = i + soma;
                    System.out.println(i);
                    System.out.println("A soma dos numeros do intervalo é: " + soma);
                }
            }
        }
    }
}
