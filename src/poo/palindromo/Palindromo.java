import java.util.Scanner;
public class Palindromo{
	private String palavra;
	private boolean isPalindromo;

	public Palindromo(){
		isPalindromo = true;
	}

	public void setPalavra(String palavra){
		this.palavra = palavra;
	}

	public boolean isPalindromo(){
		int e = 0;
		int i = this.palavra.length() - 1;
		while(e <= i){
		if (this.palavra.charAt(e) != this.palavra.charAt(i)) {
			isPalindromo = false;
			return false;
		}
			e++;
			i--;
			
			
		}
		return true;
	}

}
	