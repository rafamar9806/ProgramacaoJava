public class OrdenacaoSelecao{
    public static void main(String[] args) {
        int [] numeros = {5,7,1,4,10,2,9};


        for (int i = 0; i < numeros.length; i++) {
            int menor = i;

            for (int j = i+1; j < numeros.length; j++) {
                if (numeros[j]<numeros[menor]) {
                    trocar(numeros, j, menor);
                }
            }
        }

        print(numeros);

       
    }
    public static void trocar (int[] n, int primeiro, int segundo){
        int aux = 0;
        aux = n[primeiro];
        n[primeiro] = n[segundo];
        n[segundo] = aux;
    }

    public static void print(int [] n){
        for (int var : n) {
            System.out.print(var + " ");
        }
        System.out.println();
    }
}