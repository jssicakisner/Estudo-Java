package loops;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String interacao = "";
            int temperatura = 0;
            int maiorTemp = 0;
            int menorTemp = 0;
            int soma = 0;
            int count = 0;

            System.out.println("Inicio de informe de dados: ");
            System.out.println("Deseja informar uma Temperatura? (S/N): ");
            interacao = scan.next();

            while (interacao.equalsIgnoreCase("S")) {
                System.out.println("Informe uma temperatura: ");
                temperatura = scan.nextInt();

                soma = soma + temperatura;
                count += 1;

                if (count == 1) {
                    maiorTemp = menorTemp = temperatura;
                } else if (temperatura > maiorTemp){
                    maiorTemp = temperatura;
                } else if (temperatura < menorTemp) {
                    menorTemp = temperatura;
                }

                System.out.println("Deseja informar outra temperatura? (S/N): ");
                interacao = scan.next();
                }
                System.out.println("Maior temperatura: " + maiorTemp);
                System.out.println("Menor temperatura: " + menorTemp);
                System.out.println("Media das temperaturas informadas: " + (soma / count));
        }
    }

}
