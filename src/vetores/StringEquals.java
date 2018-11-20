import java.util.Scanner;

public class StringEquals{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int quantidadeString;

		System.out.println("Quantas Strings serão digitadas?");
		quantidadeString = input.nextInt();
		input.nextLine();


		String [] palavras = new String[quantidadeString];
		String [] palavrasCopia = new String[palavras.length];

		for (int i = 0;i < palavras.length ;i++ ) {
			palavras[i] = input.nextLine();
			
		}
		//System.arraycopy(palavras, 0, palavrasCopia, 0, palavras.length);

		int posicaoJ = -1;
		int posicaok = -1;

		String palavraIgual = "";
		String error = "";

		for (int j = 0;j < palavras.length ;j++ ) {
			for (int k = j + 1;k <palavras.length  ;k++) {
				if (palavras[j].equalsIgnoreCase(palavras[k])) {
					posicaoJ = j;
					posicaok = k;
					palavraIgual = palavras[j];
					
					
				}else{
					error = "todas as strings sao diferentes";
				}
				
			}
			
				
			}
			System.out.printf("As Strings %d e %d são iguais: %s%n" , posicaoJ, posicaok, palavraIgual);
			if (error.equals("todas as strings sao diferentes")) {
				System.out.println(error);
			}
			
		}
	}
