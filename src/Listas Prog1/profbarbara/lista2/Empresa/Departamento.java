
public class Departamento {
	private String departamentoNome;
	private Empregado[] empregado;
	private static int i = 0;

	public Departamento() {
		empregado = new Empregado[100];
	}

	public Departamento(String departamentoNome) {
		empregado = new Empregado[100];
		this.departamentoNome = departamentoNome;
	}

	public void setNome(String departamentoNome) {
		this.departamentoNome = departamentoNome;
	}

	public String getdepartamentoNome() {
		return this.departamentoNome;
	}

	public void adicionarEmpregado(Empregado emp) {
		if (i < empregado.length) {

			if (empregado[i] == null) {
				empregado[i] = emp;
				i++;
			}

		}
	}

	public boolean removerempregado(String nome, String id) {
		boolean temIgual = false;
		int posi = -1;

		Empregado emp = new Empregado(nome, id);
		for (int i = 0; i < empregado.length; i++) {
			if (empregado[i] != null) {
				if (empregado[i].getNome().equals(emp.getNome())) {
					temIgual = true;
					posi = i;
				}
			}
		}
		if (temIgual) {
			for (int i = 0; i < empregado.length; i++) {
				if (empregado[i] != null) {
					empregado[posi] = null;
					return true;
				}
			}
		}
		return false;
	}

	public void imprimeEmp() {
		System.out.println("-----------------------------");
		System.out.println("Departamento: " + this.departamentoNome);
		for (int i = 0; i < empregado.length; i++) {
			if (empregado[i] != null) {
				System.out.print("Nome: " + empregado[i].getNome() + "\tId: " + empregado[i].getId() + "\n");

			}
		}
	}

	public Empregado[] getEmpregado() {
		return this.empregado;
	}

	public boolean equals(Departamento dep) {
		if (this.departamentoNome.equals(dep.getdepartamentoNome())) {
			return true;
		}
		return false;
	}

}