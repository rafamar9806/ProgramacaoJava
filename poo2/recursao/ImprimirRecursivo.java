package recursao;

public class ImprimirRecursivo {

	public static void main(String[] args) {
		System.out.println(printRecursivo(5));

	}
	
	public static String printRecursivo(int n) {
		String str = "";
		if (n<0) {
			System.out.print("b");
		}else {
			
			return str+="a" +printRecursivo(n-1);
		}
		
		return str;
	}

}
