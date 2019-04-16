import java.util.Scanner;

public class Uri_1168 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int numLeds = 0;

		String[] leds = new String[n];

		for (int i = 0; i < n; i++) {
			leds[i] = input.next();
			char[] t = new char[leds[i].length()];
			for (int j = 0; j < leds[i].length(); j++) {
				t[j] = leds[i].charAt(j);
			}
			for (char var : t) {
				switch (var) {
				case '8':
					numLeds += 7;
					break;
				case '0':
				case '6':
				case '9':
					numLeds += 6;
					break;
				case '2':
				case '3':
				case '5':
					numLeds += 5;
					break;
				case '4':
					numLeds += 4;
					break;
				case '7':
					numLeds += 3;
					break;
				case '1':
					numLeds += 2;
					break;
				}
			}
			System.out.println(numLeds + " leds");
			numLeds = 0;
		}

	}
}