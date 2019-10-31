package ordenacao;

public class BuscaBinaria {

	public static void main(String[] args) {
		int [] b = {7,9,10,55,4,3,78};
		SelectionSort.print(b);
		SelectionSort.selectionSort(b);
		SelectionSort.print(b);

		
		buscar(b, 2);
		


	}

	public static void buscar(int[] b, int i) {
		int ii = 0;
		int f = b.length - 1;
		boolean achou = false;
		int posi = -1;
		
		while(ii<=f && !achou) {
			int meio = (ii+f)/2;
			
			if(b[meio]==i) {
				posi = meio;
				achou = true;
			}
			else if(i < b[meio]) {
				f = meio - 1;
			}
			else {
				ii = meio + 1;
			}
			
		}
		
		System.out.println(posi);
		
		
	}

}
