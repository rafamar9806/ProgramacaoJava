import java.util.Scanner;

public class ExibeTransposta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtdLinhas, qtdColunas;

        System.out.println("Informe a quantidade de linhas");
        qtdLinhas = teclado.nextInt();
        System.out.println("Informe a quantidade de colunas");
        qtdColunas = teclado.nextInt();

        int[][] numeros = new int[qtdLinhas][qtdColunas];
        int[][] matrizTranspostaCopia = new int[qtdLinhas][qtdColunas];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Matriz ORIGINAL");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[j][i] + "\t");
            }
            System.out.println();
        }

        //copiando para a matriz copia
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                matrizTranspostaCopia[i][j] = numeros[i][j];
            }
            System.out.println();
        }

        System.out.println("Matriz TRANSPOSTA");
        for (int j = 0; j < matrizTranspostaCopia[0].length; j++) {
            for (int i = 0; i < matrizTranspostaCopia.length; i++) {
                System.out.print(matrizTranspostaCopia[i][j] + "\t");
            }
            System.out.println();
        }


    }
}