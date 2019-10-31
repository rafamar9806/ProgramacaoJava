package exer84replit;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Zoologico {

	List<Animal> animais;

	List<Animal> ambienteTerrestre;
	List<Animal> ambienteAquatico;
	List<Animal> ambienteGeral;

	public Zoologico() {
		this.animais = new LinkedList<Animal>();

		this.ambienteTerrestre = new LinkedList<Animal>();
		this.ambienteAquatico = new LinkedList<Animal>();
		this.ambienteGeral = new LinkedList<Animal>();
	}

	public boolean addAnimal(Animal a) {
		if (a instanceof Terrestre && a instanceof Aquatico)
			return this.ambienteGeral.add(a);

		else if (a instanceof Aquatico)
			return this.ambienteAquatico.add(a);

		else if (a instanceof Terrestre)
			return this.ambienteTerrestre.add(a);

		return false;
	}

	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	public void ordenarAnimais() {
		Collections.sort(animais);
	}

	@Override
	public String toString() {
		return "Zoologico{ambienteTerrestre=" + ambienteTerrestre + ", ambienteAquatico=" + ambienteAquatico
				+ ", ambienteGeral=" + ambienteGeral + "}";
	}

}
