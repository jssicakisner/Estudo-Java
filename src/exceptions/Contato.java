package exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Contato {
    private static int contador = 0;

    private String nome;
    private String telefone;
    private int identificador;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.identificador = contador;
        contador++;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}

class ContatoNaoExisteException extends Exception {
    public ContatoNaoExisteException(String mensagem) {
        super(mensagem);
    }
}

class Agenda {
    private int capacidade;
    private List<Contato> contatos;

    public Agenda(int capacidade) {
        this.capacidade = capacidade;
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) throws AgendaCheiaException {
        if (contatos.size() >= capacidade) {
            throw new AgendaCheiaException("A agenda esta cheia. Não e possivel adicionar mais contatos.");
        }
        Contato contato = new Contato(nome, telefone);
        contatos.add(contato);
    }

    public Contato consultarContato(int identificador) throws ContatoNaoExisteException {
        for (Contato contato : contatos) {
            if (contato.getIdentificador() == identificador) {
                return contato;
            }
        }
        throw new ContatoNaoExisteException("O contato nao foi encontrado na agenda.");
    }
}

class AgendaCheiaException extends Exception {
    public AgendaCheiaException(String mensagem) {
        super(mensagem);
    }
}

class Teste {
    private Agenda agenda;
    private Scanner scanner;

    public Teste() {
        this.agenda = new Agenda(5);
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\n---- MENU ----");
            System.out.println("1 - Consultar contato");
            System.out.println("2 - Adicionar contato");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opçao: ");
            String opcao = scanner.nextLine();

            if (opcao.equals("1")) {
                consultarContato();
            } else if (opcao.equals("2")) {
                adicionarContato();
            } else if (opcao.equals("0")) {
                break;
            } else {
                System.out.println("Opçao invalida. Tente novamente.");
            }
        }
    }

    public void consultarContato() {
        System.out.print("Digite o identificador do contato: ");
        String identificadorStr = scanner.nextLine();

        try {
            int identificador = Integer.parseInt(identificadorStr);
            Contato contato = agenda.consultarContato(identificador);
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
        } catch (NumberFormatException e) {
            System.out.println("Identificador invalido. Digite um numero inteiro.");
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public void adicionarContato() {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();

        try {
            agenda.adicionarContato(nome, telefone);
            System.out.println("Contato adicionado com sucesso.");
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void fecharScanner() {
        scanner.close();
    }
}
