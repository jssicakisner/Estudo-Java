package classes_objetos_atributos;

public class LivroDeBiblioteca extends Livro {
    private boolean disponivel;

    public LivroDeBiblioteca(String titulo, String autor, int anoPublicacao, String editora) {
        super(titulo, autor, anoPublicacao, editora);
        this.disponivel = true;
    }

    // Métodos getters e setters

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

