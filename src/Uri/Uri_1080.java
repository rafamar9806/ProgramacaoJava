import java.util.Scanner;

public class MaiorEPosicao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int [] num = new int [100];
		int maior = Integer.MIN_VALUE;
		int aux = 0;
		int posicao = 0;
		for (int i = 0;i < num.length ;i++ ) {
			num[i] = input.nextInt();

			
			
		}
		for (int j = 0;j < num.length ;j++ ) {
			if (num[j] > maior) {
				maior = num[j];
				posicao = j;
				
				
				
			}
			
		}
		System.out.println(maior);
		System.out.println(posicao + 1);
		
	}
}