
public class Juncao {
    public static void main(String[] args) {

        int[] vetA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // vetor com 10 posicoes
        int[] vetB = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }; // vetor com 10 posicoes
        int[] vetC = new int[20]; // vet com 10 posicoes

        // preenchendo os 10 primeiros elementos do vetC com os valores do vetA
        for (int i = 0; i < 10; i++) {

            vetC[i] = vetA[i];

        }

        // preenchendo os 10 ultimos elementos do vetC com os valores do vetB
        for (int i = 10; i < 20; i++) {

            vetC[i] = vetB[i - 10];

        }

        // imprimindo o vetC com juncao do vetA e vetB
        for (int var : vetC) {
            System.out.print(var + " ");
        }
        System.out.println();
    }
}