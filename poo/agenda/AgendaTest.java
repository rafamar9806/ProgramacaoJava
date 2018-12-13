public class AgendaTest{
	public static void main(String[] args) {

		AgendaTelefone [] agenda = new AgendaTelefone[50];

		

		for (int i = 0;i < agenda.length ;i++ ) {
			if (agenda[i] == null) {
				agenda[i] = new AgendaTelefone();

				agenda[0].setNome("Rafael");
				agenda[0].setTelefone("12345123456");
				break;
				
			}
			
		}
		for (int j = 0;j < agenda.length ;j++ ) {
			if (agenda[j]!= null) {
				System.out.printf("Nome: %s Telefone: %s ", agenda[j].getNome(), agenda[j].getTelefone());
				
			}
			
		}


	}
}