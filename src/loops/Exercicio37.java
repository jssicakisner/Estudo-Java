package loops;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            double maiorPeso = Double.MIN_VALUE;
            double menorPeso = Double.MAX_VALUE;
            double maiorAltura = Double.MIN_VALUE;
            double menorAltura = Double.MAX_VALUE;
            double somaPesos, somaAlturas;
            somaPesos = somaAlturas = 0;
            
            int codigoMenorAltura, codigoMaiorAltura, codigoMenorPeso, codigoMaiorPeso, count;
            codigoMenorAltura = codigoMaiorAltura = codigoMenorPeso = codigoMaiorPeso = count = 0;
            

            while (true) {
                System.out.println("Informe o código do cliente: ");
                int codigo = scan.nextInt();
                if (codigo == 0) {
                    break;
                }

                System.out.println("Informe um peso em kg: ");
                double peso = scan.nextDouble();

                System.out.println("Informe a altura em cm: ");
                double altura = scan.nextDouble();

                somaPesos = somaPesos + peso;
                somaAlturas = somaAlturas + altura;
                count += 1;

                if (peso > maiorPeso) {
                    codigoMaiorPeso = codigo;
                    maiorPeso = peso;
                }
                if (peso < menorPeso){
                    codigoMenorPeso = codigo;
                    menorPeso = peso;
                }
                if (altura > maiorAltura) {
                    codigoMaiorAltura = codigo;
                    maiorAltura = altura;
                }
                if (altura < menorAltura) {
                    codigoMenorAltura = codigo;
                    menorAltura = altura;
                }

            }
            System.out.println("A pessoa mais alta possui: " + maiorAltura + "cm e seu codigo é: " + codigoMaiorAltura);
            System.out.println("A pessoa mais baixa possui: " + menorAltura + "cm e seu codigo é: " + codigoMenorAltura);
            System.out.println("A pessoa com maior peso possui: " + maiorPeso + "kg e seu codigo é: " + codigoMaiorPeso);
            System.out.println("A pessoa com menor peso possui: " + menorPeso + "kg e seu codigo é: " + codigoMenorPeso);
            System.out.println("A media das alturas é: " + (somaAlturas / count));
            System.out.println("A media dos pesos é: " + (somaPesos / count));
        }

    }
}
