package replitcaneta;


class Caneta {
	private String marca;
	private String cor;
	private double espessura;
	private boolean transparente;

	public Caneta(String marca, String cor, double espessura, boolean transparente) {
		this.marca = marca;
		this.cor = cor;
		this.espessura = espessura;
		this.transparente = transparente;

	}

	public Caneta(String marca, String cor, double espessura) {
		this.marca = marca;
		this.cor = cor;
		this.espessura = espessura;
		this.transparente = false;

	}

	public Caneta(String cor, double espessura, boolean transparente) {
		this.marca = "Desconhecida";
		this.cor = cor;
		this.espessura = espessura;
		this.transparente = transparente;

	}

	public String getMarca() {
		return marca;
	}
	
	public boolean getTransparente() {
		return transparente;
	}

	public String getCor() {
		return cor;
	}

	public double getEspessura() {
		return espessura;
	}

	public boolean isTransparente() {
		return transparente;
	}

	public Caneta() {
		this.marca = "Desconhecida";
		this.cor = "Preta";
		this.espessura = 1.0;
		this.transparente = false;

	}

	public Caneta(Caneta caneta4) {
		this.marca = caneta4.getMarca();
		this.cor = caneta4.getCor();
		this.espessura = caneta4.getEspessura();
		this.transparente = caneta4.getTransparente();
	}

	@Override
	public String toString() {
		return String.format("{marca: %s, cor: %s, espessura: %.1f}", marca, cor, espessura);
	}

	public void setTransparente(boolean b) {
		this.transparente = b;

	}
}