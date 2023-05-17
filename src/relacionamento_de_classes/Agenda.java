package relacionamento_de_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Contato {
    private String nome;
    private String telefone;
    private String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getInfo() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
}

public class Agenda {
    private String nome;
    private List<Contato> contatos;

    public Agenda(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public String getNome() {
        return nome;
    }

    public String getInfoContato(int indice) {
        if (indice >= 0 && indice < contatos.size()) {
            return contatos.get(indice).getInfo();
        } else {
            return "Índice inválido!";
        }
    }

    public String getInfoTodosContatos() {
        StringBuilder infoTodosContatos = new StringBuilder();
        for (Contato contato : contatos) {
            infoTodosContatos.append(contato.getInfo()).append("\n");
        }
        return infoTodosContatos.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome da Agenda: ");
        String nomeAgenda = scan.nextLine();

        Agenda agenda = new Agenda(nomeAgenda);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Contato " + i);
            System.out.println("Nome: ");
            String nome = scan.nextLine();
            System.out.println("Telefone: ");
            String telefone = scan.nextLine();
            System.out.println("Email: ");
            String email = scan.nextLine();

            Contato contato = new Contato(nome, telefone, email);
            agenda.adicionarContato(contato);
            System.out.println();
        }
        System.out.println("Informacoes dos contatos da Agenda:");
        System.out.println(agenda.getInfoTodosContatos());

        scan.close();
    }
}
