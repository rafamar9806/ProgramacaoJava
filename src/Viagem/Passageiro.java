package Viagem;

public class Passageiro{
	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;

	public Passageiro(String nome, String cpf, String telefone, String endereco){
	this.nome = nome;
	this.cpf = cpf;
	this.telefone = telefone;
	this.endereco = endereco;
	}

	public String getNome(){
		return nome;

	}

	public String getCpf(){
		return cpf;

	}


	public String getEndereco(){
		return endereco;

	}


	public String setEndereco(String novoEndereco){
		return endereco;

	}

	public void imprimeInformacoesPassageiros(){
		System.out.println("Nome do Motorista: " + nome);
		System.out.println("CPF do Motorista: " + cpf);
		System.out.println("Telefone: " + telefone);
		System.out.println("Endereço: " + endereco);

	}
}