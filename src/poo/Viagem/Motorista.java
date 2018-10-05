package Viagem;

public class Motorista{
	private String nome;
	private String cpf;
	private String placaCarro;
	private int anoValidadeHabilitacao;
	private String endereco;

	public Motorista(String nome, String cpf, String placaCarro, int anoValidadeHabilitacao, String endereco){
	this.nome = nome;
	this.cpf = cpf;
	this.placaCarro = placaCarro;
	this.anoValidadeHabilitacao = anoValidadeHabilitacao;
	this.endereco = endereco;
	}

	public String getNome(){
		return nome;

	}

	public String getCpf(){
		return cpf;

	}

	public String getPlacaCarro(){
		return placaCarro;

	}

	public String getEndereco(){
		return endereco;

	}

	public String setPlacaCarro(String novaPlaca){
		return placaCarro;

	}

	public String setEndereco(String novoEndereco){
		return endereco;

	}

	public void imprimeInformacoesMotoristas(){
		System.out.println("Nome do Motorista: " + nome);
		System.out.println("CPF do Motorista: " + cpf);
		System.out.println("Placa do ônibus: " + placaCarro);
		System.out.println("Endereço: " + endereco);

	}
}