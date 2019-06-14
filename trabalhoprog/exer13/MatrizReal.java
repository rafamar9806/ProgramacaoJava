import java.util.Scanner;

public class MatrizReal {
	public final static int M = 2;
	public final static int N = 2;
	public final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		float[][] a = new float[M][N];
		float[] v = new float[N], p = new float[M];
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print("Informe A[" + i + "][" + j + "]: ");
				a[i][j] = input.nextFloat();
			}
		}
		for(int j = 0; j < M; j++) {
			System.out.print("Informe V[" + j + "]: ");
			v[j] = input.nextFloat();
		}
		for(int i = 0; i < M; i++) {
			p[i] = 0;
			for(int j = 0; j < N; j++) {
				p[i] = p[i] + a[i][j] * v[j];
			}
		}
		System.out.println("Produto A x V:");
		for(int i = 0; i < M; i++) {
			System.out.printf("\t%f\n", p[i]);
		}
	}

	
}
