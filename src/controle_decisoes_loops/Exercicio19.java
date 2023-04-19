package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Informe um numero inteiro: ");
            int numeroInformado = scan.nextInt();

            int centena = (numeroInformado / 100) % 10;
            int dezena = (numeroInformado / 10) % 10;
            int unidade = numeroInformado % 10;

            String unidadeEPlural = unidade == 1 
      || unidade == 0 ? "unidade" : "unidades";

      String dezenaEPlural = dezena == 1 
      || dezena == 0 ? "dezena" : "dezenas";

      String centenaEPlural = centena == 1 
      || centena == 0 ? "centena" : "centenas";

      if(centena == 0) {
        if(dezena == 0) {
          System.out.println(
            unidade + " " + unidadeEPlural
          );
        } else {
            System.out.println(
              dezena + " " + dezenaEPlural + ", " + 
              unidade + " " + unidadeEPlural
            );
          }
      }
      else {
        System.out.println(
          centena + " " + centenaEPlural + ", " +  
          dezena + " " + dezenaEPlural + ", " +  
          unidade + " " + unidadeEPlural
        );
      } 
    }
  }
        
}
