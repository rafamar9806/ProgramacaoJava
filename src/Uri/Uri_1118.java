import java.util.Scanner;

public class Uri_1118{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int entradaNovoCalculo = 0;
		double nota1, nota2;

		nota1 = input.nextDouble();
		nota2 = input.nextDouble();

		while (nota1 < 0.0 || nota1 > 10.0) {
			System.out.println("nota invalida");
			nota1 = input.nextDouble();

		}
		while (nota2 < 0.0 ||nota2 > 10.0) {
			System.out.println("nota invalida");
			nota2 = input.nextDouble();
		}
		System.out.printf("media = %.2f\n" , ((nota1 + nota2) / 2));

		System.out.println("novo calculo (1-sim 2-nao)");
		entradaNovoCalculo = input.nextInt();
		
		while (entradaNovoCalculo != 2){
			System.out.println("novo calculo (1-sim 2-nao)");
			entradaNovoCalculo = input.nextInt();
			while (entradaNovoCalculo == 1) {
				nota1 = input.nextDouble();
			nota2 = input.nextDouble();

		while (nota1 < 0.0 || nota1 > 10.0) {
			System.out.println("nota invalida");
			nota1 = input.nextDouble();

		}

		while (nota2 < 0.0 ||nota2 > 10.0) {
			System.out.println("nota invalida");
			nota2 = input.nextDouble();
		}

		System.out.printf("media = %.2f\n" , ((nota1 + nota2) / 2));

		System.out.println("novo calculo (1-sim 2-nao)");
		entradaNovoCalculo = input.nextInt();
				
			}
			

		
	}
		
	
		

		

		
	}
}

	