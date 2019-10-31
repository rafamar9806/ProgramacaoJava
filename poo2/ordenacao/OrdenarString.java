package ordenacao;

import java.util.Scanner;
public class OrdenarString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] palavras = new String[100];
		int posi = 0;
		String pa = input.next();
		while(!pa.equals("F")) {
			palavras[posi] = pa;
			posi++;
			pa = input.next();
		}
		
		ordenar(palavras, posi);
		print(palavras, posi);

	}
	public static void ordenar(String[] palavras, int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho - 1; j++) {
				if (palavras[j].length() > palavras[j+1].length()) {
					troca(palavras, j, j+1);
				}
			}
		}
		
	}
	private static void troca(String[] palavras, int j, int i) {
		String aux = palavras[j];
		palavras[j] = palavras[i];
		palavras[i] = aux;
		
	}
	public static void print(String[] p, int tmn) {
		for (int i = 0; i < tmn; i++) {
			System.out.println(p[i]);
			
		}
	}
	

}
