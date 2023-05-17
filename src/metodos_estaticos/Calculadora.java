package metodos_estaticos;

public class Calculadora {

    public static double calcularSoma(double numero1, double numero2) {
        return numero1 + numero2;
    }
    public static double calcularSubtracao(double numero1, double numero2) {
        return numero1 - numero2;
    }
    public static double calcularMultiplicacao(double numero1, double numero2) {
        return numero1 * numero2;
    }
    public static double calcularDivisao(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return numero1 / numero2;
    }
    public static double calcularPotencia(double numero1, double numero2) {
        if (numero2 < 0) {
            throw new IllegalArgumentException("O expoente deve ser um valor não negativo.");
        }
        return (double) Math.pow(numero1, numero2);
    }

    public static long calcularFatorial(double numero){
        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        if (numero == 0 || numero == 1) {
            return 1;
        }
        long fatorial = 1;
        for (double i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
