import java.util.Scanner;

public class Uri_1132{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x, y;
		x = input.nextInt();
		y = input.nextInt();

		if (x < y) {
			int sum = 0;
			while (x <= y) {
				if (x%13 !=0) {
					sum+=x;
					
				}
				x++;
				
			}
			System.out.println(sum);
			
		}
		else if (y < x) {
			int sum = 0;
			while (y <= x) {
				if (y%13 !=0) {
					sum+=y;
					
				}
				y++;
				
			}
			System.out.println(sum);
			
		}
	}
}