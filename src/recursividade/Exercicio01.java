package recursividade;

public class Exercicio01 {
    public static int fibonacci(int numero) {
        if (numero < 2) {
            return 1;
        }
        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(Exercicio01.fibonacci(i) + " "); 
        }
       
    }
}
