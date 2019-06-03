public class Estoque{
	Produto [] itens;

	public Estoque(int tmnEstoque){
		itens = new Produto[tmnEstoque];
	}

	public void addProduto(double preco, int qtdEstoque, String produtoNome){
		Produto item = new Produto(preco, qtdEstoque, produtoNome);

		if (Produto.getNumProdutos() > itens.length) {
			System.out.println("Estoque Cheio");
		}else{
			itens[Produto.getNumProdutos()] = item;
		}

		for (int i = 0;i < itens.length ;i++ ) {
			if (itens[i]==null) {
				itens[i] = item;

			}
			break;
		}
	}

	public void imprimirEstoque(){
		for (int i = 0;i < itens.length ;i++ ) {
			if (itens[i]!=null) {
				System.out.printf("Produto: %s Preço: %.2f Quantidade: %d%n", itens[i].getProduto(), itens[i].getPreco(), itens[i].getQtdEstoque());
			}
		}
		
	}
}