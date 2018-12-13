public class Livro{
	private String nomeLivro, editoraLivro, codigoLivro;
	private String[] autoresLivro;
	private int numeroPaginas;
	private boolean disponivelParaEmprestimo;


	/*metodo construtor responsavel por iniciar o livro, recebe os parametros exteriores e aplica
	os valores aos atributos privados citados abaixo, o for e necessario para entregar os valores
	do vetor autores para o autoresLivro*/
	public Livro(String nome, String editora, String codigo, String[] autores, int paginas){
		this.nomeLivro = nome;
		this.editoraLivro = editora;
		this.codigoLivro = codigo;
		this.autoresLivro = new String[3];
		for(int i = 0; i < autoresLivro.length ; i++)
			autoresLivro[i] = autores[i];

		this.numeroPaginas = paginas;
		this.disponivelParaEmprestimo = true;
	}

	/*metodo get*/
	public boolean getDisponivelParaEmprestimo(){
		return disponivelParaEmprestimo;
	}

	/*metodo get*/
	public String getNomeLivro(){
		return nomeLivro;
	}

	/*metodo get*/
	public String getEditoraLivro(){
		return editoraLivro;
	}

	public String getCodigoLivro(){
		return codigoLivro;
	}

	/*metodo get*/
	public String[] getAutoresLivro(){
		return this.autoresLivro;
	}

	/*metodo get*/
	public int getNumeroPaginas(){
		return numeroPaginas;
	}

	/*metodo responsavel por mudar a disponibilidade do livro apos o mesmo ser emprestado para um aluno
	ou devolvido para a biblioteca*/
	public void setDisponivelParaEmprestimo(boolean disponibilidade){
		this.disponivelParaEmprestimo = disponibilidade;
	}

	/*metodo responsavel por imprimir as informacoes do livro*/
	public void imprimeInformacoesLivro(){
		System.out.printf("Livro: %s\n", getNomeLivro());
		System.out.printf("Editora de %s: %s\n", getNomeLivro(), getEditoraLivro());
		System.out.printf("Codigo de %s: %s\n", getNomeLivro(), getCodigoLivro());
		System.out.printf("Autores de %s:\n", getNomeLivro());
		for(int i = 0; i < this.autoresLivro.length ; i++)
			if(autoresLivro[i] != null)
				System.out.printf("%s\n", autoresLivro[i]);
		
		System.out.printf("Numero de Paginas de %s: %d\n", getNomeLivro(), getNumeroPaginas());
		if(getDisponivelParaEmprestimo()==true)
			System.out.println("Livro disponivel para emprestimo.");
		else
			System.out.println("Livro ja emprestado.");

	}

}