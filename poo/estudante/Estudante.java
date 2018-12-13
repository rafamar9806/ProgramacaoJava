

public class Estudante {
	private static final int NUM_DISCIPLINAS = 6;
	private String nome;
	private int numEstudante;
	private double [] notas = new double[NUM_DISCIPLINAS];

	public Estudante(String nome, int numEstudante){
		this.nome = nome;
		this.numEstudante = numEstudante;
	}

	public void adicionaNota(double nota, int disciplina){

		if (disciplina >= 0 && disciplina <=5) {
			for (int i = 0;i < notas.length ;i++ ) {
				if (notas[i] == 0.0) {
					notas[disciplina] = nota;

				}

			}


		}

	}
	public double [] getNotas(){
		return this.notas;
	}

	public double getMaiorNota(){
		double maiorNota = -1.0;
		double aux = 0.0;
		if (notas != null) {
			for (int i = 0;i < notas.length ;i++ ) {
				aux = notas[i];

				if (maiorNota < aux) {
					maiorNota = notas[i];
				}
			}
			
		}
		return maiorNota;
	}




	public boolean igualnota(Estudante outroEstudante, int disciplina){
		if (outroEstudante!=null) {
			for (int i = 0;i < notas.length ;i++ ) {
				if (notas[disciplina] == (outroEstudante.getNotas()[disciplina])) {
					return true;

				}
				else
					return false;


			}


		}
		return false;


	}

   /* public double maiorNota(Estudante notas){

   }*/
   public void imprimeNota(){
   	if (notas != null) {
   		for (double nota :notas ) {
   			System.out.print(nota + " ");

   		}
   		System.out.println();

   	}

   }
}


