package colecaoencadeada;

public class Main {

	public static void main(String[] args) {
		Node<String> no = new Node<String>("a");
		no.setProximo("b");
		
		System.out.println(no.getProximo().getElemento());

	}

}
