import java.util.Scanner;
public class Main {
	public static void main ( String [] args )
	{
		Scanner entrada = new Scanner ( System . in ) ;
		double a ,b; 
		int c;

		System.out.println("Digite o primeiro número");
		a = entrada.nextDouble ();

		System.out.println("Digite o segundo número");
		b = entrada.nextDouble ();

		System.out.println("Digite a Operação Desejada");
		System.out.println("1. soma");
		System.out.println("2. subtração");
		System.out.println("3. divisão");
		System.out.println("4. multiplicação");
		System.out.println("0. sair");

		c = entrada.nextInt ();

		do{
			

			switch(c){
				case 1:
				double d = soma (a , b );
				System.out.printf( "Resposta = %.0f \n " ,d );
				System.out.println("Digite o primeiro número");
				a = entrada.nextDouble ();

				System.out.println("Digite o segundo número");
				b = entrada.nextDouble ();
				System.out.println("Digite a Operação Desejada");
				System.out.println("1. soma");
				System.out.println("2. subtração");
				System.out.println("3. divisão");
				System.out.println("4. multiplicação");
				System.out.println("0. sair");

				c = entrada.nextInt ();

				break;

				case 2:
				double e = subtracao (a , b );
				System.out.printf( "Resposta = %.0f \n " ,e );
				System.out.println("Digite o primeiro número");
				a = entrada.nextDouble ();

				System.out.println("Digite o segundo número");
				b = entrada.nextDouble ();
				System.out.println("Digite a Operação Desejada");
				System.out.println("1. soma");
				System.out.println("2. subtração");
				System.out.println("3. divisão");
				System.out.println("4. multiplicação");
				System.out.println("0. sair");

				c = entrada.nextInt ();
				break;

				case 3:
				double f = divisao (a , b );
				System.out.printf( "Resposta = %.0f \n " ,f );
				System.out.println("Digite o primeiro número");
				a = entrada.nextDouble ();

				System.out.println("Digite o segundo número");
				b = entrada.nextDouble ();
				System.out.println("Digite a Operação Desejada");
				System.out.println("1. soma");
				System.out.println("2. subtração");
				System.out.println("3. divisão");
				System.out.println("4. multiplicação");
				System.out.println("0. sair");

				c = entrada.nextInt ();
				break;

				case 4:
				double g = multiplicacao (a , b );
				System.out.printf( "Resposta = %.0f \n " ,g );
				System.out.println("Digite o primeiro número");
				a = entrada.nextDouble ();

				System.out.println("Digite o segundo número");
				b = entrada.nextDouble ();
				System.out.println("Digite a Operação Desejada");
				System.out.println("1. soma");
				System.out.println("2. subtração");
				System.out.println("3. divisão");
				System.out.println("4. multiplicação");
				System.out.println("0. sair");

				c = entrada.nextInt ();
				break;
			}



		}while(c !=0);
		
	}
	public static double soma ( double a , double b )
	{
		double c = a + b ;
		return c ;
	}
	public static double subtracao ( double a , double b )
	{
		double c = a - b ;
		return c ;
	}
	public static double divisao ( double a , double b )
	{
		double c = a / b ;
		return c ;
	}
	public static double multiplicacao ( double a , double b )
	{
		double c = a * b ;
		return c ;
	}
}