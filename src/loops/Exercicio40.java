package loops;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numeroVeiculos, numeroAcidentes, maiorIndiceAcidente = 1, menorIndiceAcidente = 9999, media = 0,
            mediaMenor2000 = 0, codigoMaiorIndice = 1, codigoMenorIndice = 1, count = 0, countMenorCidade = 0;

            int[] cidades = new int[5];

            for (int i = 0; i < cidades.length; i++) {
                System.out.println("Informe o código da cidade: ");
                cidades[i] = scan.nextInt();

                System.out.println("Informe o numero de veiculos na cidade: ");
                numeroVeiculos = scan.nextInt();

                System.out.println("Informe o numero de acidente de transito: ");
                numeroAcidentes = scan.nextInt();

                if (numeroAcidentes > maiorIndiceAcidente) {
                    codigoMaiorIndice = cidades[i];
                    maiorIndiceAcidente = numeroAcidentes;
                }
                if (numeroAcidentes < menorIndiceAcidente) {
                    codigoMenorIndice = cidades[i];
                    menorIndiceAcidente = numeroAcidentes;
                }

                if (numeroVeiculos <= 2000) {
                    countMenorCidade++; 
                    mediaMenor2000 += maiorIndiceAcidente;                                        
                }
                media += numeroVeiculos;
                count++;

                System.out.println("Código da cidade: " + cidades[i]);
                System.out.println("Numero de veiculos da cidade: " + numeroVeiculos);
                System.out.println("Numero de acidentes de veiculos na cidade: " + numeroAcidentes + "\n");            

            }
        

        System.out.println("\n-------------//-----------\nO maior índice de acidentes de transito é da cidade: " + codigoMaiorIndice + " com " + maiorIndiceAcidente + " acidentes.");
        System.out.println("O menor índice de acidentes de transito é da cidade: " + codigoMenorIndice + " com " + menorIndiceAcidente + " acidentes.");
        System.out.println("A media de numero de veiculos nas cidades informadas: " + (media / count));
        System.out.println("A media de acidentes de transito nas cidades com menos de 2000 veiculos é: " + (mediaMenor2000 / countMenorCidade)); 
    }
  }
}
