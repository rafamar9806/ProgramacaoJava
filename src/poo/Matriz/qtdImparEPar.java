import java.util.Scanner;

public class qtdImparEPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numPares = 0, numImpares = 0;
        

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

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if(numeros[i][j]%2==0){
                    numPares++;
                }
                else if(numeros[i][j]%2!=0){
                    numImpares++;
               }
            }
        }

        System.out.println("Números Impares = " + numImpares);
        System.out.println("Números Pares = " + numPares);

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                 System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] % 2 == 0) {
                      System.out.println("A posição [" + i + "][" + j +"]" + " eh Par");                      
                } else if (numeros[i][j] % 2 != 0) {

                    System.out.println("A posição [" + i + "][" + j + "]" + " eh Impar");
                }
            }
        }
    }
}