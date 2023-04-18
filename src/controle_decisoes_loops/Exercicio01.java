package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe o primeiro numero: ");
            int num1 = scan.nextInt();

            System.out.println("Informe o segundo numero: ");
            int num2 = scan.nextInt();

            if(num1 > num2){
                System.out.println("O maior numero é: " + num1);
            } else {
                System.out.println("O maior numero é: " + num2);
            }
        }
    }
}
