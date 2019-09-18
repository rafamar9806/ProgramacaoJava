package recursao;

public class BuscaBinaria {

	public static void main(String[] args) {
		int[] v = { 1, 2, 3, 4, 5 };
		System.out.println(buscaBinaria(v, 2));

	}

	private static int buscaBinaria(int[] v, int buscado) {
		return buscaBinaria(v, 0, v.length -1, buscado);

	}

	private static int buscaBinaria(int[] v, int inicio, int fim, int buscado) {

		int meio = (inicio+fim)/2;
		if (inicio > fim)
			return -1;

		if (v[meio] == buscado)
			return meio;
		
		if(buscado < v[meio])
			return buscaBinaria(v, inicio, meio - 1, buscado);

		else {
			return buscaBinaria(v, meio + 1, fim, buscado);
		}
	}

}
