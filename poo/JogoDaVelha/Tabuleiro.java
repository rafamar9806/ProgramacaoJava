
public class Tabuleiro {

    private String[][] posicao;

    public Tabuleiro() {
        //instanciando a matriz com tamanho 3x3
        posicao = new String[3][3];

        // Iniciando a matriz, usando metodo Integer.toString() para converter int para string
        for (int i = 0; i < posicao.length; i++) {
            for (int j = 0; j < posicao[i].length; j++) {
                posicao[i][j] = Integer.toString(i) + Integer.toString(j);
            }

        }

    }
    //recebe como parâmetros linha e coluna, retorna a posicao em que elas estao
    public String getPosicao(int linha, int coluna) {

        return posicao[linha][coluna];

    }

    // seta o valor do tipo String na matriz na posicao indicada pelo usuario
    public void setPosicao(int linha, int coluna, String valor) {

        posicao[linha][coluna] = valor;

    }

    // percorre a matriz analizando todas as possibilidades de vitoria.
    public boolean verificaVitoria(String simbolo) {
        for (int i = 0; i < posicao.length; i++) {
            for (int j = 0; j < posicao[i].length; j++) {
                if (posicao[0][0].equalsIgnoreCase(simbolo) && posicao[1][0].equalsIgnoreCase(simbolo)
                        && posicao[2][0].equalsIgnoreCase(simbolo)// coluna da esquerda
                        || posicao[0][1].equalsIgnoreCase(simbolo) && posicao[1][1].equalsIgnoreCase(simbolo)
                                && posicao[2][1].equalsIgnoreCase(simbolo)// coluna do meio
                        || posicao[0][2].equalsIgnoreCase(simbolo) && posicao[1][2].equalsIgnoreCase(simbolo)
                                && posicao[2][2].equalsIgnoreCase(simbolo)// coluna da direita
                        || posicao[0][0].equalsIgnoreCase(simbolo) && posicao[0][1].equalsIgnoreCase(simbolo)
                                && posicao[0][2].equalsIgnoreCase(simbolo)// linha de cima
                        || posicao[1][0].equalsIgnoreCase(simbolo) && posicao[1][1].equalsIgnoreCase(simbolo)
                                && posicao[1][2].equalsIgnoreCase(simbolo)// linha do meio
                        || posicao[2][0].equalsIgnoreCase(simbolo) && posicao[2][1].equalsIgnoreCase(simbolo)
                                && posicao[2][2].equalsIgnoreCase(simbolo)// linha de baixo
                        || posicao[0][0].equalsIgnoreCase(simbolo) && posicao[1][1].equalsIgnoreCase(simbolo)
                                && posicao[2][2].equalsIgnoreCase(simbolo)// diagonal 1
                        || posicao[0][2].equalsIgnoreCase(simbolo) && posicao[1][1].equalsIgnoreCase(simbolo)
                                && posicao[2][0].equalsIgnoreCase(simbolo))// diagonal 2
                {
                    return true;
                }

            }

        }
        return false;
    }
}
