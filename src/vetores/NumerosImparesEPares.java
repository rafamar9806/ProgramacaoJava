public class NumerosImparesEPares{

	public static void main(String[] args) {
		
		int [] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int numPares = 0;
		int numImpares = 0;

		for (int i = 0;i < num.length ;i++ ) {
			if (num[i] % 2 == 0) {
				numPares++;
				
			}
			else{
				numImpares++;
			}
			
		}
		System.out.println(numPares);
		System.out.println(numImpares);

		int [] pares = new int[20 ];	
		int [] impares = new int[20];



		for (int i = 0;i < num.length;i++ ) {
			
			if (num[i]%2==0) {
				pares[i] = num[i];
				
			}
			else{
				impares[i] = num[i];
			}
			
		}
		for (int pare :pares ) {
			if (pare!=0) {
				System.out.print(pare + " ");
			}
			
		}
		System.out.println();

		for (int impar :impares ) {
			if (impar!=0) {
				System.out.print(impar + " ");
			}
			
			
		}
		System.out.println();
	}
}