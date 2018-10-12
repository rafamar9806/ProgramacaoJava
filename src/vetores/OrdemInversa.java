public class OrdemInversa{

	public static void main(String[] args) {
		double [] numeros = {9.8, 10.4, 8, 5, 98, 5.8};

		System.out.println("Imprimindo na Ordem normal");
		for (double n :numeros ) {
			System.out.print(n + " ");
			
		}
		System.out.println();

		//Invertendo ordem do vetor
		
		for (int i = numeros.length - 1;i >= 0 ;--i ) {
			System.out.print(numeros[i] + " ");

		}
		System.out.println();
		

		

	}
}