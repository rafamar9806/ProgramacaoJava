public class Data{
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public void setDia(int dia){
		this.dia = dia;
	}

	public void setMes(int mes){
		if (mes > 0 && mes <= 31) {
			this.mes = mes;
			
		}
	}

	public void setAno(int ano){
		this.ano = ano;
	}

	public int getDia(){
		return this.dia;
	}

	public int getMes(){
		return this.mes;
	}

	public int getAno(){
		return this.ano;
	}

	public void imprimeData(){
		System.out.printf("Data de Hoje: %d/%d/%d \n", dia, mes, ano);
		System.out.printf("Data de ontem: %d/%d/%d \n", (dia - 1), mes, ano);
		System.out.printf("Data de amanha: %d/%d/%d \n", (dia + 1), mes, ano);
			
			
	}
}