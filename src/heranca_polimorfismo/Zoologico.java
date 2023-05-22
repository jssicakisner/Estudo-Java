package heranca_polimorfismo;

class Animal {
    protected String nome;
    protected double comprimento;
    protected int numPatas;
    protected String cor;
    protected String ambiente;
    protected double velocidade;

    public Animal(String nome, double comprimento, String cor, String ambiente, double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = 4;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento + " m");
        System.out.println("Numero de patas: " + numPatas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade: " + velocidade + " m/s");
    }

}

class Peixe extends Animal {
    private String caracteristicas;

    public Peixe(String nome, double comprimento, String cor, double velocidade) {
        super(nome, comprimento, cor, "mar", velocidade);
        this.numPatas = 0;
        this.cor = "cinzento";
        this.caracteristicas = "Barbatanas e cauda";
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Caracteristicas: " + caracteristicas);
    }
}
class Mamifero extends Animal {
    protected String alimento;

    public Mamifero(String nome, double comprimento, String cor, double velocidade, String alimento) {
        super(nome, comprimento, cor, "Terra", velocidade);
        this.alimento = alimento;
    }
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Alimento: " + alimento);
    }
}

public class Zoologico {
    public static void main(String[] args) {
        Animal antilope = new Animal("Antilope", 2.0, "Amarelo", "Terra", 30.0);
        Peixe baleia = new Peixe("Baleia", 6.0, "Preto", 25.0);
        Mamifero gato = new Mamifero("Gato", 0.30, "Branco", 2.0, "Leite");

        System.out.println("Animais do zoológico:");
        System.out.println("---------------------");
        antilope.mostrarDados();
        System.out.println("---------------------");
        baleia.mostrarDados();
        System.out.println("---------------------");
        gato.mostrarDados();
        System.out.println("---------------------");
    }
}
