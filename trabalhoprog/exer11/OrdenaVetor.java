import java.util.Random;

public class OrdenaVetor {
    public static void main(String[] args) {
        Random gerar = new Random();
        int[] vetorUm = new int[50];
        int[] vetorDois = new int[50];
        int [] vetorCombinado = new int[100];

        for (int i = 0; i < 50; i++) {
            vetorUm[i] = gerar.nextInt(200);
            vetorDois[i] = gerar.nextInt(200);

        }
        OrdenaVetor.ordenarVetor(vetorUm);
        OrdenaVetor.ordenarVetor(vetorDois);

        for (int i = 0; i < 50; i++) {
            vetorCombinado[i] = vetorUm[i];
        }

        for (int i = 0; i < 50; i++) {
            vetorCombinado[i+50] = vetorDois[i];
        }

        OrdenaVetor.ordenarVetor(vetorCombinado);
        
        System.out.println("-----------Vetor de 100 Ordenado-----------------");
        System.out.println();

        for (int var : vetorCombinado) {
            System.out.print(var + " ");
        }
        System.out.println();
    }

    public static void ordenarVetor(int[] v) {
        int aux = 0;
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;

                }

            }

        }
        
    }
}
