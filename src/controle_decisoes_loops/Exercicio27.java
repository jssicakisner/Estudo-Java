package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe a quantidade desejada de maças(kg): ");
            double macasKg = scan.nextDouble();

            System.out.println("Informe a quantidade de morangos(kg): ");
            double morangosKg = scan.nextDouble();

            double precoTotal1 = (morangosKg * 2.5) + (macasKg * 1.8);
            double precoTotal2 = (morangosKg * 2.2) + (macasKg * 1.5);
            
            double descontoAlem8 = ((precoTotal2*10)/100);

            double totalKg = macasKg + morangosKg;

            if (totalKg <= 5) {
                System.out.println("Valor a pagar: R$" + precoTotal1);
            } else if (totalKg > 5 && totalKg < 8) {
                System.out.println("Valor a pagar: R$" + precoTotal2);
            } else if (totalKg > 8 || precoTotal2 > 25){
                System.out.println("Valor a pagar: R$" + (precoTotal2 - descontoAlem8));
            }
        }
    }
}
