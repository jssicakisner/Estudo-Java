package classes_objetos_atributos;

public class Lampada {
    String modelo;
    String tensao;
    String cor;
    int potencia;

    public Lampada(String modelo, String tensao, String cor, int potencia) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.cor = cor;
        this.potencia = potencia;        
    }
    public String getModelo() {
        return modelo;
    }
    public String getTensao() {
        return tensao;
    }
    public String getCor() {
        return cor;
    }
    public int getPotencia() {
        return potencia;
    }
    public static void main(String[] args) {
        Lampada lampada = new Lampada("Lampada LED", "220V", "Vermelha", 220);
        System.out.println("Modelo: " + lampada.getModelo());
        System.out.println("Tensao: " + lampada.getTensao());
        System.out.println("Cor: " + lampada.getCor());
        System.out.println("Potencia: " + lampada.getPotencia());
    }
}
