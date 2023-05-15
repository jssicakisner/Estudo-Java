package classes_metodos;

public class Exercicio02 {
    //teste classe Conta Corrente
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(1234, 1000, true, 1000);
        conta.sacar(800.0); // saque dentro do saldo disponível
        conta.sacar(2000.0); // saque utilizando o cheque especial
        conta.sacar(1000.0); // saldo insuficiente
        conta.depositar(500.0);
        System.out.println("Saldo atual: R$" + conta.consultarSaldo());
        System.out.println("Usando cheque especial? " + conta.usarChequeEspecial());
    }
}
