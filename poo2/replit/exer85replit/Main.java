package exer85replit;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Zoologico zoologico = new Zoologico();

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			Animal panda1 = new Panda(input.nextInt());
			zoologico.addAnimal(panda1);
		}

		System.out.println(zoologico);
	}
}