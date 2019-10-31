package exer50;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IllegalAccessException {
		Scanner input = new Scanner(System.in);
		Tempo t = new Tempo(input.nextInt(), input.nextInt(), input.nextInt());
		Tempo t2 = new Tempo(input.nextInt(), input.nextInt(), input.nextInt());
		
		if (t.compareTo(t2)==0) {
			System.out.println("SIM");
		}else {
			System.out.println("NÃO");
		}
		System.out.println(t);

	}

}
