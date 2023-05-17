package recursividade;

public class Exemplo {

    public int fatorial(int num) {
        if (num == 0) { //Ponto de Parada para nao ocorrer loop infinito
            return 1;
        }
        return num * fatorial(num - 1); //Recursividade (Metodo chamando ele mesmo)
    }
}
