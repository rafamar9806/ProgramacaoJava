import java.util.Scanner;

public class SenhaFixa{
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
