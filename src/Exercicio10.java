import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Insira a temperatura em Celsius: ");
            double temperaturaC = scan.nextDouble();

            double temperaturaF = (temperaturaC * 9/5) + 32;

            System.out.println("A temperatura em Farenheit é: " + temperaturaF);
        }
    }
}
