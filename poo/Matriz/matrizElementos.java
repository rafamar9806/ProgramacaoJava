import java.util.Scanner;

public class matrizElementos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double media = 0.0;
        int menorValor = Integer.MAX_VALUE;
        int maiorValor = Integer.MIN_VALUE;
        int tamanhoL = 0;
        int tamanhoC = 0;

        System.out.println("num Linhas");
        int numLinhas = input.nextInt();

        System.out.println("num Colunas");
        int numColunas = input.nextInt();

        int[][] numeros = new int[numLinhas][numColunas];

        // preenchendo a matriz

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = input.nextInt();
            }
        }
        // calculando a media
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                media += numeros[i][j];

                tamanhoL = numeros[i].length;
                tamanhoC = numeros[j].length;

            }

        }
        media /= (tamanhoC + tamanhoL);

        System.out.println("Media: " + media);

        // menor valor
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] < menorValor) {
                    menorValor = numeros[i][j];
                }
            }

        }
        System.out.println("Menor valor: " + menorValor);

        // maior valor
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] > maiorValor) {
                    maiorValor = numeros[i][j];
                }
            }

        }
        System.out.println("maior Valor: "+ maiorValor);
    }
}