import java.util.Scanner;

public class Menu{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		int menu, option, contaUsuarios = 0, contaLivros = 0, paginas;
		String nome, editora, codigo, maisAutores, cpf, telefone, endereco;
		boolean desejaContinuar = true;
		String [] autores = new String[3];
		Biblioteca ufms = new Biblioteca();

		do{
			System.out.println("1 - Imprimir Alunos.");
			System.out.println("2 - Imprimir Livros.");
			System.out.println("3 - Adicionar um Aluno.");
			System.out.println("4 - Adicionar um Livro.");
			if(contaUsuarios!=0){
			System.out.println("5 - Desativar um Usuario.");
			System.out.println("6 - Ativar um Usuario.");
			}
			if(contaLivros!=0 && contaUsuarios!=0){
				System.out.println("7 - Emprestar livro para aluno.");
				System.out.println("8 - Devolver livro para a biblioteca.");
			}
			System.out.println("0 - Sair do programa.");
			menu = teclado.nextInt();
			teclado.nextLine();
			System.out.println();

			if(menu==1){
				ufms.imprimeUsuariosCadastrados();
			}
			else if(menu==2){
				ufms.imprimeLivrosCadastrados();			
			}
			else if(menu==3){
				contaUsuarios++;
				System.out.println("Digite o nome do Aluno:");
					nome = teclado.nextLine();

					do{
					System.out.println("Digite o CPF do Aluno(deve possuir 11 digitos):");
					cpf = teclado.nextLine();
					}while(cpf.length()!=11);

					System.out.println("Digite o Endereco do Aluno:");
					endereco = teclado.nextLine();

					System.out.println("Digite o telefone do Aluno:");
					telefone = teclado.nextLine();
					if(ufms.usuarioEstaCadastrado(cpf)){
						if(ufms.cadastrarUsuario(nome, cpf, endereco, telefone) == true)
							System.out.println("Usuario cadastrado com Sucesso!");
						else
							System.out.println("Numero limite de usuarios ja cadastrados!");
					}
					else{
						System.out.println("Usuario ja esta cadastrado!!");
					}
					System.out.println();
			}
			else if(menu==4){
				contaLivros++;
				System.out.println("Digite o nome do Livro:");
					nome = teclado.nextLine();

					System.out.println("Digite o nome da Editora do livro:");
					editora = teclado.nextLine();

					do{
					System.out.println("Digite o codigo ISBN do livro(deve possuir 13 digitos):");
					codigo = teclado.nextLine();
					}while(codigo.length()!=13);

					System.out.println("Digite o numero de paginas do Livro:");
					paginas = teclado.nextInt();

					teclado.nextLine();

					System.out.println("Digite o nome dos autores do livro:");	
					for(int i = 0; i < autores.length ; i++)
						autores[i] = null;

					for(int i = 0; i < autores.length && desejaContinuar ; i++){
					autores[i] = teclado.nextLine();
					if(i!=2){
					System.out.println("Ainda tem mais autores? (Sim/Nao)");
					maisAutores = teclado.nextLine();
					if(maisAutores.equalsIgnoreCase("sim")){
					desejaContinuar = true;
					}
					if(maisAutores.equalsIgnoreCase("nao")){
					desejaContinuar = false;
						}
					}
				}	
					if(ufms.livroEstaCadastrado(codigo)){
						if(ufms.cadastrarLivro(nome, editora, codigo, autores, paginas) == true)
							System.out.println("Livro cadastrado com Sucesso!");
						else
							System.out.println("Numero limite de livros ja cadastrados!");
					}
					else{
						System.out.println("Livro ja esta cadastrado!!");
					}
					System.out.println();
			}
			else if(menu==5 && contaUsuarios!=0){
				do{
				System.out.println("Digite o CPF do usuario desejado(deve possuir 11 digitos):");
					cpf = teclado.nextLine();
					}while(cpf.length()!=11);

					ufms.desativarUsuario(cpf);
					System.out.println();
			}
			else if(menu==6 && contaUsuarios!=0){
				do{
				System.out.println("Digite o CPF do usuario desejado(deve possuir 11 digitos):");
					cpf = teclado.nextLine();
				}while(cpf.length()!=11);
					ufms.ativarUsuario(cpf);
					System.out.println();
			}
			else if(menu==7 && contaUsuarios!=0 && contaLivros!=0){
				do{
				System.out.println("Informe o CPF do Usuario(deve possuir 11 digitos):");
				cpf = teclado.nextLine();
				}while(cpf.length()!=11);

				do{
				System.out.println("Informe o codigo ISBN do Livro(deve possuir 13 digitos):");
				codigo = teclado.nextLine();
				}while(codigo.length()!=13);

				ufms.emprestaLivroUsuario(cpf, codigo);
				System.out.println();
			}
			else if(menu==8 && contaUsuarios!=0 && contaLivros!=0){
				do{
				System.out.println("Digite o codigo ISBN do Livro que deseja voltar para a biblioteca(deve possuir 13 digitos):");
				codigo = teclado.nextLine();
				}while(codigo.length()!=13);

				do{
				System.out.println("Digite o CPF do atual usuario que possui o Livro:");
				cpf = teclado.nextLine();
				}while(cpf.length()!=11);

				ufms.devolveLivro(codigo, cpf);
				System.out.println();
			}


			desejaContinuar = true;
		}while(menu!=0);
	}
}