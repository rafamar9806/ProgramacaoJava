public class InvoiceTest{
	public static void main(String[] args) {
		Invoice fatura1 = new Invoice("123", "Processador", 5, 180.50);
		Invoice fatura2 = new Invoice("545", "gpu", 2, 0);

		fatura1.exibirInfoProduto();
		System.out.println("==========");
		fatura2.exibirInfoProduto();

	}
}