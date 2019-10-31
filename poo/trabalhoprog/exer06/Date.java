public class Date{
	private int dia;
	private int mes;
	private int ano;

	public Date(int dia, int mes, int ano){
		if (dia > 0 && dia <= 31) {
			this.dia = dia;
		}
		if (mes >0 && mes <=12) {
			this.mes = mes;
		}
		if (ano > 0) {
			this.ano = ano;
		}

	}

	public void setDia(int dia){
		if (dia > 0 && dia <= 31) {
			this.dia = dia;
		}
	}
	public void setMes(int mes){
		if (mes >0 && mes <=12) {
			this.mes = mes;
		}
		
	}
	public void setAno(int ano){
		if (ano > 0) {
			this.ano = ano;
		}
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
	public void displayDate(){
		String dataFormatada = String.format("%d/%d/%d\n", getDia(), getMes(), getAno());
		System.out.print(dataFormatada);
	}

}