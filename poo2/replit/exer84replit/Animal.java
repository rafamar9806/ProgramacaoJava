package exer84replit;


public abstract class Animal implements Comparable<Animal>{

	private String id;
	
	
	public abstract String getFamilia();

	public Animal(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	public int compareTo(Animal obj) {
		return getFamilia().compareTo(obj.getFamilia());
	}

	@Override
	public String toString() {
		return "Animal{familia=" + getFamilia() + ", id=" + getId()
				+ "}";
	}
	
	

}
