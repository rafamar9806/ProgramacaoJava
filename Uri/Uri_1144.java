import java.util.Scanner;

public class Uri_1144{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int entrada = input.nextInt();

		for (int i = 1;i<=entrada ;i++ ) {
			System.out.println(i+" "+(i*i)+" "+(i*i*i));
			System.out.println(i+" "+(i*i+1)+" "+(i*i*i+1));				
				
			
			
		}
	}
}