public class Empresa{
	private String nome;
	private String cnpj;
	Funcionario [] funcionarios;

	public void adicionarEmpregado(Funcionario empregado){
		for (int i = 0;i < funcionarios.length ;i++ ) {
			if (funcionarios[i]==null) {
				funcionarios[i] = empregado;
				break;
			}
		}
	}
	public void removerEmpregado(Funcionario funcionario){
		Funcionario removido;
		int posicao = -1;
		for (int i = 0;i < funcionarios.length ;i++ ) {
			if (funcionarios[i]!=null) {
				if (funcionarios[i].getCodigo()==funcionario.getCodigo()) {
					funcionarios[i] = funcionarios[i+1];
					funcionarios[i+1] = null;
				}
				
			}
		}

	}

	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}

	public void imprimirListaFuncionarios(){
		System.out.printf("Nome\tCodigo\n");
		for (int i = 0;i < funcionarios.length ;i++ ) {
			if (funcionarios[i]!=null) {
				System.out.print(i + " ");
				System.out.printf("%s\t%d\n", funcionarios[i].getNome(), funcionarios[i].getCodigo());
				
			}
		}
	}
}