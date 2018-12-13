import java.util.Scanner;

public class Uri_1078{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int tabuada;
		tabuada = input.nextInt();

		for (int i = 1;i <= 10 ;i++ ) {
			System.out.printf("%d x %d = %d\n" , i , tabuada,(i*tabuada));
			
		}
	}
}