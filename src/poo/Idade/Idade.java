import java.util.Scanner;
public class Idade{
	public int idade;
	public String nome;
	public String telefone;

	public Idade(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}

	private int getIdade(){
		
		return idade;
	}

	public int setIdade(int idadeNova){
		if (idadeNova >= 18) {
			System.out.println("eh mair de idade");
			return this.idade;
			
		}
		else if (idadeNova > 0 && idadeNova < 18) {
			System.out.println("eh menor de idade");
			
		}
		return idade;
	}

	public void imprime(){
		System.out.println("Idade: " + idade);
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
	}


}