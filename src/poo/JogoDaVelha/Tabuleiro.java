
public class Tabuleiro {

    private String[][] posicao;

    public Tabuleiro() {
        posicao = new String[3][3];

        for (int i = 0; i < posicao.length; i++) {
            for (int j = 0; j < posicao[i].length; j++) {
                posicao[i][j] = Integer.toString(i) + Integer.toString(j);
            }

        }

    }

    public void imprimeTabuleiro(Tabuleiro tabuleiro) {
        for (int i = 0; i < posicao.length; i++) {
            for (int j = 0; j < posicao[i].length; j++) {

                System.out.printf(" %s ", posicao[i][j]);

            }
            System.out.println("\n");
        }
        System.out.println();

    }

    public String getPosicao(int linha, int coluna) {
        for (int i = 0; i < posicao.length; i++) {
            for (int j = 0; j < posicao[i].length; j++) {
                if (posicao[i][j] == posicao[linha][coluna]) {
                    return posicao[linha][coluna];

                }
            }

        }
        return null;
    }

    public void setPosicao(int linha, int coluna, String valor) {
        for (int i = 0; i < posicao.length; i++) {
            for (int j = 0; j < posicao[i].length; j++) {
                posicao[linha][coluna] = valor;
            }

        }
    }

    public boolean verificaVitoria(String simbolo) {
        for (int i = 0; i < posicao.length; i++) {
            for (int j = 0; j < posicao[i].length; j++) {
                if (posicao[0][0].equalsIgnoreCase(simbolo) && posicao[1][0].equalsIgnoreCase(simbolo) && posicao[2][0].equalsIgnoreCase(simbolo)// coluna da esquerda
                        || posicao[0][1].equalsIgnoreCase(simbolo) && posicao[1][1].equalsIgnoreCase(simbolo) && posicao[2][1].equalsIgnoreCase(simbolo)//coluna do meio
                        || posicao[0][2].equalsIgnoreCase(simbolo) && posicao[1][2].equalsIgnoreCase(simbolo) && posicao[2][2].equalsIgnoreCase(simbolo)//coluna da direita
                        || posicao[0][0].equalsIgnoreCase(simbolo) && posicao[0][1].equalsIgnoreCase(simbolo) && posicao[0][2].equalsIgnoreCase(simbolo)//linha de cima 
                        || posicao[1][0].equalsIgnoreCase(simbolo) && posicao[1][1].equalsIgnoreCase(simbolo) && posicao[1][2].equalsIgnoreCase(simbolo)//linha do meio
                        || posicao[2][0].equalsIgnoreCase(simbolo) && posicao[2][1].equalsIgnoreCase(simbolo) && posicao[2][2].equalsIgnoreCase(simbolo)//linha de baixo
                        || posicao[0][0].equalsIgnoreCase(simbolo) && posicao[1][1].equalsIgnoreCase(simbolo) && posicao[2][2].equalsIgnoreCase(simbolo)//diagonal 1
                        || posicao[0][2].equalsIgnoreCase(simbolo) && posicao[1][1].equalsIgnoreCase(simbolo) && posicao[2][0].equalsIgnoreCase(simbolo))//diagonal 2
                {
                    return true;
                }

            }

        }
        return false;
    }
}
