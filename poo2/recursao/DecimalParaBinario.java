package recursao;
import java.util.*;
public class DecimalParaBinario {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		converter(n);

	}

	private static void converter(int i) {
		String str= "";
		if(i/2!=0) {
			converter(i/2);
		}
		System.out.print(i%2);
		
	}

}
