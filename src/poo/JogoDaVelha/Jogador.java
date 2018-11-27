
import java.util.Random;

public class Jogador {

    private int id;
    private int qtd;

    public Jogador(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void jogada(Tabuleiro tabuleiro, int linha, int coluna) {
        boolean posicaoValida = false;

        Menu m = new Menu();
        posicaoValida = false;

        while (posicaoValida == false) {
            if (!tabuleiro.getPosicao(linha, coluna).equals("O") && !tabuleiro.getPosicao(linha, coluna).equals("X")) {
                posicaoValida = true;
                tabuleiro.setPosicao(linha, coluna, "X");
            } else {
                System.out.println("Posicao invalida, digite outra posicao");
                linha = m.lerLinha();
                coluna = m.lerColuna();
            }
        }
    }

    public void jogada(int linha, int coluna, Tabuleiro tabuleiro) {
        boolean posicaoValida = false;

        Menu m = new Menu();
        posicaoValida = false;

        while (posicaoValida == false) {
            if (!tabuleiro.getPosicao(linha, coluna).equals("O") && !tabuleiro.getPosicao(linha, coluna).equals("X")) {
                posicaoValida = true;
                tabuleiro.setPosicao(linha, coluna, "O");
            } else {
                System.out.println("Posicao invalida, digite outra posicao");
                linha = m.lerLinha();
                coluna = m.lerColuna();
            }
        }
    }

    public void jogada(Tabuleiro tabuleiro) {
        boolean posicaoValida = false;
        Random n = new Random();
        int linha = n.nextInt(3);
        int coluna = n.nextInt(3);

        while (posicaoValida == false) {
            if (!tabuleiro.getPosicao(linha, coluna).equals("O") && !tabuleiro.getPosicao(linha, coluna).equals("X")) {
                posicaoValida = true;
                tabuleiro.setPosicao(linha, coluna, "O");
            } else {
                linha = n.nextInt(3);
                coluna = n.nextInt(3);
            }
        }

    }
}
