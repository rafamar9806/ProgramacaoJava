
public class Vetor{
	private Item[] itens;
	private Item[] itensIguais;
	private int n;

	public Vetor(int n) { // recebe o tamanho do vetor quando instancia o objeto
		this.n = n;
		itens = new Item[this.n]; // inicia vetor
		itensIguais = new Item[this.n];

	}

	public void print() {
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] != null) {
				System.out.println(Item.imprimirItens(itens[i]));
				

			}
		}
		System.out.println();
	}

	public void inserir(Item item) {
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] == null) {
				itens[i] = item;
				break;
			}
		}

	}

	public void inserir(String nome, double preco) {
		Item item = new Item(nome, preco);
		inserir(item);

	}

	public void remover(Item itemRemover) {
		int posicaoEncontrada = -1;

		for (int i = 0; i < itens.length; i++) {
			if (itens[i] != null) {
				if (itens[i].compara(itemRemover)) {
					System.out.println("p " + i);
					posicaoEncontrada = i;
				}

			}
		}
		if (posicaoEncontrada >= 0) {
			itens[posicaoEncontrada] = null;
		} else {
			System.out.println("Item não Encontrado");
		}

	}

	public void remover(int id) {
		int posicaoEncontrada = -1;
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] != null) {
				if (itens[i].getId() == id) {
					posicaoEncontrada = i;
				}

			}
		}
		if (posicaoEncontrada >= 0) {
			itens[posicaoEncontrada] = null;
		} else {
			System.out.println("Item não Encontrado");
		}

	}

	public Item procuraItem(int id) {
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] != null) {
				if (itens[i].getId() == id) {
					return itens[i];
				}

			}
		}
		return null;
	}

	public Item procuraItem(String nome) {
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] != null) {
				if (itens[i].compara(nome)) {
					return itens[i];
				}

			}
		}
		return null;
	}

	public void ornedaAlfabeticamente() {
		Item aux = null;

		for (int i = 0; i < Item.getNumObjetos(); i++) {
			for (int j = i + 1; j < Item.getNumObjetos(); j++) {
				if (itens[i].getNome().compareTo(itens[j].getNome()) > 0) {
					aux = itens[i];
					itens[i] = itens[j];
					itens[j] = aux;
				}

			}

		}
	}

	public void ordenaPorPreco() {
		Item aux = null;

		for (int i = 0; i < Item.getNumObjetos(); i++) {
			for (int j = i + 1; j < Item.getNumObjetos(); j++) {
				if (itens[i].getPreco() > itens[j].getPreco()) {
					aux = itens[i];
					itens[i] = itens[j];
					itens[j] = aux;
				}

			}

		}

	}

	public Item[] procuraIguais(String nome) {
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] != null) {
				if (itens[i].getNome().equals(nome)) {
					itensIguais[i] = itens[i];
				}

			}
		}

		return itensIguais;
	}

	public void imprimeIguais() {
		System.out.println("Vetor de itens iguais");
		for (int i = 0; i < itensIguais.length; i++) {
			if (itensIguais[i] != null) {
				System.out.println("Nome: " + itensIguais[i].getNome() + " " + "Preco: " + itensIguais[i].getPreco()
						+ " Id: " + itensIguais[i].getId());

			}
		}
		System.out.println();
	}

	public static int itensEmEstoque() {
		return Item.getNumObjetos();
	}

}
