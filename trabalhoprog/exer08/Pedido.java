public class Pedido{
	Produto [] itens;
	private int qtdItens;
	private String modoPagamento;

	public Pedido(int qtdItens){
		this.itens = new Produto[qtdItens];
	}

}