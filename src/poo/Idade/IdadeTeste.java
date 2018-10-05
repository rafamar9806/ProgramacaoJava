import java.util.Scanner;
public class IdadeTeste{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);

		System.out.println("nome");
		String nome = teclado.nextLine();

		System.out.println("telefone");
		String telefone = teclado.nextLine();

		Idade pessoa = new Idade (nome, telefone);
		
		System.out.println("Idade");
		int novaIdade = teclado.nextInt();
		pessoa.setIdade(novaIdade);

		pessoa.imprime();
	}
}