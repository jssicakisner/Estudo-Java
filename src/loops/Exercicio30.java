package loops;

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe o preco do pao: ");
            double precoPao = scan.nextDouble();

            System.out.println("Preco do pao: R$" + precoPao);
                System.out.println("Panificadora Pao de Ontem - Tabela de preços");

            for (int i = 0; i <= 50; i++) {
                
                System.out.println(i + " - R$" + i*precoPao);
            }
        }
    }
}
