package loops;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numero, multiplicacao;

                System.out.println("Informe um numero de 1 a 10: ");
                numero = scan.nextInt();

                System.out.println("Tabuada de " + numero);

                for (int i = 0; i <= 10; i = i + 1) {

                    if (numero >= 1 && numero <= 10) {
                        multiplicacao = numero * i;                
                        System.out.println(numero + " x " + i + " = " + multiplicacao);
                    }

                }
        }        
    }
}
