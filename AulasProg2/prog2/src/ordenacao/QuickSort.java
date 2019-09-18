package ordenacao;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] v = new int[n];
		for (int i = 0; i < n; i++) {
			v[i] = input.nextInt();
			
		}
		imprimir(v);
		quick(v, 0, v.length - 1);
		imprimir(v);


	}

	public static void quick(int[] v, int i, int f) {
		if (i >= f) {
			return;
		}

		int pivo = particao(v, i, f);
		quick(v, i, pivo - 1);
		quick(v, pivo + 1, f);
	}

	public static int particao(int[] v, int i, int f) {
		int pos = i;
		int pivo = f;
		
		while(i > f && v[i] <= v[pivo]) {
			i++;
			pos++;
		}
		
		while(i < f) {
			if (v[i] < v[pivo]) {
				i++;
			} else {
				troca(v, pos, i);
				pos++;
				i++;
			}
		}
		troca(v, pivo, pos);
		
		return pos;
	}

	public static void troca(int[] v, int pos, int i) {
		int aux = v[pos];
		v[pos] = v[i];
		v[i] = aux;
		
	}
	
	public static void imprimir(int [] v) {
		for (int i : v) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
