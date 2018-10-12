public class Notas{
	public static void main(String[] args) {
		double [] notas = {6, 6, 6, 6};
		double somaNotas = 0.0;
		for (int i = 0;i < notas.length ;i++ ) {
			somaNotas+=notas[i];
			
		}

		double media = somaNotas / 4;
		System.out.println(media);
	}
}