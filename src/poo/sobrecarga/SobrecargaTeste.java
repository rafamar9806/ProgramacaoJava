

public class SobrecargaTeste {
    public static void main(String[] args) {
    	Sobrecarga tipo1 = new Sobrecarga();
    	Sobrecarga tipo2 = new Sobrecarga(2454, "Rafael");
    	Sobrecarga tipo3 = new Sobrecarga("Rafael", 2332);

    	tipo1.setNome("construtor 1");
    	tipo1.setRg(4.7);

    	System.out.println("Nome: "+tipo1.getNome() + " Rg: " + tipo1.getRgDouble());
    	System.out.println("Nome: "+ tipo2.getNome() + " Rg: " + tipo2.getRg());
    	System.out.println("Nome: "+tipo3.getNome() + " Rg: " + tipo3.getRg());
    	
    }
}
