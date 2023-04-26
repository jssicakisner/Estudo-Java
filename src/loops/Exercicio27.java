package loops;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int quantTurmas;
            int quantAlunos;
            int soma = 0;
            boolean valido = false;

            System.out.println("Informe a quantidade de turmas");
            quantTurmas = scan.nextInt();

            for (int i = 1; i <= quantTurmas; i++) {            

                do {

                    System.out.println("Informe a quantidade de alunos na turma: " + i + ": ");
                    quantAlunos = scan.nextInt();

                    if (quantAlunos <= 40) {
                        valido = true;
                    } else {
                        System.out.println("A turma pode ter no máximo 40 alunos!");
                        //System.out.println();
                        valido = false;
                    }
                } while (!valido);
                
                System.out.println("A turma " + i + " tem " + quantAlunos + " alunos.");
                soma += quantAlunos;
            }
            double media = soma / quantTurmas;
            System.out.println("O numero medio de alunos por turma é: " + media);
        }        
    }
}
