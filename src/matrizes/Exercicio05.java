package matrizes;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[][][] agenda = new String[12][31][8];

        int opcao;
        do {
            System.out.println("1 - Agendar compromisso");
            System.out.println("2 - Consultar compromisso");
            System.out.println("0 - Sair");
            System.out.print("Opçao: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1: //agendar compromisso
                    System.out.print("Digite o mes (1 a 12): ");
                    int mes = scan.nextInt() - 1; // ajusta o índice do mês para 0 a 11
                    System.out.print("Digite o dia do mes (1 a 31): ");
                    int dia = scan.nextInt() - 1; // ajusta o índice do dia para 0 a 30
                    System.out.print("Digite a hora do compromisso (0 a 7): ");
                    int hora = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Digite o compromisso: ");
                    String compromisso = scan.nextLine();
                    agenda[mes][dia][hora] = compromisso; // armazena o compromisso na matriz
                    System.out.println("Compromisso agendado com sucesso!");
                    break;

                case 2: //consultar compromisso
                    System.out.print("Digite o mês (1 a 12): ");
                    mes = scan.nextInt() - 1;
                    System.out.print("Digite o dia do mês (1 a 31): ");
                    dia = scan.nextInt() - 1;
                    System.out.print("Digite a hora do compromisso (0 a 7): ");
                    hora = scan.nextInt();
                    String compromissoAgendado = agenda[mes][dia][hora];
                        if (compromissoAgendado != null) { // se o compromisso está agendado
                        System.out.println("Compromisso agendado: " + compromissoAgendado);
                        } else { // se não há compromisso agendado
                        System.out.println("Não há compromisso agendado para este horário.");
                        }
                    break;

                case 0: //sair
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente!");
                    break;
            }
            System.out.println();
        } while (opcao != 0);
        scan.close();
    }
}
