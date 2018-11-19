import java.util.Scanner;

public class ContandoCaracteres {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int k = 1;
		int maior_char = 0;
		String maior = "";
		int primeiro = 0, finall = 0;
		
		while (k != 0) {
			int cont = 0;
			System.out.println("Digite a frase a ser contada");
			String input = teclado.nextLine();
			if (input.charAt(0) == '0') {

				for (int i = finall; i >= 0; i--) {
					if (maior.charAt(i) == ' ') {
						primeiro = i + 1;
						break;
					}

				}

				System.out.print("\nA Maior Palavra: ");
				for (int i = primeiro; i <= finall; i++)
					System.out.print(maior.charAt(i));
				System.out.print("\n");
				break;
			}
			for (int i = 0; i < input.length(); i++) {
				if (i == input.length() - 1) {
					cont++;
					System.out.print(cont + "\n");
					if (maior_char <= cont) {
						maior_char = cont;
						maior = input;
						finall = i;
					}
					cont = 0;
				} else if (input.charAt(i) == ' ') {
					System.out.print(cont + "-");
					if (maior_char <= cont) {
						maior_char = cont;
						maior = input;
						finall = i;
					}
					cont = 0;
				} else
					cont++;
			}
		}

	}
}