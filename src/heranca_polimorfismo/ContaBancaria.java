package heranca_polimorfismo;

public class ContaBancaria {
    String nomeCliente;
    int numConta;
    double saldo;

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito realizado com sucesso. Novo saldo: " + saldo);
    }
    public void mostrarDados() {
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Saldo atual: " + saldo);
    }
}

class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta, double saldo, int diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }
    public void calcularNovoSaldo(double taxaRendimento) {
        saldo += saldo * taxaRendimento;
        System.out.println("Saldo apos aplicacao de rendimento: " + saldo);
    }
}
class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

class Teste {
    public static void main(String[] args) {
        // Criar contas
        ContaPoupanca contaPoupanca = new ContaPoupanca("Joao", 1234, 1000.0, 5);
        ContaEspecial contaEspecial = new ContaEspecial("Maria", 5678, 2000.0, 500.0);

        // Sacar um valor das contas
        contaPoupanca.sacar(500.0);
        contaEspecial.sacar(2500.0);

        // Depositar
        contaPoupanca.depositar(200.0);
        contaEspecial.depositar(1000.0);

        // Mostrar novo saldo a partir de um rendimento
        contaPoupanca.calcularNovoSaldo(0.05);

        // Mostrar dados da conta do cliente
        contaPoupanca.mostrarDados();
        contaEspecial.mostrarDados();
    }
}