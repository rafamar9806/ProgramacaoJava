import java.util.Scanner;
public class TestePalin{
public static void main(String[] args) {
		Palindromo palin = new Palindromo();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a palavra desejada");
		String pal = input.next();

		do{
			palin.setPalavra(pal);
			
			if (palin.isPalindromo()) {
				System.out.println("é Palindromo");
			}
			else
				System.out.println("Não é Palindromo");
			
			
		
		System.out.println("Digite uma nova palavra ou não para sair");
		pal = input.next();
		}
		while (!pal.equalsIgnoreCase("Não"));
			
		
		}
	}
