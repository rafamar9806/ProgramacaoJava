public enum Livros{
	HARRY("o prisioneiro de ascabn", 39.0),
	PANO("john wick", 89.0),
	CARRO("senhor dos aneis", 129.0),
	NOTA("de volta para o futuro", 39.0);

	private final String titulo;
	private final double preco;

	 Livros(String titulo, double preco){
		this.titulo = titulo;
		this.preco = preco;
	}

	public String getTitulo(){
		return this.titulo;
	}

	public double getPreco(){
		return this.preco;
	}
}
