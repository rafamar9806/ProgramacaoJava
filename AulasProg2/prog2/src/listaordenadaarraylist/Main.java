package listaordenadaarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {


	public static void main(String[] args) throws IllegalAccessException{
		ArrayList<Tempo> listaTempos = new ArrayList<Tempo>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			Tempo t1 = new Tempo(sc.nextInt(), sc.nextInt(), sc.nextInt());
			listaTempos.add(t1);
		}
				
		Collections.sort(listaTempos);
		
		System.out.println(listaTempos);
		

	}

}

