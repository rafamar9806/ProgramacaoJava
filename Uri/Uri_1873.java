import java.util.Scanner;

public class Uri_1873{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	//1 - rajesh
	//2 - sheldon

	int numTestes = input.nextInt();

	String [] respostaRajesh = new String[numTestes];
	String [] respostaSheldon = new String[numTestes];

	for (int i = 0; i < numTestes; i++) {
			respostaRajesh[i] = input.next();
			respostaSheldon[i] = input.next();


			if (respostaRajesh[i].equals(respostaSheldon[i])||
				respostaSheldon[i].equals(respostaRajesh[i])) {
				System.out.println("empate");
			}

			else if(respostaRajesh[i].equals("tesoura")&&
				respostaSheldon[i].equals("papel")){
				System.out.println("rajesh");
			}
			else if(respostaSheldon[i].equals("tesoura")&&
				respostaRajesh[i].equals("papel")){
				System.out.println("sheldon");
			}

			else if(respostaRajesh[i].equals("papel")&&
				respostaSheldon[i].equals("pedra")){
				System.out.println("rajesh");
			}
			else if(respostaSheldon[i].equals("papel")&&
				respostaRajesh[i].equals("pedra")){
				System.out.println("sheldon");
			}

			else if(respostaRajesh[i].equals("pedra")&&
				respostaSheldon[i].equals("lagarto")){
				System.out.println("rajesh");
			}
			else if(respostaSheldon[i].equals("pedra")&&
				respostaRajesh[i].equals("lagarto")){
				System.out.println("sheldon");
			}

			else if(respostaRajesh[i].equals("lagarto")&&
				respostaSheldon[i].equals("spock")){
				System.out.println("rajesh");
			}
			else if(respostaSheldon[i].equals("lagarto")&&
				respostaRajesh[i].equals("spock")){
				System.out.println("sheldon");
			}

			else if(respostaRajesh[i].equals("spock")&&
				respostaSheldon[i].equals("tesoura")){
				System.out.println("rajesh");
			}
			else if(respostaSheldon[i].equals("spock")&&
				respostaRajesh[i].equals("tesoura")){
				System.out.println("sheldon");
			}

			else if(respostaRajesh[i].equals("tesoura")&&
				respostaSheldon[i].equals("lagarto")){
				System.out.println("rajesh");
			}
			else if(respostaSheldon[i].equals("tesoura")&&
				respostaRajesh[i].equals("lagarto")){
				System.out.println("sheldon");
			}

			else if(respostaRajesh[i].equals("lagarto")&&
				respostaSheldon[i].equals("papel")){
				System.out.println("rajesh");
			}
			else if(respostaSheldon[i].equals("lagarto")&&
				respostaRajesh[i].equals("papel")){
				System.out.println("sheldon");
			}

			else if(respostaRajesh[i].equals("papel")&&
				respostaSheldon[i].equals("spock")){
				System.out.println("rajesh");
			}
			else if(respostaSheldon[i].equals("papel")&&
				respostaRajesh[i].equals("spock")){
				System.out.println("sheldon");
			}

			else if(respostaRajesh[i].equals("spock")&&
				respostaSheldon[i].equals("pedra")){
				System.out.println("rajesh");
			}
			else if(respostaSheldon[i].equals("spock")&&
				respostaRajesh[i].equals("pedra")){
				System.out.println("sheldon");
			}

			else if(respostaRajesh[i].equals("pedra")&&
				respostaSheldon[i].equals("tesoura")){
				System.out.println("rajesh");
			}
			else if(respostaSheldon[i].equals("pedra")&&
				respostaRajesh[i].equals("tesoura")){
				System.out.println("sheldon");
			}
		}
		
	}
	

}