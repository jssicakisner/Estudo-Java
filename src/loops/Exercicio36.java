package loops;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int numero, multiplicacao, comeco, fim;

            System.out.println("Informe um numero para calcular a tabuada: ");
            numero = scan.nextInt();

            System.out.println("Informe um numero para inicio do cálculo da tabuada: ");
            comeco = scan.nextInt();

            System.out.println("Informe um numero para terminar o cálculo da tabuada: ");
            fim = scan.nextInt();

            System.out.println("Tabuada de " + numero);
            System.out.println("Comecar por " + comeco);
            System.out.println("Terminar por " + fim);
            System.out.println("Vou montar a tabuada de " + numero + " comecando em " + comeco + " e terminando em " + fim);

            while (fim > comeco) {
                for (int i = comeco; i <= fim; i = i + 1) {

                if (numero >= 0) {
                    multiplicacao = numero * i;                      
                    System.out.println(numero + " x " + i + " = " + multiplicacao);
                } 
            } break;
            }        

        if (comeco > fim) {
            System.out.println("O numero final precisa ser maior que o inicial!");
        }
      } 
    }
}
