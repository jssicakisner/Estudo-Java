package loops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> votos = new ArrayList<Double>();
        String nomeGinasta;

        do {
            votos.clear();

            System.out.println("Digite o nome do ginasta: ");
            nomeGinasta = scan.nextLine();

            if (nomeGinasta.isEmpty()) {
                break;
            }

            for (int i = 1; i <= 7; i++) {
                System.out.println("Digite o " + i + "º voto: ");
                votos.add(scan.nextDouble());
            }

            double melhorVoto = Collections.max(votos);
            double piorVoto = Collections.min(votos);

            votos.remove(melhorVoto);
            votos.remove(piorVoto);

            double mediaVotos = calcularMedia(votos);

            System.out.println("Resultado final:");
            System.out.println("Atleta: " + nomeGinasta);
            System.out.println("Media: " + String.format("%.2f", mediaVotos));
            System.out.println("Melhor nota: " + melhorVoto);
            System.out.println("Pior nota: " + piorVoto);
            System.out.println();

            scan.nextLine();
        } while (true);


        scan.close();
        
    }
    private static double calcularMedia(List<Double> votos) {
        double soma = 0.0;
        for (double voto : votos) {
            soma += voto;
        }
        return soma / votos.size();
    }
}
