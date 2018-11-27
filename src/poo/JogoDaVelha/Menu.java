import java.util.Scanner;

public class Menu {

    private Scanner input;

    public Menu() {
        input = new Scanner(System.in);
    }

    public void imprimeTabuleiro(Tabuleiro tabuleiro) {
        tabuleiro.imprimeTabuleiro(tabuleiro);

    }

    public int lerLinha() {
        System.out.println("Entre com a posicao da linha. um valor entre 0 e 2");
        int numLinhas = input.nextInt();
        do {

            if (numLinhas >= 0 && numLinhas <= 2) {
                return numLinhas;

            }

            System.out.println("Digite um valor entre 0 e 2");
            numLinhas = input.nextInt();
        } while (numLinhas < 0 || numLinhas > 2);

        return numLinhas;
    }

    public int lerColuna() {
        System.out.println("Entre com a posicao da coluna. um valor entre 0 e 2");
        int numColuna = input.nextInt();
        do {

            if (numColuna >= 0 && numColuna <= 2) {
                return numColuna;

            }

            System.out.println("Digite um valor entre 0 e 2");
            numColuna = input.nextInt();
        } while (numColuna < 0 || numColuna > 2);

        return numColuna;
    }
}
