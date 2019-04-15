import java.util.Scanner;

public class Uri_1168{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		String [] leds = new String[n];

		for (int i = 0;i< n ;i++ ) {
			String palavra= input.next();
			char respostas = new char[palavra.length()];

			for (int j = 0;j<palavra.length() ;j++ ) {
					respostas[j] = palavra.charAt(j);
				
			}
			
		}

		for (char p :respostas ) {
			System.out.print(p + " ");
		}
	}
}