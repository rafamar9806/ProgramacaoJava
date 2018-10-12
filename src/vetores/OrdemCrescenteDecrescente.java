public class OrdemCrescenteDecrescente{
	public static void main(String[] args) {

		int [] vet2 = {78, 11, 99, 120, 5};
		int aux = 0;

		for (int i = 0;i < vet2.length ;i++ ) {
			for (int j = 0;j < vet2.length ;j++ ) {
				if (vet2[i] < vet2[j]) {
					aux = vet2[i];
					vet2[i] = vet2[j];
					vet2[j] = aux; 
				}

			}
			
		}

		for (int i :vet2 ) {
			System.out.print(i + " ");
			
		}
		System.out.println();
	}
}