package matrizes;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] agenda = new String[31][24];

        int opcao;
        do {
            System.out.println("1 - Agendar compromisso");
            System.out.println("2 - Consultar compromisso");
            System.out.println("0 - Sair");
            System.out.print("Opçao: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1: //agendar compromisso
                    System.out.print("Digite o dia do mes (1 a 31): ");
                    int dia = scan.nextInt();
                    System.out.print("Digite a hora do compromisso (0 a 23): ");
                    int hora = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Digite o compromisso: ");
                    String compromisso = scan.nextLine();
                    agenda[dia-1][hora] = compromisso;
                    System.out.println("Compromisso agendado com sucesso!");
                    break;

                case 2: //consultar compromisso
                    System.out.print("Digite o dia do mes (1 a 31): ");
                    dia = scan.nextInt();
                    System.out.print("Digite a hora do compromisso (0 a 23): ");
                    hora = scan.nextInt();
                    String compromissoAgendado = agenda[dia-1][hora];
                    if (compromissoAgendado != null) { //se há compromisso agendado
                        System.out.println("Compromisso agendado: " + compromissoAgendado);
                    } else {
                        System.out.println("Nao ha compromisso agendado para este horario.");
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
