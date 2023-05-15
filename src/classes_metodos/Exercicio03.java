package classes_metodos;

import java.util.Scanner;

public class Exercicio03 {
    //teste classe Aluno
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scan.nextLine();

        System.out.print("Digite o número de matrícula do aluno: ");
        int matricula = scan.nextInt();
        scan.nextLine();

        System.out.print("Digite o curso do aluno: ");
        String curso = scan.nextLine();

        String[] disciplinas = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Informe o nome da disciplina " + (i + 1) + ": ");
            disciplinas[i] = scan.nextLine();
        }

        Aluno aluno = new Aluno(nome, matricula, curso, disciplinas);
        for (int i = 0; i < 3; i++) {
            System.out.print("Informe a nota da disciplina " + disciplinas[i] + ": ");
            double nota = scan.nextDouble();
            aluno.setNota(i, nota);
        }
        aluno.exibirInfos();

        System.out.println("Situaçao de aprovaçao:");
        for (int i = 0; i < 3; i++) {
            System.out.println("- " + disciplinas[i] + ": " + (aluno.estaAprovado(i) ? "Aprovado" : "Reprovado"));
        }

        scan.close();

    }
}
