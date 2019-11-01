package colecaoencadeada;

public class Node<T> {
	private T elemento;
	private Node<T> proximo;

	public Node(T elemento) {
		this.elemento = elemento;
		proximo = null;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public Node<T> getProximo() {
		return proximo;
	}

	public void setProximo(Node<T> proximo) {
		this.proximo = proximo;
	}
	
	public void setProximo(T elemento) {
		this.proximo = new Node<T> (elemento);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Node{elemento: "+ elemento +", prox: " + proximo;
	}
}
