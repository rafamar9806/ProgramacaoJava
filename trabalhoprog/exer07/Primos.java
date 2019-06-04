import java.util.Scanner;

public class Primos{
	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);


		int num = imput.nextInt();
		String numPrimos = "";
		int qtdNumerosPrimos = 0;
		boolean isPrimo;

		for(int i=0; i <=num; i++ ){
			isPrimo = true;

			if (i == 1) {
				isPrimo = false;
			}
			if (isPrimo) {
				if ((i%2==0)&&(i!=2)) {
					isPrimo = false;
				}
				
			}

			if (isPrimo) {
				for(int j= 3; j <= (i/2); j++ ){
					if(i % j == 0){
						isPrimo = false;
						break;

					} 
				} 
				
			}
			if (isPrimo) {
				numPrimos += i + " ";
				qtdNumerosPrimos++;
			}
			
		}

		System.out.println("Números Primos: " + numPrimos);
		System.out.println("Quantidade entre 0 e " + num + " = " + qtdNumerosPrimos);

	}
}
