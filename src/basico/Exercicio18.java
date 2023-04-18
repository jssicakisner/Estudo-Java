package basico;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Insira o tamanho do arquivo: ");
            double arquivo = scan.nextDouble();

            System.out.println("Insira a velocidade do link: ");
            double velocidade = scan.nextDouble();

            double tempo = (arquivo/velocidade);

            System.out.println("O tempo aproximado de download será: " + tempo + " segundos");
        }
    }
}
