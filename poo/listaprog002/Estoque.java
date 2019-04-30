public class Estoque {
	private int tMaximoEstoque;
	private Vetor itens;
	private Vetor itensIguais;

	public Estoque(int tamanhoEstoque) {
		this.tMaximoEstoque = tamanhoEstoque;
		itens = new Vetor(this.tMaximoEstoque);
		itensIguais = new Vetor(this.tMaximoEstoque);

	}

	public void inserir(Item item) {
		itens.inserir(item);
	}

	public void inserir(String nome, double preco) {
		itens.inserir(nome, preco);

	}

	public void remover(Item remover) {
		itens.remover(remover);
	}

	public void remover(int id) {
		itens.remover(id);
	}

	public void imprime() {
		itens.print();

	}

	public void imprimeIguais() {
		itens.imprimeIguais();

	}

	public void ordenaPorNome() {
		itens.ornedaAlfabeticamente();
	}

	public void ordenaPorPreco() {
		itens.ordenaPorPreco();
	}

	public Vetor procuraIguais(String nome) {
		itens.procuraIguais(nome);
		return itensIguais;
	}

	public void itensEmEstoque() {
		System.out.println("itens em estoque: " + Vetor.itensEmEstoque());

	}
}