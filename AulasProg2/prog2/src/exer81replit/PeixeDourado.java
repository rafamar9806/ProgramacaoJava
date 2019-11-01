package exer81replit;


public class PeixeDourado extends Animal {

	private final String familia="Cyprinidae";
	private static int quantidade = 0;
	
	 public PeixeDourado() {
		 super("peixe dourado: "+(++quantidade));
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getFamilia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "PeixeDourado [familia=" + familia + "]";
	}
	
	
	
	
}
