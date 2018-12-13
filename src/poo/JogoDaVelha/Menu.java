import java.util.Scanner;

public class Menu {

    private Scanner input;

    public Menu() {
        input = new Scanner(System.in);
    }

    // imprime o tabuleiro, printf usado para formatar na maneira desejada
    public void imprimeTabuleiro(Tabuleiro tabuleiro) {

        System.out.printf(" %s ¦ %s ¦ %s \n", tabuleiro.getPosicao(0, 0), tabuleiro.getPosicao(0, 1),
                tabuleiro.getPosicao(0, 2));
        System.out.print("--------------\n");
        System.out.printf(" %s ¦ %s ¦ %s \n", tabuleiro.getPosicao(1, 0), tabuleiro.getPosicao(1, 1),
                tabuleiro.getPosicao(1, 2));
        System.out.print("--------------\n");

        System.out.printf(" %s ¦ %s ¦ %s \n", tabuleiro.getPosicao(2, 0), tabuleiro.getPosicao(2, 1),
                tabuleiro.getPosicao(2, 2));

        System.out.println();//pula uma linha pra ficar melhor de se vizualizar
    }

    public int lerLinha() {
        System.out.println("Entre com a posicao da linha. um valor entre 0 e 2");
        System.out.print("➩  ");
        int numLinhas = input.nextInt();

        // verifica se o numero digitado é >=0 && <=2 para que nao tenha risco de erro.
        do {

            if (numLinhas >= 0 && numLinhas <= 2) {
                return numLinhas;

            }

            System.out.println(" ☢ Digite um valor entre 0 e 2");
            numLinhas = input.nextInt();
        } while (numLinhas < 0 || numLinhas > 2);
        System.out.println();

        return numLinhas;
    }

    public int lerColuna() {
        System.out.println("Entre com a posicao da coluna. um valor entre 0 e 2");
        System.out.print("➩  ");
        int numColuna = input.nextInt();
                
        do {
            // verifica se o numero digitado é >=0 && <=2 para que nao tenha risco de erro.
            if (numColuna >= 0 && numColuna <= 2) {
                return numColuna;

            }

            System.out.println(" ☢ Digite um valor entre 0 e 2");
            numColuna = input.nextInt();
        } while (numColuna < 0 || numColuna > 2);
        System.out.println();

        return numColuna;
    }
}
