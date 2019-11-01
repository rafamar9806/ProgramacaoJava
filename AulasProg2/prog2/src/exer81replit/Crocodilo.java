package exer81replit;


public class Crocodilo extends Animal {

	private final String familia="Crocodylidae";
	private static int quantidade = 0;
	
	 public Crocodilo() {
		super("crocodilo: " + (++quantidade));
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getFamilia() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "Crocodilo [familia=" + familia + "]";
	}
	
	
	

}
