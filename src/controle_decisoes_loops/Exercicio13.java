package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe um numero: ");
            int numeroDia = scan.nextInt();

            switch(numeroDia) {
                case 1:
                System.out.println("1 - Domingo."); 
                break;
                case 2:
                System.out.println("2 - Segunda-feira."); 
                break; 
                case 3:
                System.out.println("3 - Terça-feira.");
                break;
                case 4:
                System.out.println("4 - Quarta-feira");
                break;
                case 5:
                System.out.println("5 - Quinta-feira.");
                break;
                case 6:
                System.out.println("6 - Sexta-feira.");
                break;
                case 7:
                System.out.println("7 - Sábado.");
                break;
                default:
                System.out.println("Valor inválido!");
            }
        }

    }
}
