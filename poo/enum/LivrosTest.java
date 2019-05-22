public class LivrosTest{
	public static void main(String[] args) {
	for (Livros livros : Livros.values() ) {
		System.out.printf("%s\t%s\t%.2f \n",livros, livros.getTitulo(), livros.getPreco());
	}
}
}