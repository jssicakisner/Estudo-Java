import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)){
            System.out.println("Insira o primeiro numero inteiro: ");
            int numero1 = scan.nextInt();

            System.out.println("Insira o segundo numero inteiro: ");
            int numero2 = scan.nextInt();

            System.out.println("Insira um numero real: ");
            double numero3 = scan.nextDouble();

            int calculoA = numero1*2 * numero2/2;
            double calculoB = (numero1 * 3) + numero2;
            double calculoC = Math.pow(numero3, 3);

            System.out.println("O produto do dobro do primeiro com metade do segundo: " + calculoA);
            System.out.println("A soma do triplo do primeiro com o segundo: " + calculoB);
            System.out.println("O terceiro elevado ao cubo: " + calculoC);
        }
    }
}
