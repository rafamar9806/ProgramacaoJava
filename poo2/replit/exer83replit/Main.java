package exer83replit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String animal = input.next();
		
		if(animal.equalsIgnoreCase("Elefante")) {
			animal(new Elefante());
		}
		else if(animal.equalsIgnoreCase("Raposa")) {
			animal(new Raposa());
		}
		else if(animal.equalsIgnoreCase("Lobo")) {
			animal(new Lobo());
		}
		else if(animal.equalsIgnoreCase("Cachorro")) {
			animal(new Cachorro());
		}
		
		
		

	}
	
	public static void animal(Animal a) {
		a.emitirSom();
	}

}
