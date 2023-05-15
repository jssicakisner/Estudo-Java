package metodos_estaticos;

public class Contador {
    private static int contador = 0;

    public Contador() {
        contador++;
    }
    public static void zerarContador() {
        contador = 0;
    }
    public static void incrementarContador() {
        contador++;
    }
    public static int obterValorContador() {
        return contador;
    }
}
