package classes_metodos;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private String[] disciplinas;
    private double[] notas;

    public Aluno(String nome, int matricula, String curso, String[] disciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.notas = new double[disciplinas.length];
    }

    public void setNota(int indice, double nota) {
        if (indice >= 0 && indice < disciplinas.length) {
            notas[indice] = nota;
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public boolean estaAprovado(int indiceDisciplina) {
        if (indiceDisciplina >= 0 && indiceDisciplina < disciplinas.length) {
            return notas[indiceDisciplina] >= 7.0;
        } else {
            System.out.println("Índice inválido.");
            return false;
        }
    }

    public void exibirInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("Disciplinas:");
        for (int i = 0; i < disciplinas.length; i++) {
            System.out.println("- " + disciplinas[i] + ": " + notas[i]);
        }
    }
}
