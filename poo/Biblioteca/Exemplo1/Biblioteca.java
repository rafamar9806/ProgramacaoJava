import java.util.Arrays;
public class Biblioteca{
	private Usuario[] usuarios;
	private Livro[] livros;

	/*metodo construtor, inicia os vetores usuarios e livros com 30 e 50 posicoes nulas respectivamente*/
	public Biblioteca(){
		usuarios = new Usuario[30];
		livros = new Livro[50];
	}

	/*metodo responsavel por cadastrar um livro na biblioteca*/
	public boolean cadastrarLivro(String nome, String editora, String codigo, String[] autores, int paginas){
		boolean naoCadastrou = true;
		int verificaTamanho = 0;

		for(int i = 0; i < 50 && naoCadastrou; i++){
			if(livros[i] == null){
				livros[i] = new Livro(nome, editora, codigo, autores, paginas);
				naoCadastrou = false;
			}
		}
		if(naoCadastrou==false)
			return true;		
		else
			return false;
	}

	/*metodo responsavel por cadastrar um usuario na biblioteca*/
	public boolean cadastrarUsuario(String nome, String cpf, String endereco, String telefone){
		boolean naoCadastrou = true;
		for(int i = 0; i < 30 && naoCadastrou; i++){
			if(usuarios[i]==null){
				usuarios[i] = new Usuario(nome, cpf, endereco, telefone);
				naoCadastrou = false;
			}
		}
		if(naoCadastrou==false)
			return true;
		else
			return false;
	}

	/*metodo responsavel por emprestar um livro da biblioteca para o usuario*/
	public void emprestaLivroUsuario(String cpf, String codigoLivro){
		boolean naoEmpresta = true;
		for(int v = 0; v < usuarios.length ; v++){
			if(usuarios[v]!=null){
				if(cpf.equals(usuarios[v].getCpf())){
					if(usuarios[v].getAtivo()){
						for(int i = 0; i < livros.length ; i++){
							if(livros[i]!=null){
								if(livros[i].getCodigoLivro().equals(codigoLivro)){
									if(livros[i].getDisponivelParaEmprestimo()){
										if(usuarios[v].emprestaLivro(livros[i])){
											naoEmpresta = false;
											livros[i].setDisponivelParaEmprestimo(false);
											System.out.println("Livro emprestado!!");
										}
										else
											System.out.println("Usuario ja possui 3 livros.");
									}
									else
										System.out.println("Livro ja emprestado!!");
								}
							}
						}
					}
					else
						System.out.println("Usuario inativo!!");
				}
			}
		}
	}

	/*metodo responsavel por devolver o livro em mao do usuario definido pelo usuario para a
	biblioteca*/
	public void devolveLivro(String codigo, String cpf){
		boolean naoDevolveu = true;
		if(livroEstaCadastrado(codigo)==false && usuarioEstaCadastrado(cpf)==false){
				for(int i = 0; i < usuarios.length && naoDevolveu ; i++){
					if(usuarios[i].getCpf().equals(cpf)){
						for(int j = 0; j < livros.length && naoDevolveu ; j++){
							if(livros[j].getCodigoLivro().equals(codigo)){
								usuarios[i].devolveLivro(livros[j]);
								naoDevolveu = false;
								livros[j].setDisponivelParaEmprestimo(true);
								System.out.println("Livro devolvido para a biblioteca!");
							}
						}

					}	
				}
		}
		else{
			System.out.println("Ou o livro, ou o usuario nao estao cadastrados.");
		}	
	}

	/*metodo responsavel por imprimir todos os usuarios na biblioteca, em ordem alfabetica*/
	public void imprimeUsuariosCadastrados(){
		int contaPerfis = 0, verificaUsuarios = 0;
		for(int i = 0; i < usuarios.length ; i++){
			if(usuarios[i]!=null)
				contaPerfis++;
			else
				verificaUsuarios++;
		}

		String[] nomeF = new String[contaPerfis];

		for(int i = 0; i < contaPerfis; i++)
			if(usuarios[i]!=null)
				nomeF[i] = usuarios[i].getNome();

		Arrays.sort(nomeF);

		for(int i = 0; i < nomeF.length ; i++){
			for(int j = 0; j < usuarios.length ; j++){
				if(usuarios[j]!=null){
					if(nomeF[i].equalsIgnoreCase(usuarios[j].getNome())){
						usuarios[j].imprimeInformacoesUsuario();
						System.out.println();
					}

				}
			}
		}

		if(verificaUsuarios==30){
			System.out.println("Nao ha usuarios cadastrados!!");
			System.out.println();
		}

	}

	/*metodo responsavel por imprimir os livros cadastrados na biblioteca, em ordem alfabetica*/
	public void imprimeLivrosCadastrados(){
		int contaLivros = 0, verificaLivros = 0;
		for(int i = 0; i < livros.length ; i++){
			if(livros[i]!=null)
				contaLivros++;
			else
				verificaLivros++;
		}

		String[] nomeL = new String[contaLivros];

		for(int i = 0; i < contaLivros; i++)
			nomeL[i] = livros[i].getNomeLivro();
		

		Arrays.sort(nomeL);

		for(int i = 0; i < nomeL.length ; i++){
			for(int j = 0; j < livros.length ; j++){
				if(nomeL[i]!=null && livros[j]!=null){
					if(nomeL[i].equalsIgnoreCase(livros[j].getNomeLivro())){
						livros[j].imprimeInformacoesLivro();
						System.out.println();
					}
				}
			}
		}

		if(verificaLivros==50){
			System.out.println("Nao ha livros cadastrados!!");
			System.out.println();
		}
	}

	/*metodo responsavel por desativar um usuario cadastrado na biblioteca e impedi-lo de pegar
	mais livros*/
	public void desativarUsuario(String cpf){
		for(int i = 0; i < usuarios.length ; i++)
			if(usuarios[i]!=null)
				if(cpf.equals(usuarios[i].getCpf())){
					usuarios[i].setAtivo(false);
					System.out.println("Usuario desativado!");
				}
	}

	/*metodo responsavel por ativar um usuario cadastrado na biblioteca previamente desativado*/
	public void ativarUsuario(String cpf){
		for(int i = 0; i < usuarios.length ; i++)
			if(usuarios[i]!=null)
				if(cpf.equals(usuarios[i].getCpf())){
					usuarios[i].setAtivo(true);
					System.out.println("Usuario ativado!");
				}
	}

	/*metodo responsavel por verificar se o cpf enviado como parametro ja esta cadastrado na
	biblioteca*/
	public boolean usuarioEstaCadastrado(String cpf){
		boolean usuarioNaoExiste = true;
		for(int i = 0; i < usuarios.length ; i++){
			if(usuarios[i]!=null){
				if(usuarios[i].getCpf().equals(cpf)){
					usuarioNaoExiste = false;
				}
			}
		}

		if(usuarioNaoExiste)
			return true;
		else
			return false;
	}

	/*metodo responsavel por verificar se o codigo do livro enviado como parametro ja esta
	cadastrado na biblioteca*/
	public boolean livroEstaCadastrado(String codigo){
		boolean livroNaoExiste = true;
		for(int i = 0; i < livros.length ; i++){
			if(livros[i]!=null){
				if(livros[i].getCodigoLivro().equals(codigo)){
					livroNaoExiste = false;
				}
			}
		}

		if(livroNaoExiste)
			return true;
		else
			return false;

	}
}