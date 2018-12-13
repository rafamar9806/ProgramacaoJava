import java.util.Scanner;

public class Uri_1134{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int entrada;
		int alcool = 0 , gasolina = 0, diesel = 0;
		entrada = input.nextInt();

		String mensagem = "MUITO OBRIGADO";
		System.out.println(mensagem);
		while (entrada != 4) {
			entrada = input.nextInt();
			if (entrada == 1) {
				alcool++;
			}
			else if (entrada == 2) {
				gasolina++;
				
			}
			else if (entrada == 3) {
				diesel++;
				
			}
			
		}
		
		
        System.out.print("MUITO OBRIGADO\n");

        System.out.print("Alcool: "+alcool+"\n");

        System.out.print("Gasolina: "+gasolina+"\n");

        System.out.print("Diesel: "+diesel+"\n");

	}
}