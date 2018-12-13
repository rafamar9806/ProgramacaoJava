import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtdLinhas, qtdColunas, par = 0, impar = 0;

        System.out.println("Informe a quantidade de linhas");
        qtdLinhas = teclado.nextInt();
        System.out.println("Informe a quantidade de colunas");
        qtdColunas = teclado.nextInt();

        int[][] numeros = new int[qtdLinhas][qtdColunas];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = teclado.nextInt();

                if (numeros[i][j] % 2 == 0) {
                    par++;
                } else if (numeros[i][j] % 2 != 0) {
                    impar++;
                }
            }
        }
        System.out.println();
        System.out.println("Matriz");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("-=-=-=-=-=-=-=-=-=--=");

        System.out.println("A quantidade de numeros pares eh: " + par + "\nnas Posicoes");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {

                if (numeros[i][j] % 2 == 0) {
                    System.out.println("Posicao [" + i + "]" + "[" + j + "]");

                }

            }
        }
        System.out.println("A quantidade de numeros impares eh: " + impar + "\nnas Posicoes");

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {

                if (numeros[i][j] % 2 != 0) {
                    System.out.println("Posicao [" + i + "]" + "[" + j + "]");

                }

            }
        }
    }
}