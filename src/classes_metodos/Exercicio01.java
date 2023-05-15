package classes_metodos;

public class Exercicio01 {
    //Teste classe Lampada
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.ligar(); // liga a lâmpada
        System.out.println("A lâmpada está ligada? " + lampada.estaLigada());
        lampada.desligar(); // desliga a lâmpada
        System.out.println("A lâmpada está ligada? " + lampada.estaLigada());
    }
}
