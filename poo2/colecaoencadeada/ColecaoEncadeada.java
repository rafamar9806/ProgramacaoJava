package colecaoencadeada;

public class ColecaoEncadeada <T>{
	private Node<T> inicio;
	int quantidade;
	
	public ColecaoEncadeada() {
		quantidade = 0;
		inicio = null;
	}
	
	public Node<T> getInicio(){
		return inicio;
	}
	
	public int getQtd() {
		return quantidade;
	}
	
	void inserirInicio(T el) {
		Node<T> no = new Node<T>(el);
		no.setProximo(inicio);
		inicio = no;
		quantidade++;
	}
	
	public boolean contem(T el) {
		Node<T> no = inicio;
		while (inicio!=null) {
			if (inicio.getElemento().equals(el)) {
				return true;
			}
			no = no.getProximo();
		}
		return false;
		
	}
	
	
}
