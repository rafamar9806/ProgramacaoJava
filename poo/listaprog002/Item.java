
public class Item {
	private double preco;
	private String nome;
	private int id;
	private static int numObjetos = 0;

	public Item(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		numObjetos++;
	}
	public static String imprimirItens(Item item){
		String imprimir = String.format("Nome: %s Preço: %f ID: %d", item.getNome(), item.getPreco(), item.getId());
		return imprimir;
	}

	public static int getNumObjetos() {
		return numObjetos;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public int getId() {
		return this.id;
	}

	public boolean compara(Item a) {
		if (this.nome.equals( a.getNome()) && this.getPreco() == a.getPreco()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean compara(String a) {
		if (this.nome.equals(a)) {
			return true;
		} else {
			return false;
		}
	}

}