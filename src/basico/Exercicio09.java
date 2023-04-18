package basico;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Insira a temperatura em graus Farenheit: ");
            double temperaturaF = scan.nextDouble();

            double temperaturaC = (5 * (temperaturaF-32) / 9);

            System.out.println("A temperatura em Celsius é: " + temperaturaC);
        }
    }
}
