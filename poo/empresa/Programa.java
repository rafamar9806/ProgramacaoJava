public class Programa{
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.setNome("Correios");

		empresa.funcionarios = new Funcionario[5];

		Funcionario [] empregados = new Funcionario[5];
		for (int i = 0;i < empregados.length ;i++ ) {
			empregados[i] = new Funcionario();
			empresa.adicionarEmpregado(empregados[i]);

		}
		empregados[0].setNome("Rafael");
		empregados[0].setCodigo(123);

		empregados[1].setNome("maria");
		empregados[1].setCodigo(23);

		empregados[2].setNome("edivaldo");
		empregados[2].setCodigo(434);

		empregados[3].setNome("daniele");
		empregados[3].setCodigo(98);

		empregados[4].setNome("joelson");
		empregados[4].setCodigo(43);

		empresa.imprimirListaFuncionarios();

		System.out.println("--------------------");
		empresa.removerEmpregado(empregados[0]);

		//empresa.adicionarEmpregado(empregados[2]);

		empresa.imprimirListaFuncionarios();

		
	}
}