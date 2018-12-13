import java.util.Scanner;
public class Exer4{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double [] notas = new double [4];
		double media = 0.0;

		for (int i = 0;i < notas.length ;i++ ) {
			notas[i] = teclado.nextDouble();
			
		}

		for (int j = 0;j < notas.length ;j++ ) {
			media += notas[j];
			
		}

		media = media/notas.length;

		System.out.println(media);

		
	}
}