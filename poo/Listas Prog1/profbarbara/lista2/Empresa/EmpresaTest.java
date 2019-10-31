import java.util.Scanner;

public class EmpresaTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Empresa empresa = new Empresa();

		System.out.println("1 - Adicionar Setor");
		System.out.println("2 - Adicionar Empregado");
		System.out.println("3 - Emprimir Setores");
		System.out.println("4 - Imprimir Empregados/Setores");
		System.out.println("5 - Trocar de setor");
		System.out.println("6 - Remover Departamento");
		System.out.println("0 - Sair");

		int op = input.nextInt();
		input.nextLine();

		do {
			switch (op) {
			case 1:
				System.out.println("Nome Setor");
				String setor = input.nextLine();
				empresa.criarDepartamento(setor);

				System.out.println("1 - Adicionar Setor");
				System.out.println("2 - Adicionar Empregado");
				System.out.println("3 - Emprimir Setores");
				System.out.println("4 - Imprimir Empregados/Setores");
				System.out.println("5 - Trocar de setor");
				System.out.println("6 - Remover Departamento");
				System.out.println("0 - Sair");

				op = input.nextInt();
				input.nextLine();

				break;
			case 2:
				System.out.println("Nome");
				String nome = input.nextLine();

				System.out.println("ID");
				String id = input.nextLine();

				empresa.imprime();
				System.out.println("Setor");
				String set = input.nextLine();

				empresa.addEmpregado(nome, id, set);

				System.out.println("1 - Adicionar Setor");
				System.out.println("2 - Adicionar Empregado");
				System.out.println("3 - Emprimir Setores");
				System.out.println("4 - Imprimir Empregados/Setores");
				System.out.println("5 - Trocar de setor");
				System.out.println("6 - Remover Departamento");
				System.out.println("0 - Sair");

				op = input.nextInt();
				input.nextLine();

				break;
			case 3:
				empresa.imprime();
				System.out.println("1 - Adicionar Setor");
				System.out.println("2 - Adicionar Empregado");
				System.out.println("3 - Emprimir Setores");
				System.out.println("4 - Imprimir Empregados/Setores");
				System.out.println("5 - Trocar de setor");
				System.out.println("6 - Remover Departamento");
				System.out.println("0 - Sair");

				op = input.nextInt();
				input.nextLine();

				break;
			case 4:
				empresa.impEmpr();
				System.out.println("1 - Adicionar Setor");
				System.out.println("2 - Adicionar Empregado");
				System.out.println("3 - Emprimir Setores");
				System.out.println("4 - Imprimir Empregados/Setores");
				System.out.println("5 - Trocar de setor");
				System.out.println("6 - Remover Departamento");
				System.out.println("0 - Sair");

				op = input.nextInt();
				input.nextLine();

				break;

			case 5:
				System.out.println("Nome");
				String n = input.nextLine();

				System.out.println("ID");
				String i = input.nextLine();

				empresa.imprime();
				System.out.println("Setor Antigo");
				String setAntigo = input.nextLine();

				System.out.println("Setor Novo");
				String setNovo = input.nextLine();

				empresa.mudarSetor(n, i, setAntigo, setNovo);
				System.out.println("1 - Adicionar Setor");
				System.out.println("2 - Adicionar Empregado");
				System.out.println("3 - Emprimir Setores");
				System.out.println("4 - Imprimir Empregados/Setores");
				System.out.println("5 - Trocar de setor");
				System.out.println("6 - Remover Departamento");
				System.out.println("0 - Sair");

				op = input.nextInt();
				input.nextLine();

				break;
			case 6:
				empresa.imprime();

				System.out.println("Departamento Que será Excluído");
				String depA = input.nextLine();

				System.out.println("Departamento que será alocado os funcionários");
				String depB = input.nextLine();

				empresa.removerDepartamento(depA, depB);
				
				System.out.println("1 - Adicionar Setor");
				System.out.println("2 - Adicionar Empregado");
				System.out.println("3 - Emprimir Setores");
				System.out.println("4 - Imprimir Empregados/Setores");
				System.out.println("5 - Trocar de setor");
				System.out.println("6 - Remover Departamento");
				System.out.println("0 - Sair");

				op = input.nextInt();
				input.nextLine();

				break;

			default:
				break;
			}

		} while (op != 0);

	}

}
