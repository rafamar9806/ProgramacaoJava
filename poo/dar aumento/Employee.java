public class Employee{
	private String nome;
	private String sobrenome;
	private double salarioMensal;

	public Employee(String nome, String sobrenome, double salarioMensal){
		this.nome= nome;
		this.sobrenome = sobrenome;
		if (salarioMensal >0) {
			this.salarioMensal = salarioMensal;
		}
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
	public void setSalario(double salarioMensal){
		if (salarioMensal >0) {
			this.salarioMensal = salarioMensal;
		}
	}
	public String getNome(){
		return this.nome;
	}
	public String getSobrenome(){
		return this.sobrenome;
	}
	public double getSalario(){
		return this.salarioMensal;
	}
	public void darAumento(){
		double aumento = (getSalario() * 0.10) + getSalario() ;
		System.out.println("********Dando aumento de 10% *******");
		setSalario(aumento);
	}

	public double salarioAnual(){
		double salarioAnual = salarioMensal * 12;
		return salarioAnual; 
	}
	public void exibirInfoEmpr(){
		String info = String.format("Nome: %s\nSobrenome: %s\nSalario mensal: %.2f\nSalario Anual:%.2f ", nome, sobrenome,salarioMensal, salarioAnual());



	}

}