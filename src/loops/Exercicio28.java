package loops;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double quantCds;
            double valorCds;
            double valorTotal = 0;
            double valorMedio;
            boolean valido = false;

            System.out.println("Informe a quantidade de CDs: ");
            quantCds = scan.nextDouble();

            for (int i = 1; i <= quantCds; i++) {

                do {
                    System.out.println("Informe o valor do CD " + i + ": ");
                    valorCds = scan.nextDouble();

                    if (quantCds > 0) {
                        valido = true;
                    } else {
                        System.out.println("Informe um valor válido!");
                        valido = false;
                    }
                } while (!valido);

                valorTotal +=  valorCds;            
            }       
                valorMedio = valorTotal / quantCds;
                System.out.println("O valor medio investido por CD é de: R$" + valorMedio);
        }
    }
}
