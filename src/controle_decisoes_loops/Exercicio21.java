package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valorSaque;
        int notas100, notas50, notas10, notas5, notas1;

        do {
            System.out.print("Digite o valor do saque (entre 10 e 600): ");
            valorSaque = scan.nextInt();
        } while (valorSaque < 10 || valorSaque > 600);

        notas100 = valorSaque / 100;
        valorSaque = valorSaque % 100;

        notas50 = valorSaque / 50;
        valorSaque = valorSaque % 50;

        notas10 = valorSaque / 10;
        valorSaque = valorSaque % 10;

        notas5 = valorSaque / 5;
        valorSaque = valorSaque % 5;

        notas1 = valorSaque;

        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: " + notas5);
        System.out.println("Notas de 1: " + notas1);

        scan.close();
    }
}
