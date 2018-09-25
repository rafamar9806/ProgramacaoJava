import java.util.Scanner;

public class CrescenteDecrescente{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x, y;
		x = input.nextInt();
		y = input.nextInt(); 

		while (x != y) {
			if (x > y) {
				System.out.println("Decrescente");
				
			}
			else if (x < y) {
				System.out.println("Crescente");
				
			}
			x = input.nextInt();
			y = input.nextInt(); 
			
		}
	}
}