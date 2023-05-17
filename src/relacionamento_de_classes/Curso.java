package relacionamento_de_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Professor {
    private String nome;
    private String departamento;
    private String email;

    public Professor(String nome, String departamento, String email) {
        this.nome = nome;
        this.departamento = departamento;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getEmail() {
        return email;
    }    
}

class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[4];
    }
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setNota(int indice, double nota) {
        if (indice >= 0 && indice < 4) {
            notas[indice] = nota;
        }
    }
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    public boolean estaAprovado() {
        return calcularMedia() >= 7;
    }

}

public class Curso {
    private String nome;
    private String horario;
    private Professor professor;
    private List<Aluno> alunos;

    public Curso(String nome, String horario, Professor professor) {
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public double calcularMediaTurma() {
        double soma = 0;
        for (Aluno aluno : alunos) {
            soma += aluno.calcularMedia();
        }
        return soma / alunos.size();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o nome do curso: ");
        String nomeCurso = scan.nextLine();

        System.out.println("Informe o horario do curso: ");
        String horarioCurso = scan.nextLine();

        System.out.println("Professor do Curso:");
        System.out.println("Nome: ");
        String nomeProfessor = scan.nextLine();
        System.out.println("Departamento: ");
        String departamentoProfessor = scan.nextLine();
        System.out.println("Email: ");
        String emailProfessor = scan.nextLine();

        Professor professor = new Professor(nomeProfessor, departamentoProfessor, emailProfessor);
        Curso curso = new Curso(nomeCurso, horarioCurso, professor);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Aluno " + i);
            System.out.println("Nome: ");
            String nomeAluno = scan.nextLine();
            System.out.println("Matricula: ");
            String matriculaAluno = scan.nextLine();

            Aluno aluno = new Aluno(nomeAluno, matriculaAluno);

            for (int j = 1; j <= 4; j++) {
                System.out.println("Informe a nota " + j + " do aluno: ");
                double nota = scan.nextDouble();
                aluno.setNota(j - 1, nota);
            }
            curso.adicionarAluno(aluno);
            System.out.println();
            scan.nextLine(); //Limpar o buffer
        }
        System.out.println("Media dos alunos:");
        for (Aluno aluno : curso.alunos) {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Media: " + aluno.calcularMedia());
            System.out.println("Aprovado: " + (aluno.estaAprovado() ? "Sim" : "Nao"));
            System.out.println();
        }
        System.out.println("Media da turma: " + curso.calcularMediaTurma());

        scan.close();        
    }
}
