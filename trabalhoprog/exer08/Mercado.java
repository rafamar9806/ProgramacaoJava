public class Mercado{
	public static void main(String[] args) {
		Estoque estoque = new Estoque(10);

		estoque.addProduto(12.0, 100, "Trigo");
		estoque.addProduto(1.0, 10, "Pão");
		estoque.addProduto(13, 3, "Arroz");
		estoque.addProduto(2.0, 40, "Sal");

		estoque.imprimirEstoque();
	}
}