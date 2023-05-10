package matrizes;

import java.util.Scanner;

public class Exercicio06 {

    private static final int TAMANHO_TABULEIRO = 3;
    private static final char JOGADOR_1 = 'X';
    private static final char JOGADOR_2 = 'O';
    private static char[][] tabuleiro = new char[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];

    // Define o jogador que começa a partida
    private static char jogadorAtual = JOGADOR_1;

    // Define se o jogo acabou ou não
    private static boolean jogoAcabou = false;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        inicializarTabuleiro();
        exibirTabuleiro();

        while (!jogoAcabou) {
            System.out.print("Jogador " + jogadorAtual + ", informe a linha da sua jogada (0 a 2): ");
            int linha = scan.nextInt();
            System.out.print("Jogador " + jogadorAtual + ", informe a coluna da sua jogada (0 a 2): ");
            int coluna = scan.nextInt();

            if (jogadaValida(linha, coluna)) {
                tabuleiro[linha][coluna] = jogadorAtual;

                exibirTabuleiro();

                if (jogoAcabou()) {
                    System.out.println("O jogador " + jogadorAtual + " venceu!");
                    jogoAcabou = true;
                } else if (tabuleiroCheio()) {
                    System.out.println("O jogo empatou!");
                    jogoAcabou = true;
                } else {
                    jogadorAtual = (jogadorAtual == JOGADOR_1) ? JOGADOR_2 : JOGADOR_1;
                }
            } else {
                System.out.println("Jogada inválida, tente novamente!");
            }
        }
        scan.close();        
    }
    private static void inicializarTabuleiro() {
        for (int i = 0; i < TAMANHO_TABULEIRO; i++) {
            for (int j = 0; j < TAMANHO_TABULEIRO; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }
    private static void exibirTabuleiro() {
        System.out.println("-------------");
        for (int i = 0; i < TAMANHO_TABULEIRO; i++) {
            System.out.print("| ");
            for (int j = 0; j < TAMANHO_TABULEIRO; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
}
