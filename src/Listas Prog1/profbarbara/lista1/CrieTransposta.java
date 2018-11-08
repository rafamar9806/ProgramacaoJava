import java.util.Scanner;

public class CrieTransposta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtdLinhas, qtdColunas;

        System.out.println("Informe a quantidade de linhas");
        qtdLinhas = teclado.nextInt();
        System.out.println("Informe a quantidade de colunas");
        qtdColunas = teclado.nextInt();

        int[][] numeros = new int[qtdLinhas][qtdColunas]; 
        int[][] matrizTranspostaCopia = new int[qtdColunas][qtdLinhas]; // inverti as linhas e colunas. Antes [linhas][colunas], Depois [coluna][linhas]

        //preenchendo o vetor com dados do inseridos pelo usuario
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = teclado.nextInt();
            }
        }

        // percorrendo as colunas e linhas recebendo da matriz original.
        for (int i = 0; i < matrizTranspostaCopia.length; i++) {
            for (int j = 0; j < matrizTranspostaCopia[i].length; j++) {
                matrizTranspostaCopia[i][j] = numeros[j][i]; 
            }

        }
        // imprimindo matriz original
        System.out.println("Matriz ORIGINAL");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }

        // imprimindo a transposta
        System.out.println("Matriz Transposta");
        for (int i = 0; i < matrizTranspostaCopia.length; i++) {
            for (int j = 0; j < matrizTranspostaCopia[i].length; j++) {
                System.out.print(matrizTranspostaCopia[i][j] + "\t");
            }
            System.out.println();
        }

    }
}