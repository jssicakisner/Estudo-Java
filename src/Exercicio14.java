import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe o peso de peixes em quilogramas: ");
            float peso = scan.nextFloat();

            float excesso = 0, multa = 0;

            if (peso > 50){
                excesso = peso - 50;
                multa = excesso * 4;
                System.out.println("Peso acima do regulamento.");
                System.out.println("Peso excedido: " + excesso + "kg.");
                System.out.println("Multa a pagar: R$" + multa);
            } else {
                System.out.println("Peso dentro do regulamento.");
                System.out.println("Peso excedido: " + excesso + "kg.");
                System.out.println("Multa a pagar: R$" + multa);
            }
        }
    }
}
