package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe o primeiro lado do triangulo: ");
            double lado1 = scan.nextDouble();

            System.out.println("Informe o segundo lado do triangulo: ");
            double lado2 = scan.nextDouble();

            System.out.println("Informe o terceiro lado do triangulo: ");
            double lado3 = scan.nextDouble();

            if ((lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado2 + lado3) > lado1) {
                System.out.println("Os valores informados formam um triagulo!");
            }  
            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("É um triangulo equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triangulo isósceles");
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("É um triangulo escaleno");
            }
        }

    }
}
