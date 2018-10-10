import java.util.Scanner;

public class Uri_1146{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sequencia;
		sequencia = input.nextInt();

		while (sequencia != 0) {
			for (int i = 1;i <= sequencia ;i++ ) {
				if (i == sequencia) {
					System.out.print(i+ "\n");
					
				}else
					System.out.print(i + " ");
					

				
			}
			sequencia = input.nextInt();
			
		}
	}
}