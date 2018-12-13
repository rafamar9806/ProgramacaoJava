import java.util.Scanner;

public class menorMaiorMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numLinhas, numColunas, menorNum = Integer.MAX_VALUE, maiorNum = Integer.MIN_VALUE, menorNumPosiLinha = 0,
                menorNumPosiColuna = 0, maiorNumPosiLinha = 0, maioNumPosiColuna = 0;

        double media = 0.0;

        System.out.println("Digite o numero de Linhas");
        numLinhas = input.nextInt();

        System.out.println("Digite o numero de Colunass");
        numColunas = input.nextInt();

        int[][] matriz = new int[numLinhas][numColunas];

        // preenchendo a matriz com dados digitados pelo usuario
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = input.nextInt();

            }
        }

        // Mostrando a matriz na tela
        System.out.println();
        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("-=-=-=-=-=-=-=-=-=--=");

        // menor e maior numero
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < menorNum) {
                    menorNum = matriz[i][j];
                    menorNumPosiLinha = i;
                    menorNumPosiColuna = j;

                }

                else if (matriz[i][j] > maiorNum) {
                    maiorNum = matriz[i][j];
                    maiorNumPosiLinha = i;
                    maioNumPosiColuna = j;
                }

            }

        }

        // media
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                media += matriz[i][j];

            }
        }
        media /= (numLinhas * numColunas);
        System.out.println("Media: " + media);
        System.out.println("-=-=-=-=-=-=-=-=-=--=");

        // imprimindo resultados na tela
        System.out.println("Menor numero: " + menorNum);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == menorNum) {
                    System.out.println("Posicao [" + i + "]" + "[" + j + "]");
                }

            }

        }
        System.out.println("-=-=-=-=-=-=-=-=-=--=");

        System.out.println("Maior numero: " + maiorNum);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == maiorNum) {
                    System.out.println("Posicao [" + i + "]" + "[" + j + "]");
                }

            }

        }

    }
}