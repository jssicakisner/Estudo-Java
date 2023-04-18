package basico;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe a area a ser pintada em metros quadrados: ");
            double area = scan.nextDouble();

            double litrosDeTinta = area/6;
            double latasDeTinta = Math.ceil(litrosDeTinta/18);
            double galoesDeTinta = Math.ceil(litrosDeTinta/3.6);
            double precoLatas = latasDeTinta * 80;
            double precoGaloes = galoesDeTinta * 25;
            double litrosMistura = (area * 1.1 / 6);
            
            System.out.println("Comprando apenas latas de 18 litros: " + latasDeTinta + " unidades.");
            System.out.println("Preco: " + precoLatas);

            if(galoesDeTinta % 3.6 != 0){
                galoesDeTinta += 1;
            }
            System.out.println("Comprando apenas galoes de 3.6 litros: " + galoesDeTinta + " unidades.");
            System.out.println("Preço: " + precoGaloes);

            double misturaLata = Math.floor(litrosMistura / 18);
            double misturaGaloes = Math.ceil(((litrosMistura % 18) / 3.6));

            if(litrosDeTinta - (misturaLata * 18) % 3.6 != 0){
                misturaGaloes += 1;
            }

            System.out.println("Comprando mistura de galoes e latas serao necessárias: " + misturaLata + " latas, e " + misturaGaloes + " galoes de tinta.");
            System.out.println("Preço: " + ((misturaLata * 80) + (misturaGaloes * 25)));
        }
        
    }
}
