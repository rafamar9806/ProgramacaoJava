public class MatrizTeste {
  public static void main(String[] args) {
    int [][] m1 = {{1,4,5},{2,2,2}};
    int [][] m2 = {{9,1,2},{3,8,2}};

    Matriz mm1 = new Matriz(m1);
    Matriz mm2 = new Matriz(m2);

    Matriz.printMatriz(m1); 
    Matriz.printMatriz(m2);

    int [][] transposta =  Matriz.transposta(mm1);
    Matriz.printMatriz(transposta);

    int [][] oposta =  Matriz.matrizOposta(mm2);
    Matriz.printMatriz(oposta);

    int [][] nula =  Matriz.matrizNula(mm2);
    Matriz.printMatriz(nula);

  }
}