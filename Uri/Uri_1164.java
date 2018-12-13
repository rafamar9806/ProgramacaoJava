import java.util.Scanner;

public class Uri_1164{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numEntradas, numParaTest = 0;
		numEntradas = input.nextInt();

		for (int i = 0;i < numEntradas ;i++ ) {
			int soma = 0;
			numParaTest = input.nextInt();

			for (int j = 1;j <= numParaTest ;j++ ) {
				if (numParaTest%j==0) {
					soma+=j;

				}


			}
			System.out.println(soma);
			if (soma == numParaTest) {
					System.out.println(numParaTest +" eh perfeito");
				}
				else
					System.out.println(numParaTest +" nao eh perfeito");
			
		}
	}
}