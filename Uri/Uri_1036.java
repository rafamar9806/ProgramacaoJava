import java.util.Scanner;

public class Uri_1036{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double a,b,c;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		double delta1 = Math.pow(b,2);
		double delta2 = (4 * a *c);

		double delta = delta1 - delta2;
		System.out.println("delta " + delta);

		if (delta == 0) {
			System.out.println("Impossivel calcular");
		}else{
			double xpositivo =  Math.sqrt(delta);
			double bd = - b;
			xpositivo =  xpositivo + bd;
			System.out.println("xpositivo " + xpositivo);

			double xnegativo =  Math.sqrt(delta);
			double bds = - b;
			xnegativo =  xnegativo - bds;
			System.out.println("xnegativo " + xnegativo);

		}
 
		/*if (a == 0) {
			System.out.println("Impossivel calcular");
		}
		else{
			double raiz = Math.pow()
		}
			*/
		

	}
}