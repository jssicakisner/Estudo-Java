package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe o primeiro preço: ");
            float preco1 = scan.nextFloat();

            System.out.println("Informe o segundo preço: ");
            float preco2 = scan.nextFloat();

            System.out.println("Informe o terceiro preço: ");
            float preco3 = scan.nextFloat();

            if (preco1 < preco2 && preco1 < preco3){
                System.out.println("Compre o produto com o valor de: " + preco1);
            } else if (preco2 < preco1 && preco2 < preco3) {
                System.out.println("Compre o produto com o valor de: " + preco2);
            } else if (preco3 < preco1 && preco3 < preco2) {
                System.out.println("Compre o produto com o valor de: " + preco3);
            }
        }
    }
}
