package loops;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int maximo = 0;

            //O contador seta o numero de numeros scaneados e atualiza para o maior, verificando se o 'if' é verdadeiro.
            for (int count = 0; count < 5; count++) {
                System.out.println("Insira um numero: ");
                int numero = scan.nextInt();
                if (numero > maximo) {
                    maximo = numero;
                }
            }
            System.out.println("O maior numero é: " + maximo);
        }
    }
}
