package basico;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Insira o tamanho do lado do quadrado:");
            double lado = scan.nextDouble();

            double area = (lado*lado);
            double dobroArea = area*2;

            System.out.println("O dobro da area do quadrado é: " + dobroArea);
        }
    }
}
