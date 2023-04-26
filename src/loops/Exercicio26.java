package loops;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numeroEleitores;
            int votos;
            int somaVotos1 = 0;
            int somaVotos2 = 0;
            int somaVotos3 = 0;
            int total = somaVotos1 + somaVotos2 + somaVotos3;

            System.out.println("Informe o numero de eleitores: ");
            numeroEleitores = scan.nextInt();        
            
      
            do {
                System.out.println("Informe o voto: " +
                                  " - Candidato 1 (1)" +
                                  " - Canditado 2 (2)" +
                                  " - Candidato 3 (3)");
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
                } else {
                    System.out.println("Canditado Invalido!");
                }           

                } while (total <= numeroEleitores - 1);

                System.out.println("Numero de votos Candidato 1: " + somaVotos1);
                System.out.println("Numero de votos Candidato 2: " + somaVotos2);
                System.out.println("Numero de votos Candidato 3: " + somaVotos3);
        }        
    } 
        
}
