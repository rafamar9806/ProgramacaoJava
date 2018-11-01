import java.util.*;

public class valorRepetido {
    public static void main(String[] args) {
        Random rands = new Random();
      
        int[][] numeros = new int[3][3];
        int aux = 0;
        int repete = 0;
        int tamanhoLinha = 0;
        int tamanhoColuna = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = rands.nextInt(50); // preenchendo vetor com números aleatórios
                tamanhoLinha = numeros[i].length;
                tamanhoColuna = numeros[j].length;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
              aux = j;
                for (int k = i; k < numeros.length; k++) {
                    for (int l = aux; l < numeros[k].length; l++) {
                        if (numeros[k][l] == numeros[i][j] && (i != k || j != l)) {
                            System.out.println(
                                    "A posição [" + i + "][" + j + "]  repete na posição [" + k + "][" + l + "]");

                            repete++;

                        }

                    }
                    aux = 0;

                }

            }

        }

        if (repete > tamanhoLinha * tamanhoColuna) {
            System.out.println("tem repetido");
        } else
            System.out.println("não repete");

       

    }
}