import javax.swing.JOptionPane;

public class Invoice{
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;

	public Invoice(String numero,String descricao,int quantidade,double preco){
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public void setNumero(String numero){
		this.numero = numero;
	}
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
	public void setPreco(double preco){
		this.preco = preco;
	}
	public String getNumero(){
		return this.numero;
	}
	public String getDescricao(){
		return this.descricao;
	}
	public int getQuantidade(){
		return this.quantidade;
	}
	public double getPreco(){
		return this.preco;
	}
	public double getInvoiceAmount(){
		if (quantidade < 0) {
			setQuantidade(0);
		}
		if (preco < 0) {
			setPreco(0.0);
		}
		double fatura = preco* quantidade;

		return fatura;
	}

	public void exibirInfoProduto(){
		String info = String.format("Código: %s\nDescrição: %s\nQuantidade: %d\nPreço: %.2f\nFatura: %.2f\n ", numero, descricao
			,quantidade, preco, getInvoiceAmount());

		System.out.println(info);


	}

}