package loops;

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int totalAlunos = 0;
            //int totalAcertos = 0;
            int maiorAcerto = 0;
            int menorAcerto = 10;
            double somaNotas = 0.0;
            boolean continuar = true;

            // Pedindo para o professor digitar o gabarito da prova
            System.out.println("Digite as respostas do gabarito da prova (letras minúsculas):");
            char[] gabarito = new char[10];
            for (int i = 0; i < 10; i++) {
                System.out.print("Questao " + (i+1) + ": ");
                gabarito[i] = scan.next().charAt(0);
            }
            
            while (continuar) {
                totalAlunos++;
                int acertos = 0;

                System.out.println("Digite as respostas do aluno " + totalAlunos + " (letras minúsculas):");
                for (int i = 0; i < 10; i++) {
                    System.out.print("Questao " + (i+1) + ": ");
                    char resposta = scan.next().charAt(0);
                    if (resposta == gabarito[i]) {
                        acertos++;
                    }
                }
                if (acertos > maiorAcerto) {
                    maiorAcerto = acertos;
                }
                if (acertos < menorAcerto) {
                    menorAcerto = acertos;
                }

            // Calculando a nota do aluno e somando para a média da turma
                double nota = (double) acertos / 10.0 * 10.0;
                somaNotas += nota;
                //totalAcertos += acertos;

                System.out.print("Outro aluno vai utilizar o sistema? (S/N) ");
                char opcao = scan.next().charAt(0);
                if (opcao == 'N' || opcao == 'n') {
                    continuar = false;
                }
            }
            double media = somaNotas / (double) totalAlunos;
                   

            System.out.println("A maior nota foi: " + maiorAcerto);
            System.out.println("A menor nota foi: " + menorAcerto);
            System.out.println("O numero de alunos que responderam a prova foi: " + totalAlunos);
            System.out.println("A media das notas foi: " + media);
        }
    }
}
