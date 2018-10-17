import java.util.Scanner;

public class ComparaVetString{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int entrada;
		int encontrou = 0;
		String [] palavras;

		System.out.println("Quantas Strings serão digitadas?");
		entrada = input.nextInt();
		input.nextLine();

		palavras = new String[entrada];

		for (int i = 0;i < palavras.length ;i++ ) { //preenchendo vetor com os valores digitados pelo usuário.
			System.out.println("Digite a String: " + (i+1));
			palavras[i] = input.nextLine();
			
		}

		for (int i = 0;i < palavras.length ;i++ ) {
			for (int j = i +1;j < palavras.length ;j++ ) {
				if (palavras[i].equalsIgnoreCase(palavras[j])) {
					encontrou = 1;
					System.out.printf("As Strings %d e %d são iguais: %s%n ", (i+1), (j+1), palavras[i] );
					
				}
				
			}
			
		}
		if (encontrou == 0) {
			System.out.println("Todas as Strings são diferentes.");
		}



	}
}