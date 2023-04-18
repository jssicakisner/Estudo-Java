import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Insira o valor em metros: ");
            double metros = scan.nextDouble();

            double centimetros = metros * 100;

            System.out.println("O valor em centímetros é: " + centimetros);
        }
    }
    
}
