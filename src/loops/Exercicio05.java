package loops;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int count = 0;        
            double populacaoA;
            double populacaoB;
            double taxaCrescimentoA;
            double taxaCrescimentoB;

            boolean valido = false;
            do {
                System.out.println("Informe a populacao da cidade A: ");
                populacaoA = scan.nextDouble();

                if (populacaoA > 0) {
                    valido = true;
                } else {
                    System.out.println("Informe um valor valido para populacao!");
                }            

            } while (!valido);

            valido = false;
            do {
                System.out.println("Informe a populacao da cidade B: ");
                populacaoB = scan.nextDouble();

                if (populacaoB > 0) {
                    valido = true;
                } else {
                    System.out.println("Informe um valor valido para populacao!");
                }
            } while (!valido);

            valido = false;
            do {
                System.out.println("Informe a taxa de crescimento da cidade A: ");
                taxaCrescimentoA = scan.nextDouble();

                if (taxaCrescimentoA >= 0 && taxaCrescimentoA <= 100) {
                    valido = true;
                } else {
                    System.out.println("Informe uma taxa de crescimento valida!");
                }
            } while (!valido);

            valido = false;
            do {
                System.out.println("Informe a taxa de crescimento da cidade B: ");
                taxaCrescimentoB = scan.nextDouble();
                if (taxaCrescimentoB >= 0 && taxaCrescimentoB <= 100) {
                    valido = true;
                } else {
                    System.out.println("Informe uma taxa de crescimento valida!");
                }
            } while (!valido);

      
            while (populacaoA < populacaoB) {
                populacaoA += ((populacaoA*taxaCrescimentoA)/100);
                populacaoB += ((populacaoB*taxaCrescimentoB)/100);
                count++;
            }


            System.out.println("Populacao A: " + populacaoA);
            System.out.println("Populacao B: " + populacaoB);
            System.out.println("O numero de anos: " + count);
        }
    }
}
