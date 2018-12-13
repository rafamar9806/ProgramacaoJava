public class Consoantes{
	public static void main(String[] args) {
		
		char [] numConsoantes = {'d', 'i', 'p', 'q', 'r', 's', 'a', 'v', 'n', 'o'};
		int cont = 0;
		for (int i = 0;i< numConsoantes.length ;i++ ) {
			if (numConsoantes[i] != 'a') {
				if (numConsoantes[i] != 'e') {
					if (numConsoantes[i] != 'i') {
						if (numConsoantes[i] != 'o') {
							if (numConsoantes[i] != 'u') {
								
							}
							
						}
						
					}

				}				
			}else{
				cont = i + 1;
			}
			
			
		}
		System.out.println("Numero de Consoantes: " + cont);
	}
}