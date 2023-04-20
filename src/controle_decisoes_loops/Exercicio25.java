package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Telefonou para a vítima? (S/N):");
            String pergunta1 = scan.next();

            System.out.println("Esteve no local do crime? (S/N): ");
            String pergunta2 = scan.next();

            System.out.println("Mora perto da vítima? (S/N): ");
            String pergunta3 = scan.next();

            System.out.println("Devia para a vítima? (S/N): ");
            String pergunta4 = scan.next();

            System.out.println("Já trabalhou com a vítima? (S/N): ");
            String pergunta5 = scan.next();

            int contador = 0;

            if (pergunta1.equalsIgnoreCase("S")){
                contador++;
            }
            if (pergunta2.equalsIgnoreCase("S")){
                contador++;
            }
            if (pergunta3.equalsIgnoreCase("S")){
                contador++;
            }
            if (pergunta4.equalsIgnoreCase("S")){
                contador++;
            }
            if (pergunta5.equalsIgnoreCase("S")){
                contador++;
            }
            
            switch (contador){
                case 2: 
                System.out.println("Suspeito(a)."); break;
                case 3:
                System.out.println("Cúmplice."); break;
                case 4:
                System.out.println("Cúmplice."); break;
                case 5:
                System.out.println("Assassino(a)."); break;
                default: 
                System.out.println("Inocente.");
            }
        }
    }
}
