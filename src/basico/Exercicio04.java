package basico;
import java.util.Scanner;


public class Exercicio04 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Insira nota bimestral 1:");
            double nota1 = scan.nextDouble();

            System.out.println("insira nota bimestral 2:");
            double nota2 = scan.nextDouble();

            System.out.println("Insira nota bimestral 3:");
            double nota3 = scan.nextDouble();

            System.out.println("Insira nota bimestral 4:");
            double nota4 = scan.nextDouble();

            double media = (nota1 + nota2 + nota3 + nota4)/4;

            System.out.println("A media bimestral é: " + media);
        }
            
    }
}
