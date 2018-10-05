public class CompararStrings implements Comparable <CompararStrings>{
	private String nome;
	private int idade;

	public CompararStrings (String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public int getIdade(){
		return this.idade;
	}
	@Override
	public int CompareTo(CompararStrings outraIdade){
		if (idade < outraIdade.getIdade()) {
			return -1;
			
		}else if (idade > outraIdade.getIdade()) {
			return 1;			
		}
			else
				return 0;
	}
	
}