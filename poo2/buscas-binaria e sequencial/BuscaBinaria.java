public class BuscaBinaria{
    public static void main(String[] args) {
        int [] n = {5,33,7,6,4,1,8,9};
        int numEncontrar = 9;
        int ii = 0;
        int jj = n.length - 1;
        int meio = 0;
        boolean encontrou = false;
        int index = 0;

        //ordenar o array
        int aux = 0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length - 1; j++) {
                if (n[j] > n[j+1]) {
                    aux = n[j];
                    n[j] = n[j+1];
                    n[j+1] = aux;
                }
            }
        }

        // imprimindo array ordenado

        for (int var : n) {
            System.out.print(var + " ");
        }
        System.out.println();

        //busca binaria
     

        while (ii <= jj && !encontrou) {
            meio = (ii+jj)/2;

            if(n[meio]==numEncontrar){
                index = meio;
                encontrou = true;
            }

            if(n[meio] > numEncontrar){
                jj = meio -1;
            }
            else{
                ii = meio + 1;
            }
        }

        if (encontrou) {
            System.out.println("achou o número " + numEncontrar + "na posicao " + index);
        }
        else{
            System.out.println("não encontrou");
        }

    }
}