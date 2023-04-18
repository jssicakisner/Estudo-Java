import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Informe a area a ser pintada em metros quadrados: ");
            float area = scan.nextFloat();

            float litrosDeTinta = (float) area/3;
            int latasDeTinta = (int) (litrosDeTinta/18);

            float precoLatas = latasDeTinta * 80;

            System.out.println("A quantidade de latas de tinta a ser comprada: " + latasDeTinta);
            System.out.println("O preço total: " + precoLatas);
        }
    }
}
