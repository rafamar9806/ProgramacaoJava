package arraylist;

import java.util.ArrayList;

public class ListaNomes {
	static ArrayList<String> nomes = new ArrayList<String>();

	public static void main(String[] args) {
		add("Rafael");
		add("Daniele");
		add("edivaldo");

		System.out.println(nomes);

	}
	public static boolean add(String nome) {
		return nomes.add(nome);
	}
	@Override
	public String toString() {
		return "ListaNomes [nomes=" + nomes + "]";
	}
	
	

}
