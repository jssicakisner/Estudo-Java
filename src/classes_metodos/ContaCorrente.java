package classes_metodos;

public class ContaCorrente {
    private int numero;
    private double saldo;
    private boolean especial;
    private double limite;

    public ContaCorrente(int numero, double saldo, boolean especial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else if (especial && valor <= (saldo + limite)) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso utilizando o cheque especial.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }
    public double consultarSaldo() {
        return saldo;
    }
    public boolean usarChequeEspecial() {
        return especial && saldo < 0;
    }
}
