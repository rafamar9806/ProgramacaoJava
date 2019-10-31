import java.util.Scanner;

/*
implementamos as letras B,C,D
*/

public class Matriz {
    private static int[][] m;
    private Scanner input = new Scanner(System.in);

    public Matriz(int linha, int coluna) {
        this.m = new int[linha][coluna];
    }
    public Matriz(int [][] matriz) {//construtor sobrecarregado
        this.m = matriz;
    }

    // B
    public static int[][] transposta(Matriz objMatriz) {
        System.out.println("Transposta");

        int[][] matriz = objMatriz.getMatriz();
        m = new int[m[0].length][matriz.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = matriz[j][i];
            }

        }
        return m;
    }

    // C

    public static int[][] matrizOposta(Matriz objMatriz) {
        System.out.println("Oposta");

        int[][] matriz = objMatriz.getMatriz();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = matriz[i][j] * -1;
            }

        }
        m = matriz;

        return m;

    }

    // D
    public static int[][] matrizNula(Matriz objMatriz) {
        System.out.println("Nula");
        int[][] matriz = objMatriz.getMatriz();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }

        }
        m = matriz;

        return m;

    }

    public static int qtdLinhas(int[][] mLinha) {
        int linha = mLinha.length;

        return linha;
    }

    public static int qtdcoluna(int[][] mLinha) {
        int coluna = mLinha[0].length;

        return coluna;
    }

    public int[][] setMatriz() {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }

        }
        return m;
    }

    public int[][] getMatriz() {
        return this.m;
    }

    public void printMatriz() {
        System.out.println("Imprimindo Matriz");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void printMatriz(int[][] m) {
        System.out.println("Imprimindo Matriz");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}