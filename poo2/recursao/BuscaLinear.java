package recursao;

public class BuscaLinear {

	public static void main(String[] args) {
		int[] v = { 1, 2, 3, 4, 5 };
		System.out.println(buscaLinear(v, 5));

	}

	private static int buscaLinear(int[] v, int buscado) {
		return buscaLinear(v, 0, v.length -1, buscado);

	}

	private static int buscaLinear(int[] v, int inicio, int fim, int buscado) {

		if (inicio > fim)
			return -1;

		if (v[inicio] == buscado)
			return v[inicio];

		else {
			return buscaLinear(v, inicio + 1, fim, buscado);
		}
	}

}
