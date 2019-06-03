public class Produto{
	private double preco;
	private int qtdEstoque;
	private String produtoNome;
	private static int numprodutos;

	public Produto(double preco, int qtdEstoque, String produtoNome){
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
		this.produtoNome = produtoNome;
		numprodutos++;

	}

	public static int getNumProdutos(){
		return numprodutos; 
	}

	public void setpreco(double preco){
		this.preco = preco;
	}

	public void setQtdEstoque(int qtdEstoque){
		this.qtdEstoque = qtdEstoque;
	}

	public void setProdutoNome(String produtoNome){
		this.produtoNome = produtoNome;
	}

	public String getProduto(){
		return this.produtoNome;
	}

	public int getQtdEstoque(){
		return this.qtdEstoque;
	}

	public double getPreco(){
		return this.preco;
	}






}