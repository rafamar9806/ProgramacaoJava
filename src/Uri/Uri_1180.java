
public class Uri_1180{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int tamnhoVetor = input.nextInt();
        int menor = Integer.MAX_VALUE;
        int posicao = 0;

        int [] vetor =  new int [tamnhoVetor];

        for(int i = 0; i < vetor.length;i++){
            vetor[i] = input.nextInt();
        }
        for(int j = 0; j < vetor.length;j++){
            if(vetor[j] < menor){
                menor = vetor[j];
                posicao = j;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + posicao);

        
    }
}