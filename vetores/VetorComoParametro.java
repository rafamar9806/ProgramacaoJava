public class VetorComoParametro{

	public static void main(String[] args) {
		int [] ab = {8, 9, 987, 454, 54 ,55, 1 , 2};
		int [] vet1 = organizaVetor(ab);

		for (int a :vet1 ) {
			System.out.print(a + " ");
		}
		System.out.println();

	}

	public static int [] organizaVetor(int [] vet){
		int aux = 0;
		System.out.println("vetor desordenado");
		for (int i :vet ) {
			System.out.print(i + " ");
			
		}
		System.out.println();

		//Ordenando o vetor

		for (int i = 0;i < vet.length ;i++ ) {
			for (int j = i +1 ;j < vet.length ;j++ ) {
				if (vet[i] > vet[j]) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
					
				}

			}			
		}
		return vet;
	}
}