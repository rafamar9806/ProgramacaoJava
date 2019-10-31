package exer85replit;

import java.util.InputMismatchException;

public class Panda extends Animal implements Terrestre {
	private final String familia = "Ursidae";
	private static int quantidade = 0;
	private int caminhar;

	public Panda(int caminhar) {
		super("Panda");

		try {
			if (caminhar > 0 && caminhar < 6)
				try {
					this.caminhar = caminhar;

				} catch (IllegalArgumentException e) {
					System.out.println("tste");
				}
		} catch (IllegalArgumentException e) {

			e.printStackTrace();
		}

	}

	@Override
	public int caminhar() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public String getFamilia() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return String.format("Panda{familia=‎%s, id=Panda%d, caminhar:%d}", familia, ++quantidade, caminhar);
	}

}
