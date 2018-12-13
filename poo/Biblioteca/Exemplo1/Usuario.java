public class Usuario{
	private String nome, cpf, endereco, telefone;
	private Livro[] livrosEmprestados;
	private boolean ativo;
	
	/*metodo construtor que inica o usuario com os parametros recebidos e os atribui aos atributos
	privados do mesmo*/
	public Usuario(String nome, String cpf, String endereco, String telefone){
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.ativo = true;
		livrosEmprestados = new Livro[3];
	}

	/*metodo get*/
	public String getNome(){
		return nome;
	}

	/*metodo get*/
	public String getCpf(){
		return cpf;
	}

	/*metodo get*/
	public String getEndereco(){
		return endereco;
	}

	/*metodo get*/
	public String getTelefone(){
		return telefone;
	}

	/*metodo get*/
	public boolean getAtivo(){
		return ativo;
	}

	/*metodo set para configurar o status do usuario, para desativa-lo caso esteja ativo, ou ativa-lo
	caso esteja desativado*/
	public void setAtivo(boolean estaAtivo){
		this.ativo = estaAtivo;
	}
	/*metodo que imprime as informacoes do usuario*/
	public void imprimeInformacoesUsuario(){
		System.out.printf("Nome do Aluno: %s\n", getNome());
		System.out.printf("CPF do Aluno %s: %s\n", getNome(), getCpf());
		System.out.printf("Endereco do Aluno %s: %s\n", getNome(), getEndereco());
		System.out.printf("Telefone do Aluno %s: %s\n", getNome(), getTelefone());
		if(getAtivo()==true)
			System.out.println("Aluno Ativo");
		else
			System.out.println("Aluno Inativo");
		
		System.out.println("Livros em Mao:");
		listaLivrosEmprestados();
	
	}

	/*metodo responsavel por emprestar o livro para o usuario recebendo o livro da biblioteca 
	como parametro*/
	public boolean emprestaLivro(Livro livro){
		int verificaLivros = 0;
		boolean naoEmprestou = true;
		for(int i = 0; i < livrosEmprestados.length && naoEmprestou ; i++){
			if(livrosEmprestados[i] == null){
				livrosEmprestados[i] = livro;
				naoEmprestou = false;
			}
			else
				verificaLivros++;			
		}

		if(verificaLivros==3)
			return false;
		else
			return true;
	}

	/*metodo responsavel por devolver o livro para a biblioteca, recebendo as informacoes do livro
	da biblioteca e o verificando com os livros em mao do usuario caso ele tenha, ou caso ele nao 
	tenha*/
	public boolean devolveLivro(Livro livro){
			String codigoAtual = livro.getCodigoLivro();
			boolean devolveLivro = false;
			for(int i = 0; i < livrosEmprestados.length ; i++){
				if(livrosEmprestados[i] != null){
					if(livrosEmprestados[i].getCodigoLivro().equals(codigoAtual)){
						livrosEmprestados[i] = null;
						devolveLivro = true;
					}
					else
					devolveLivro = false;
				}
			}

			if(devolveLivro)
				return true;
			else
				return false;
			
	}

	/*metodo responsavel por imprimir os livros em mao do usuario caso ele tenha*/
	public void listaLivrosEmprestados(){
		int contador = 0;
		for(int i = 0; i < livrosEmprestados.length ; i++)
			if(livrosEmprestados[i]!=null){
			System.out.println("" + livrosEmprestados[i].getNomeLivro());
			System.out.println("Codigo de " + livrosEmprestados[i].getNomeLivro() + ": " + "" + livrosEmprestados[i].getCodigoLivro());
			}
			else
				contador++;
			

			if(contador==3)
				System.out.printf("Nao possui livros em maos.\n");			
	}	
}