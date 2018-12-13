import java.util.Scanner;
public class Uri_1133{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		int numInicial, numFinal;
		numInicial = input.nextInt();
		numFinal = input.nextInt();

		if (numInicial < numFinal) {
			for (int i = numInicial + 1;i < numFinal ;i++ ) {
				if (i % 5 == 2 || i % 5 == 3) {
					System.out.println(i);

				}

			}
			
		}
		else
			if (numFinal < numInicial) {
				for (int i = numFinal + 1;i < numInicial ;i++ ) {
					if (i % 5 == 2 || i % 5 == 3) {
						System.out.println(i);

					}

				}

			}

		}

		
	}
