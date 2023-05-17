package metodos_estaticos;

import java.util.Scanner;

public class Exercicio02 {
    //Teste classe Calculadora
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro numero: ");
        double numero1 = scan.nextDouble();

        System.out.println("Informe o segundo numero: ");
        double numero2 = scan.nextDouble();

        double resultadoSoma = Calculadora.calcularSoma(numero1, numero2);
        System.out.println("Resultado Soma: " + resultadoSoma);
        
        double resultadoSubtracao = Calculadora.calcularSubtracao(numero1, numero2);
        System.out.println("Resultado Subtracao: " + resultadoSubtracao);

        double resultadoMultiplicacao = Calculadora.calcularMultiplicacao(numero1, numero2);
        System.out.println("Resultado Multiplicacao: " + resultadoMultiplicacao);

        double resultadoDivisao = Calculadora.calcularDivisao(numero1, numero2);
        System.out.println("Resultado Divisao: " + resultadoDivisao);

        double resultadoPotencia = Calculadora.calcularPotencia(numero1, numero2);
        System.out.println("Resultado Potencia: " + resultadoPotencia);

        long resultadoFatorial1 = Calculadora.calcularFatorial(numero1);
        System.out.println("Resultado fatorial do primeiro numero: " + resultadoFatorial1);

        long resultadoFatorial2 = Calculadora.calcularFatorial(numero2);
        System.out.println("Resultado fatorial do segundo numero: " + resultadoFatorial2);

        scan.close();
    }
}
