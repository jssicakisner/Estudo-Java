package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe o tipo de carne para pedido: " +
            " 1 - File Duplo " +
            " 2 - Alcatra " +
            " 3 - Picanha ");
            int tipoDeCarne = scan.nextInt();

            System.out.println("Informe a quantidade de carne em kg: ");
            double quantiaDeCarne = scan.nextDouble();        

            double precoKg = 0;        

            if (tipoDeCarne == 1) {

                System.out.println("Voce está comprando: " + quantiaDeCarne + "kg de File Duplo.");

                if (quantiaDeCarne < 5) {
                    precoKg = 4.9;
                } else {
                    precoKg = 5.8;
                }

            } else if (tipoDeCarne == 2) {

                System.out.println("Voce está comprando: " + quantiaDeCarne + "kg de Alcatra.");

                if (quantiaDeCarne < 5) {
                    precoKg = 5.9;
                } else {
                    precoKg = 6.8;
                }
            } else if (tipoDeCarne == 3) {

                System.out.println("Voce está comprando: " + quantiaDeCarne + "kg de Picanha.");

                if (quantiaDeCarne < 5) {
                    precoKg = 6.9;
                } else {
                    precoKg = 7.8;
                }
            }

            double precoTotal = quantiaDeCarne * precoKg;
            System.out.println("Preco do pedido: " + precoTotal);
            

            System.out.println("Pagamento com cartao? (1 - SIM), (2 - NAO): ");
            int cartao = scan.nextInt();
            if (cartao == 1) {
                double precoComDesconto = (precoTotal*5)/100;
                System.out.println("Valor a pagar com desconto: " + (precoTotal - precoComDesconto) );
            } else {
                System.out.println("Preco do pedido: " + precoTotal);
            }
        }
    }
}