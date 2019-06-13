public class MatrizTeste {
  public static void main(String[] args) {
    Matriz m1 = new Matriz(2, 2);
    Matriz m2 = new Matriz(2, 2);
    // m1.setMatriz();
    // m2.setMatriz();

    m1.setMatriz();
    m1.printMatriz();
    m2.setMatriz();
    m2.printMatriz();
    // Matriz.transposta(m1);
    // Matriz.printMatriz(m1);
    // Matriz.matrizNula(m1);
    // Matriz.printMatriz(m1);
    // Matriz.matrizOposta(m1);
    // Matriz.printMatriz(m1);

    int[][] soma = Matriz.somarMatrizes(m1.getMatriz(), m2.getMatriz());
    Matriz.printMatriz(soma);
  }
}