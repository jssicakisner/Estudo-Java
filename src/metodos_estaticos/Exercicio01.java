package metodos_estaticos;

public class Exercicio01 {
    //Teste Classe Contador
    public static void main(String[] args) {
        Contador c1 = new Contador();
        System.out.println("Valor do contador: " + Contador.obterValorContador());

        Contador c2 = new Contador();
        Contador.incrementarContador();
        System.out.println("Valor do contador: " + Contador.obterValorContador());

        Contador.zerarContador();
        System.out.println("Valor do contador: " + Contador.obterValorContador());
    }
}
