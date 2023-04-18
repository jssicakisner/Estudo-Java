import java.util.Scanner;

public class Exercicio02 {
 
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe um numero inteiro: ");
            int numero = scan.nextInt();
            
            System.out.println("O numero informado foi: " + numero);
        }
        }
    }
