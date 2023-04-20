package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {

        int cem = 0, cinquenta = 0, dez = 0, cinco = 0, um = 0;
        int valor;
        int saque;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o valor a ser sacado: ");
        valor = Integer.parseInt(scan.nextLine());
        saque = valor;

        if (valor < 10) {
            System.out.println("O valor mínimo para saque é de R$10,00.");
        } else if (valor > 600) {
            System.out.println("O valor máximo para saque é de R$600,00.");
        } else {
            if (saque >= 100) {
                cem = valor / 100;
                saque = valor % 100;
            }
            if (saque >= 50) {
                cinquenta = saque / 50;
                saque = saque % 50;
            }
            if (saque >=10) {
                dez = saque / 10;
                saque = saque % 10;
            }
            if (saque >= 5) {
                cinco = saque / 5;
                saque = saque % 5;
            }
            if (saque >= 1) {
                um = saque / 1;
            }
                System.out.println("Serao fornecidas: ");
                System.out.printf("%d notas de 100\n", cem);
                System.out.printf("%d notas de 50\n", cinquenta);
                System.out.printf("%d notas de 10\n", dez);
                System.out.printf("%d notas de 5\n", cinco);
                System.out.printf("%d notas de 1\n", um);  
        }
    }
}
