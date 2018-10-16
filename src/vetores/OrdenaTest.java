import java.util.*;

public class OrdenaTest{
	public static void main(String[] args) {
		int [] vetOriginal = {7,8,12,988,4,8};

		int [] vetcopia = new int[vetOriginal.length];

		System.arraycopy(vetOriginal, 0, vetcopia, 0, vetOriginal.length);
		Arrays.sort(vetcopia);

		for (int i :vetOriginal ) {
			System.out.print(i + " ");
			
		}
		System.out.println();

		for (int j :vetcopia ) {
			System.out.print(j + " ");
			
		}
		System.out.println("test");
	}
}
