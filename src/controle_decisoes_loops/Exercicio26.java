package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe o combustível preferido (A-álcool, G-gasolina): ");
            String combustivel = scan.next();

            System.out.println("Informe a quantidade em litros: ");
            int quantidade = scan.nextInt();
            double precoA = 1.9 * quantidade;      
            double precoG = 2.5 * quantidade;

            if ((combustivel.equalsIgnoreCase("A")) && quantidade <= 20) {                        
                double descontoA1 = ((precoA*3)/100);
                double valorA1 = precoA - descontoA1;
                System.out.println("O valor a ser cobrado é: " + valorA1);

            } else if ((combustivel.equalsIgnoreCase("A")) && quantidade > 20) {
                double descontoA2 = ((precoA*5)/100);
                double valorA2 = precoA - descontoA2;
                System.out.println("O valor a ser cobrado é: " + valorA2);
            }
            if ((combustivel.equalsIgnoreCase("G")) && quantidade <= 20) {
                double descontoG1 = ((precoG*4)/100);
                double valorG1 = precoG - descontoG1;
                System.out.println("O valor a ser cobrado é: " + valorG1);
            } else if ((combustivel.equalsIgnoreCase("G")) && quantidade > 20) {
                double descontoG2 = ((precoG*6)/100);
                double valorG2 = precoG - descontoG2;
                System.out.println("O valor a ser cobrado é: " + valorG2);
            }
        }

    }
}
