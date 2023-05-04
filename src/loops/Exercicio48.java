package loops;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero inteiro positivo: ");
        int numero = scan.nextInt();

        int numeroInvertido = 0;

        while (numero > 0) {
            numeroInvertido = numeroInvertido * 10 + (numero % 10);
            numero = numero /= 10;
        }
        System.out.println("O numero invertido é: " + numeroInvertido);
        scan.close();
    }
}
