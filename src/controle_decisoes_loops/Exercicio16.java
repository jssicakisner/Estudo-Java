package controle_decisoes_loops;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Informe o valor de 'a' para calcular a raiz da equaçao: ");
            int a = scan.nextInt();

            if (a == 0){
                System.out.println("O valor informado nao calcula uma equacao de segundo grau!");
            } else {
                
                System.out.println("Informe o valor de 'b' para calcular a raiz da equaçao");
                int b = scan.nextInt();

                System.out.println("Informe o valor de 'c' para calcular a raiz da equaçao");
                int c = scan.nextInt();

                double delta = ((Math.pow(b, 2)) - 4*a*c);

                if (delta < 0){
                    System.out.println("A equaçao nao possui raízes reais!");
                } else if (delta == 0) {

                double raiz1 = ((- b) + (Math.sqrt(delta)))/(2*a);                                                                                      
                System.out.println("A equacao possui apenas uma raiz real: " + raiz1);
                                        
                } else if (delta > 0) {
                double raiz1 = ((- b) + (Math.sqrt(delta)))/(2*a);
                double raiz2 = ((- b) - (Math.sqrt(delta)))/(2*a);
                System.out.println("A equaçao possui duas raizes reais: " + raiz1 + " e " + raiz2);
            }
        } 
    } 
  } 
}
