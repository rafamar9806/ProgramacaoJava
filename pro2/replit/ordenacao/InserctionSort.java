package ordenacao;
import java.util.Scanner;

public class InserctionSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int [] v = new int[n];
		for (int i = 0; i < v.length; i++) {
			v[i] = input.nextInt();
			
		}
		
		ordenar(v);
		print(v, n);

	}

	private static void ordenar(int[] v) {
		for (int i = 0; i < v.length; i++) {
			int x = v[i];
			int j = i - 1;
			
			while(j >= 0 && v[j]< x) {
				v[j+1] = v[j];
				j--;
			}
			v[j+1] = x;
		}
		
	}
	
	public static void print(int[] p, int tmn) {
		System.out.println(tmn);
		for (int i : p) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
