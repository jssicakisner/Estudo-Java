package heranca_polimorfismo;


abstract class Contribuinte {

    protected String nome;
    protected double rendaBruta;

    public Contribuinte(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }
    public abstract double calcularImposto();
}

class PessoaJuridica extends Contribuinte {
    public PessoaJuridica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }
    @Override
    public double calcularImposto() {
        return rendaBruta * 0.1; // 10% de imposto para Pessoa Jurídica
    }
}

class PessoaFisica extends Contribuinte {
    public PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }
    @Override
    public double calcularImposto() {
        if (rendaBruta <= 1400) {
            return 0;
        } else if (rendaBruta <= 2100) {
            return rendaBruta * 0.1 - 100;
        } else if (rendaBruta <= 2800) {
            return rendaBruta * 0.15 - 270;
        } else if (rendaBruta <= 3600) {
            return rendaBruta * 0.25 - 500;
        } else {
            return rendaBruta * 0.3 - 700;
        }
    }
}

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Contribuinte[] contribuintes = new Contribuinte[6];

        // Criando os 3 contribuintes Pessoa Jurídica
        contribuintes[0] = new PessoaJuridica("Empresa A", 50000);
        contribuintes[1] = new PessoaJuridica("Empresa B", 100000);
        contribuintes[2] = new PessoaJuridica("Empresa C", 150000);

        // Criando os 3 contribuintes Pessoa Física
        contribuintes[3] = new PessoaFisica("Joao", 1200);
        contribuintes[4] = new PessoaFisica("Maria", 2200);
        contribuintes[5] = new PessoaFisica("Pedro", 3000);

        // Calculando e imprimindo o imposto a ser pago por cada contribuinte
        for (int i = 0; i < contribuintes.length; i++) {
            Contribuinte contribuinte = contribuintes[i];
            double imposto = contribuinte.calcularImposto();

            System.out.println("Contribuinte: " + contribuinte.nome);
            System.out.println("IR: R$" + imposto);
            System.out.println("-----------------------------");

        }
    }
}
