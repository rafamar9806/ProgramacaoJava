public class VTest{
	public static void main(String[] args) {
		Vetor v = new Vetor(4);
		Vetor x = new Vetor(4);


		int [] e = {48,3,2,1};
		int [] f = {4,3,2,1};


		v.preencheVetor(e);
		x.preencheVetor(f);



		v.print();
		x.print();

		System.out.println(v.produtoEscalarVetor(x));

		v.produtoEscalarVetor(x);
		

		//v.print();
	}
}