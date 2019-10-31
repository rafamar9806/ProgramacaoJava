package exer60replit;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> palavras = new ArrayList<String>();

		palavras.add("AR");
		palavras.add("BR");
		palavras.add("JP");
		palavras.add("US");

		Scanner scanner = new Scanner(System.in);
		String slg = scanner.nextLine();
		int idex = -1;
		boolean contem = false;

		if (palavras.contains(slg)) {
			idex = palavras.indexOf(slg);
			contem = true;
		}

		System.out.println(contem);
		System.out.println(idex);

	}

}