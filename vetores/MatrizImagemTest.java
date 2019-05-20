public class MatrizImagemTest{
	 public static void main(String[] args) {
// write your code here
       int [][]m = MatrizImagem.returnImgMatrix("mario1.jpg");
       int [][]n = MatrizImagem.returnImgMatrix("mario2.jpg");

     	int img1 = MatrizImagem.somar(m);
     	int img2 = MatrizImagem.somar(n);

     	int [] ln = MatrizImagem.getRGBValuesFromInt(img1);
     	int [] col = MatrizImagem.getRGBValuesFromInt(img2);


       for(int i =0;i< m.length;i++)
       {
           for(int j=0;j<m[i].length;j++)
           {
               System.out.printf("%d",m[i][j]);
               m[i][j]= m[i][j]*10;
           }
           System.out.println();
       }
       MatrizImagem.saveImg(m,"mario5");
   }
}

