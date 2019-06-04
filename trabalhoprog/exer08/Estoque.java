public class Estoque{
	private static Produto [] itens;

	public Estoque(int tmnEstoque){
		itens = new Produto[tmnEstoque];
	}

	public Estoque(){

	}

	public void addProduto(double preco, int qtdEstoque, String produtoNome){
		Produto item = new Produto(preco, qtdEstoque, produtoNome);

		if (Produto.getNumProdutos() > itens.length) {
			System.out.println("Estoque Cheio");
		}else{
			itens[Produto.getNumProdutos()] = item;
		}

	}

	public static Produto procurarProduto(String produto){
		for (int i = 0;i < itens.length ;i++ ) {
			if (itens[i]!=null) {
				if (itens[i].getProduto().equals(produto)) {
					return itens[i];
				}
			}
		}
		return null;
	}

	public void imprimirEstoque(){
		for (int i = 0;i < itens.length ;i++ ) {
			if (itens[i]!=null) {
				System.out.printf("Produto: %s Preço: %.2f Quantidade: %d%n", itens[i].getProduto(), itens[i].getPreco(), itens[i].getQtdEstoque());
			}
		}
		
	}
}