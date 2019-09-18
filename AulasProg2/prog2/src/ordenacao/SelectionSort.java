package ordenacao;

public class SelectionSort {

	public static void main(String[] args) {
		int[] n = { 5, 4, 3, 2, 1 };
		print(n);
		selectionSort(n);
		print(n);

	}

	public static void selectionSort(int[] array) {
		for (int fixo = 0; fixo < array.length - 1; fixo++) {
		    int menor = fixo;
		   
		    for (int i = menor + 1; i < array.length; i++) {
		       if (array[i] < array[menor]) {
		          menor = i;
		       }
		    }
		    if (menor != fixo) {
		      int t = array[fixo];
		      array[fixo] = array[menor];
		      array[menor] = t;
		    }
		  }
		}
	

	public static void troca(int[] v, int i, int menor) {
		int aux = v[i];
		v[i] = v[menor];
		v[menor] = aux;
	}

	public static void print(int[] p) {
		for (int i : p) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
