package exer50;

public class Tempo implements Comparable<Tempo> {
	private int horas;
	public int minutos;
	public int segundos;

	public Tempo() {

	}

	public Tempo(Tempo p) {

	}

	public Tempo(int horas, int minutos, int segundos) throws IllegalAccessException {
		if(horas<0) {
			throw new IllegalAccessException("hora fora dos limites");
		}
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	@Override
	public int compareTo(Tempo o) {
		if(this.horas<o.horas) {
			return -1;
		}else if(this.horas>o.horas) {
			return 1;
		}else {
			compareMinutos(o);
		}
		return 0;
	}

	private int compareMinutos(Tempo o) {
		if(this.minutos < o.minutos) {
			return -1;
		}else if(this.minutos>o.minutos) {
			return 1;
		}else {
			compararSegundos(o);
		}
		return 0;
		
	}

	private int compararSegundos(Tempo o) {
		if(this.segundos < o.segundos) {
			return -1;
		}else if(this.segundos > o.segundos) {
			return 1;
		}
		else {
			return 0;
		}
		
	}

	@Override
	public String toString() {
		return String.format("%d hora(s), %d minuto(s), %d segundo(s)", this.horas, this.minutos, this.segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tempo other = (Tempo) obj;
		if (horas != other.horas)
			return false;
		if (minutos != other.minutos)
			return false;
		if (segundos != other.segundos)
			return false;
		return true;
	}

}
