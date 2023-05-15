package classes_metodos;

public class Lampada {
    private boolean ligada;

    public void ligar() {
        ligada = true;
        System.out.println("A lâmpada foi ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("A lâmpada foi desligada.");
    }

    public boolean estaLigada() {
        return ligada;
    }
}
