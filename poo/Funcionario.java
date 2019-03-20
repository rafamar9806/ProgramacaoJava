public class Funcionario{
	private String nome;
	private int codigo;
	private boolean estaNaEmpresa;
	private double salario;

	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	public int getCodigo(){
		return codigo;
	}
}