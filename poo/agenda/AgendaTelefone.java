public class AgendaTelefone{
	private String nome;
	private String telefone;

	public AgendaTelefone(){
	
	}

	public AgendaTelefone(String nome, String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}

	public void setTelefone(String telefone){
		int tamanho = telefone.length();
		if (tamanho == 11) {
			this.telefone = telefone;
			
	}
}
	public String getTelefone(){
		return this.telefone;
	}


	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}

	/*public void removerPessoa(String pessoaremover){
		for (int i = 0;i < nomes.length ;i++ ) {
			if (nomes[i] != null) {
				if (nomes[i].equalsIgnoreCase(pessoaremover)) {
					nomes[i] = null;
					
				}
				
			}
			
		}
	}

	public void imprimeListaNomes(){
		for (String listaNomes :nomes ) {
			if (listaNomes != null) {
				System.out.printf("Nome:%s%4s" , listaNomes, "");
		}
			
			
	}
	System.out.println();		
		
}
	public void listaDeNumeros(){
		for (String num :telefones ) {
			if (num != null) {
				System.out.printf("%s%4s" , num, "");
			}
		}
		System.out.println();
	}*/
}



