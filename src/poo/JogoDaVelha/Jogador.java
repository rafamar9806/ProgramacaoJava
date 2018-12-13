
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

    // metodo para efetuar jogada usuario humano
    public void jogada(Tabuleiro tabuleiro, int linha, int coluna) {
        boolean posicaoValida = false;

        Menu menu = new Menu();
        posicaoValida = false;

        while (posicaoValida == false) {
            // posicao é valida quando nao tiver X nem O na posicao escolhida
            if (!tabuleiro.getPosicao(linha, coluna).equals("O") && !tabuleiro.getPosicao(linha, coluna).equals("X")) {
                tabuleiro.setPosicao(linha, coluna, "X");
                System.out.printf("Jogador 1 Escolheu a Posiçao [%d][%d]\n", linha, coluna);
                posicaoValida = true; // vira true sai do loop
            }
            // pede pro usuário digitar outra posicao se a mesma nao for valida
            else {
                System.out.println(" ⚠  Posicao invalida, digite outra posicao");
                linha = menu.lerLinha();
                coluna = menu.lerColuna();
            }
        }
    }

    public void jogada(Tabuleiro tabuleiro) {
        boolean posicaoValida = false;
        Random gerarNumAleatorio = new Random();
        int linha = gerarNumAleatorio.nextInt(3);//gera numeros aleatorios de 0 a 2
        int coluna = gerarNumAleatorio.nextInt(3);// gera numeros aleatorios de 0 a 2

        while (posicaoValida == false) {
            //se nao tiver X nem O na posicao gerada pelo computador, entao a jogada é efetuada
            if (!tabuleiro.getPosicao(linha, coluna).equals("O") && !tabuleiro.getPosicao(linha, coluna).equals("X")) {
                posicaoValida = true;
                tabuleiro.setPosicao(linha, coluna, "O");
                System.out.printf("Jogador 2 Escolheu a Posiçao [%d][%d]\n", linha, coluna);
            } 
            // se posicao nao for valida o computador ira gerar numeros aleatorios ate que seja valido
            else {
                linha = gerarNumAleatorio.nextInt(3);
                coluna = gerarNumAleatorio.nextInt(3);
            }
        }

    }
}
