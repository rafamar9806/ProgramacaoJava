import java.util.Scanner;

public class Uri_1114{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int senha = 2002;
		int entrada;
		entrada = input.nextInt();

		while (entrada!=senha) {
			System.out.println("Senha Invalida");
			entrada = input.nextInt();
			
		}
		System.out.println("Acesso Permitido");
	}
}
