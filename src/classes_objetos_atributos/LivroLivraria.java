package classes_objetos_atributos;

public class LivroLivraria extends Livro {
    private double preco;
    private int quantidadeEstoque;

    public LivroLivraria(String titulo, String autor, int anoPublicacao, String editora, double preco, int quantidadeEstoque) {
        super(titulo, autor, anoPublicacao, editora);
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Métodos getters e setters

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}

