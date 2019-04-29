/*
Um atributo private double preco;
b) Um atributo private string nome;
c) Um atributo private int id;
d) Um método construtor que que recebe como parâmetro o nome e o preço do item.
e) Faça os métodos get e set para cada um dos atributos da classe.
f) Um método com a seguinte assinatura:
1
public boolean compara ( Item a ) ;
Que compara o item que invoca o método com o item que é passado por parâmetro,
devolve verdadeiro se os dois forem iguais e falso caso contrario.
g) Um método com a seguinte assinatura:
1
public boolen compara ( String a ) ;
Que compara a String a com a String nome do objeto que invoca o método, devolve
verdadeiro se são iguais e falso caso contrario.
h) Faça com que qualquer objeto da classe item saiba quantos objetos da classe item
foram criados.
i) Cada item deve ter um id único.
*/

public class Item{
	private double preco;
	private String nome;
	private int id;
	private static int numObjetos = 0;

	public Item(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
		numObjetos++;
	}

	public static int getNumObjetos(){
		return numObjetos;
	}

	public void setPreco(double preco){
		this.preco = preco;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getNome(){
		return this.nome;
	}

	public double getPreco(){
		return this.preco;
	}
	public int getId(){
		return this.id;
	}

	public boolean compara (Item a ){
		if (this.id == a.getId()) {
			return true;
		}else{
			return false;
		}
	}

	public boolean compara ( String a ){
		if (this.nome.equals(a)) {
			return true;
		}
		else{
			return false;
		}
	}


}