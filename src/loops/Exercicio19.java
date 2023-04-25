package loops;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String interacao = "";
            int numero = 0;
            int maiorNum = 0;
            int menorNum = 0;
            int soma = 0;
            int count = 0;

            System.out.println("Inicio de informe de dados numericos: ");
            System.out.println("Deseja informar numero? (S/N): ");
            interacao = scan.next();

            while (interacao.equalsIgnoreCase("S")){
                System.out.println("Informe um numero inteiro: ");
                numero = scan.nextInt();

                if (numero >= 0 && numero <= 1000) {
                    soma = soma + numero;
                    count += 1;

                if (count == 1) {
                    maiorNum = menorNum = numero;
                } else if (numero > maiorNum){
                    maiorNum = numero;
                } else if (numero < menorNum) {
                    menorNum = numero;
                }
            System.out.println("Deseja informar mais um numero? (S/N): ");
            interacao = scan.next();
                } else {
                    System.out.println("informe um valor entre 0 e 1000.");
                }
                 
            }
            System.out.println("Maior numero: " + maiorNum);
            System.out.println("Menor numero: " + menorNum);
            System.out.println("Soma dos numero informados: " + soma);
        }
        
    }
}
