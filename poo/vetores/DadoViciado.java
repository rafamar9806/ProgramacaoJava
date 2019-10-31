public class DadoViciado{
	public static void main(String[] args) {
		int [] n = {6,5,3,1,6,1,2,4};
		int um = 0, dois = 0, tres = 0, quatro = 0, cinco = 0,seis = 0;

		for (int i = 0; i < n.length; i++) {
			switch(n[i]){
				case 1:
					um++;
					break;
				case 2:
					dois++;
					break;
				case 3:
					tres++;
					break;
				case 4:
					quatro++;
					break;
				case 5:
					cinco++;
					break;
				case 6:
					seis++;
					break;
			}
		}

		System.out.printf("%d %d %d %d %d %d\n", um, dois, tres, quatro, cinco, seis);
	}
}