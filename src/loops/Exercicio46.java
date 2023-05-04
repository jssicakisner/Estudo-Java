package loops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*A lista saltos é usada para armazenar os saltos do atleta.
 * Depois que os saltos são lidos, o melhor e o pior salto são calculados usando os métodos Collections.max e Collections.min.
 * Em seguida, os saltos máximo e mínimo são removidos da lista saltos.
 * A média dos saltos restantes é calculada com o método calcularMedia.
 * Depois que o resultado final é impresso, o buffer do scanner é limpo com o método nextLine para garantir que não haja dados não lidos.
 * Quando o programa é encerrado, o scanner é fechado com o método close.
 * O método calcularMedia é usado para calcular a média dos saltos restantes do atleta.
 */

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> saltos = new ArrayList<Double>();
        String nomeAtleta;

        do {
            saltos.clear();

            System.out.println("Nome do atleta: ");
            nomeAtleta = scan.nextLine();

            if (nomeAtleta.isEmpty()) {
                break;
            }

            for (int i = 1; i <= 5; i++) {
                System.out.println("Digite o " + i + "º salto: ");
                saltos.add(scan.nextDouble());
            }

            double melhorSalto = Collections.max(saltos);
            double piorSalto = Collections.min(saltos);

            saltos.remove(melhorSalto);
            saltos.remove(piorSalto);

            double mediaSaltos = calcularMedia(saltos);

            System.out.println("Resultado final:");
            System.out.println(nomeAtleta + ": " + String.format("%.2f", mediaSaltos) + " m");
            System.out.println();

            scan.nextLine();

        } while (true);
        
        scan.close();
    }
    private static double calcularMedia(List<Double> saltos) {
        double soma = 0.0;
        for (double salto : saltos) {
            soma += salto;
        }
        return soma / saltos.size();
    }
}
