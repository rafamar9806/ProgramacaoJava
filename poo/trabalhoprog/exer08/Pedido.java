import java.util.ArrayList;

public class Pedido {
	ArrayList<Produto> itensPedido;
	private int qtdItens;
	boolean isPago;
	double troco;
	double dinheiroCliente;
	private double valorTotal;
	private String modoPagamento;
	Estoque estoque = new Estoque();

	public Pedido() {
		itensPedido = new ArrayList<>();
	}

	public void fazerPedido(String p, int quantidade) {
		boolean temEstoque = false;

		Produto pr = Estoque.procurarProduto(p);

		if (pr != null) {
			temEstoque = true;

			if (qtdItens > pr.getQtdEstoque()) {
				temEstoque = false;
				System.out.println("Quantidade Indisponivel em Estoque");
			} else {
				temEstoque = true;
				qtdItens = quantidade;
			}
		} else {
			System.out.println("Produto nao encontrado");
		}

		if (temEstoque) {
			pr.setQtdEstoque(pr.getQtdEstoque() - quantidade);
			itensPedido.add(pr);
			valorTotal += pr.getPreco() * quantidade;
		}

	}

	public void imprimirPedido() {
		for (int i = 0; i < itensPedido.size(); i++) {
			System.out.printf("Produto: %s Preço: %.2f Quantidade: %d%n", itensPedido.get(i).getProduto(),
					itensPedido.get(i).getPreco(), qtdItens);

		}
		// System.out.println(itensPedido.toString());
		System.out.println("Preço a Pagar: "+ valorTotal);
		System.out.println("Dinheiro Pago: " + dinheiroCliente);
		System.out.println("Troco: " + troco);
		System.out.println("Situação :" + isPago);
	}

	public void pagarConta(double dinheiro){
		dinheiroCliente = dinheiro;
		isPago = false;

		if (dinheiro > valorTotal) {
			troco = dinheiro - valorTotal;
			isPago = true;
		}

		if (dinheiro == valorTotal) {
			troco = 0;
			isPago = true;
		}

		if (dinheiro < valorTotal) {
			System.out.println("Está Faltando " + (valorTotal - dinheiro) + " a pagar");
			isPago = false;
		}
	}

}