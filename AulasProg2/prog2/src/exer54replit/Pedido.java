package exer54replit;

import java.util.ArrayList;

class Pedido {
	public int id;
	Tempo t;
	ArrayList<Item> itens = new ArrayList<Item>();

	public Pedido(int id, Tempo tempo) {
		this.id = id;
		this.t = tempo;
	}

	public void adicionarItem(Item item) {
		itens.add(item);
	}

	@Override
	public String toString() {
		return "{"+this.id+", "+this.t+"," + " "+ "" + itens + "}";
	}
}