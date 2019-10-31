package exer54replit;

class Main {
	  public static void main(String[] args) throws Exception{
	    Pedido pedido = new Pedido(1, new Tempo(1, 0, 0));
	    
	    Item item1 = new Item(1, "Morango", "O fruto vermelho do morangueiro");
	    Item item2 = new Item(2, "Uva", "O fruto da videira");
	    Item item3 = new Item(3, "Laranja", "O fruto da laranjeira");
	    
	    pedido.adicionarItem(item1);
	    pedido.adicionarItem(item2);
	    pedido.adicionarItem(item3);
	    
	    System.out.println(pedido);
	  }
	}