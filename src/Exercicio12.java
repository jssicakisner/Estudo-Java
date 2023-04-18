import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Insira o valor da altura em metros: ");
            float altura = scan.nextFloat();

            float pesoIdeal = (float) ((72.7*altura) - 58);

            System.out.println("O peso ideal: " + pesoIdeal);

        }
    }
}
