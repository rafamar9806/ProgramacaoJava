import java.util.Scanner;

public class Uri_1101{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int m, n;

		m = input.nextInt();
		n = input.nextInt();

		while (m > 0 && n > 0 ) {
			if (m > n) {
				int sum = 0;
				while (n <= m) {
					
					System.out.print(n + " " );
					sum+=n;
					n++;

					
				}
				System.out.println("Sum="+sum);



				
				
			}

			else if (n > m) {
				int sum2 = 0;
				while (m <= n) {
					

					System.out.print(m + " " );
					sum2+=m;
					m++;

					
				}
				System.out.println("Sum="+sum2);



				
				
			}
			m = input.nextInt();
			n = input.nextInt();
			
		}

	}
}