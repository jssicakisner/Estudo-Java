import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Insira o valor do raio: ");
            double raio = scan.nextDouble();

            double area = Math.PI * Math.pow(raio, 2);

            System.out.println("A area do circulo é: " + area);
        }
    }
}
