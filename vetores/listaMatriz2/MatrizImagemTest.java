
public class MatrizImagemTest{
	 public static void main(String[] args) {
// write your code here
       int [][]m = MatrizImagem.returnImgMatrix("mario1.jpg"); //transforma imagem jpg em matriz
       int [][]n = MatrizImagem.returnImgMatrix("mario2.jpg");
        
        int [][] soma = MatrizImagem.soma(m, n); //soma duas imagens
        MatrizImagem.saveImg(soma,"marioSomados.jpg");//gerando arquivo das imagens 

        int [][] subtracao = MatrizImagem.subtracao(m, n); //subtrai duas imagens
        MatrizImagem.saveImg(subtracao,"marioSSubtrai.jpg");//gerando arquivo das imagens 


        int [][] trans = MatrizImagem.transposta(m);//transposta da imagem
        MatrizImagem.saveImg(trans,"marioTransposta.jpg");

        int [][] multiplica = MatrizImagem.multiplicaEscalar(m, 5);//multiplicacao escalar
        MatrizImagem.saveImg(multiplica,"marioMultiplicaEscalar.jpg");


    //    for (int i = 0; i < m.length; i++) {
    //        for (int j = 0; j < m[i].length; j++) {
    //            trans[j][i] = m[i][j];
    //        }
    //    }

       
   }
}

