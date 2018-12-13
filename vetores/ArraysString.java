import java.util.*;

public class ArraysString {
public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	String [] frutas = new String[5];

    	for (int i = 0;i < frutas.length ;i++ ) {
    		frutas[i] = input.nextLine();
    		
    	}

    	Arrays.sort(frutas);

    	String [] novoVetorFrutas = new String[frutas.length];

    	for (int i = 0;i < frutas.length ;i++ ) {
    		for (int j = i;j < novoVetorFrutas.length ;j++ ) {
    			novoVetorFrutas[j] = frutas[i];
    			
    		}
    		
    	}
    	for (String frutasOrganizadas :novoVetorFrutas ) {
    		System.out.print(frutasOrganizadas + " ");
    		
    	}

    }    

}
