package exer81replit;


public class Zebra extends Animal{

	private final String familia="Equidae";
	private static int quantidade = 0;
	
	public Zebra() {
		super("zebra " + (++quantidade));
	}

	@Override
	public String getFamilia() {
		// TODO Auto-generated method stub
		return this.familia;
	}

	@Override
	public String toString() {
		return "Zebra [familia=" + familia + "]";
	}
	
	

}
