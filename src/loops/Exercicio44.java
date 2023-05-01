package loops;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int votos;
            int somaVotos1, somaVotos2, somaVotos3, somaVotosNulo, somaVotosBranco;
            somaVotos1 = somaVotos2 = somaVotos3 = somaVotosNulo = somaVotosBranco = 0;
            int total = somaVotos1 + somaVotos2 + somaVotos3 + somaVotosBranco + somaVotosNulo;

            do {
               System.out.println("Informe seu voto: " +
                                    " 1 - Jose" + 
                                    " 2 - Joao" +
                                    " 3 - Maria" +
                                    " 4 - Branco" +
                                    " 5 - Nulo");
                votos = scan.nextInt();
                if (votos == 1) {
                    somaVotos1++;
                    total++;
                } else if (votos == 2) {
                    somaVotos2++;
                    total++;
                } else if (votos == 3){
                    somaVotos3++;
                    total++;
                } else if (votos == 4){
                    somaVotosBranco++;
                    total++;
                } else if (votos == 5){
                    somaVotosNulo++;
                    total++;
                } else {
                    System.out.println("Voto Invalido!");
                } 
            } while (votos >= 1 && votos <= 5);
                

                System.out.println("Numero de votos Candidato 1: " + somaVotos1);
                System.out.println("Numero de votos Candidato 2: " + somaVotos2);
                System.out.println("Numero de votos Candidato 3: " + somaVotos3);
                System.out.println("Numero de votos Nulos: " + somaVotosNulo + ". Porcentagem: " + ((somaVotosNulo*100)/total));
                System.out.println("Numero de votos em branco: " + somaVotosBranco + ". Porcentagem: " + ((somaVotosBranco*100)/total));
        }
    
  } 
}
