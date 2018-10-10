import java.util.Scanner;

public class Uri_1131{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int novoGrenal = 0 , golInter = 0, golGremio = 0, vitInter = 0, 
		vitGremio = 0, empates = 0, numGrenais = 0;

		do{
			golInter = input.nextInt();
			golGremio = input.nextInt();			

			if (golInter > golGremio) {
				vitInter++;

			}
			else if (golGremio > golInter) {
				vitGremio++;

			}
			else if (golGremio == golInter) {
				empates++;
			}
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = input.nextInt();
			numGrenais++;
		}
		while (novoGrenal == 1);

		System.out.println(numGrenais + " grenais");
		System.out.println("Inter:" + vitInter);
		System.out.println("Gremio:" + vitGremio);
		System.out.println("Empates:" + empates);
		if (vitInter > vitGremio) {
			System.out.println("Inter venceu mais");

		}
		else if (vitGremio > vitInter) {
			System.out.println("Gremio venceu mais");

		}
	}
}
