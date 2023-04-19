package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
            try (Scanner scan = new Scanner(System.in)) {
                System.out.println("Informe um dia: ");
                int dia = scan.nextInt();

                System.out.println("Informe um mes: ");
                int mes = scan.nextInt();

                System.out.println("Informe um ano: ");
                int ano = scan.nextInt();

                if (dia <= 31 && dia > 0 && mes <= 12 && mes >= 1 && ano > 0) {
                    System.out.println("A data informada é válida: " + dia + "/" + mes + "/" + ano);
                } else {
                    System.out.println("Data informada inválida!");
                }
            }
    }
}
