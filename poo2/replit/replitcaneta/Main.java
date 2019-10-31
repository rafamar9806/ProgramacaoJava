package replitcaneta;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Caneta> canetas = new ArrayList<Caneta>();

		String marca = input.next();
		int cont = 0;

		while (!marca.equals("-1")) {

			String cor = input.next();
			double espessura = input.nextDouble();

			input.nextLine();
			Caneta c = new Caneta(marca, cor, espessura);
			canetas.add(c);
			marca = input.next();
		}

		System.out.println(canetas);
	}
}