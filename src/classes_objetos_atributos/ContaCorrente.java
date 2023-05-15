package classes_objetos_atributos;

public class ContaCorrente {
    private String numero;
    private double saldo;
    private boolean especial;
    private double limite;

    public ContaCorrente(String numero, double saldo, boolean especial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }

    // Métodos getters e setters

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
