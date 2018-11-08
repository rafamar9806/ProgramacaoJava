import java.util.Scanner;

public class Invertido {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetA; // declarando um vetor de inteiros.
        vetA = new int[10]; // instanciando vetA e alocando espaço para 10 elementos.

        int[] vetB; // declarando um vetor de inteiros.
        vetB = new int[vetA.length]; // instanciando vetA e alocando espaço para 10 elementos.

        // preenchendo vetor com dados inseridos pelo usuário.
        for (int i = 0; i < vetA.length; i++) {
            System.out.println("Digite o valor do elento: " + (i + 1));
            vetA[i] = input.nextInt();
        }

        // copiando valores do VetA para o VetB
        for (int i = 0; i < 10; i++) {

            vetB[i] = vetA[i];

        }

        int i = 0;
        int j = vetB.length - 1;
        int aux = 0;

        // fazendo troca do primeiro elemento pelo ultimo e ultimo pelo primeiro
        while (i < j) {
            aux = vetB[i];
            vetB[i] = vetB[j];
            vetB[j] = aux;
            i++;
            j--;
        }

        // imprimindo vetor Original
        System.out.println("***Vetor Original***");
        for (int vA : vetA) {
            System.out.print(vA + " ");
        }
        System.out.println();

        // vetor Invertido
        System.out.println("***Vetor Invertido***");
        for (int vB : vetB) {
            System.out.print(vB + " ");
        }
        System.out.println();
    }

}
